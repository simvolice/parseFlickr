package d;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import f.*;
import f.Set;
import g.GetPhotosUrl;
import g.Photo;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Moon on 25.03.2015 22:41
 */

public class Main {


    public static void main(String... args) throws Exception {





//Запрос коллекция по юзер айди и апи ключу, чтобы узнать все айди коллекций и айди альбомов
String jsonGetList = readUrl("https://api.flickr.com/services/rest/?method=flickr.collections.getTree&api_key=272e482b6f9f6a51a114150d61d9ec98&user_id=131128057%40N07&format=json&nojsoncallback=1");


        FlickrJson flickrJson = new FlickrJson();

        Flickr flickr = new Flickr();


         List<f.Photo> listCollections = new ArrayList<f.Photo>();


        Start starts = new Start();











        File writer = new File("C:\\Users\\Moon\\Desktop\\model");

        Gson gson = new Gson();

                GetCollectionByID fromJsonCollection = gson.fromJson(jsonGetList, GetCollectionByID.class);

for (Collection id : fromJsonCollection.getCollections().getCollection()) {

//Здесь пишем Id коллекции и ее тайтл и слаг в нижнем регистре.


    Integer index = 0;

    f.Photo collectionsOfAlbums = new f.Photo();
    List<Set> listAlbums = new ArrayList<Set>();



    collectionsOfAlbums.setSlug(id.getTitle().toLowerCase());
    collectionsOfAlbums.setTitle(id.getTitle());
    collectionsOfAlbums.setId(id.getId());


    collectionsOfAlbums.setSets(listAlbums);


    listCollections.add(collectionsOfAlbums);




   for (d.Set ret : id.getSet()){


//Здесь пишем айди альбома его тайтл слаг и фулСлаг

       f.Set albums = new Set();
       List<Photo_> photo_list = new ArrayList<Photo_>();

       albums.setId(ret.getId());
       albums.setFullSlug(id.getTitle().toLowerCase() + "/" + ret.getTitle().toLowerCase().replace(" ", "-"));
       albums.setTitle(ret.getTitle());
       albums.setSlug(ret.getTitle().toLowerCase().replace(" ", "-"));
       albums.setIndex(index++);






       albums.setPhotos(photo_list);



       listAlbums.add(albums);





       String jsonGetPhotos = readUrl("https://api.flickr.com/services/rest/?method=flickr.photosets.getPhotos&api_key=272e482b6f9f6a51a114150d61d9ec98&photoset_id="+ret.getId()+"&extras=url_k%2Curl_z%2Curl_b&media=photos&format=json&nojsoncallback=1");

       GetPhotosUrl modelPhotoSetByPhotoSetID = gson.fromJson(jsonGetPhotos, GetPhotosUrl.class);


       for (Photo der : modelPhotoSetByPhotoSetID.getPhotoset().getPhoto()) {




//Здесь пишем все по фоткам
           Photo_ photos = new Photo_();

           photos.setSrc(der.getUrlZ());
           photos.setIndex(index++);
           photos.setSlug(der.getId());




           photos.setNext("gffgf");
           photos.setPrev("fgfgf");


           photos.setId(der.getId());
           photos.setFullSlug(albums.getFullSlug() +"/"+ der.getId());




           photos.setSrcHighres(der.getUrlK());
           photos.setSrcHighresMobile(der.getUrlB());




           photo_list.add(photos);

















       }



   }




}

//Пост обработка, данные не изменяемые



        for (int i = 0; i < listCollections.size(); i++) {

            Integer albumIndex=0;


            for (int j = 0; j < listCollections.get(i).getSets().size(); j++) {

               albumIndex++;


                Integer photoIndex = 0;
Integer sizeAlbum = listCollections.get(i).getSets().size();

                for (int k = 0; k < listCollections.get(i).getSets().get(j).getPhotos().size(); k++) {



                    photoIndex++;



                if (listCollections.get(i).getSets().get(j).getIndex() == 0) {





         listCollections.get(i).getSets().get(j).setPrev(listCollections.get(i).getSets().get(sizeAlbum - 1).getPhotos().get(listCollections.get(i).getSets().get(sizeAlbum - 1).getPhotos().size() - 1).getFullSlug());

                    listCollections.get(i).getSets().get(j).setNext(listCollections.get(i).getSets().get(j).getPhotos().listIterator().next().getFullSlug());









                    if (k == 0) {


                        listCollections.get(i).getSets().get(j).getPhotos().get(0).setPrev(listCollections.get(i).getSets().get(j).getFullSlug());

                    }else {


                        listCollections.get(i).getSets().get(j).getPhotos().get(k).setPrev(listCollections.get(i).getSets().get(j).getPhotos().listIterator(k).previous().getFullSlug() );


                    }










if (listCollections.get(i).getSets().get(j).getPhotos().listIterator(photoIndex).hasNext()) {

    listCollections.get(i).getSets().get(j).getPhotos().get(k).setNext(listCollections.get(i).getSets().get(j).getPhotos().listIterator(photoIndex).next().getFullSlug());


} else if (listCollections.get(i).getSets().listIterator(albumIndex).hasNext()) {





    listCollections.get(i).getSets().get(j).getPhotos().get(k).setNext(listCollections.get(i).getSets().listIterator(albumIndex).next().getFullSlug());


}else {


    listCollections.get(i).getSets().get(j).getPhotos().get(k).setNext(listCollections.get(i).getSets().get(0).getFullSlug());



}





                }

               else {


                    listCollections.get(i).getSets().get(j).setNext(listCollections.get(i).getSets().get(j).getPhotos().listIterator().next().getFullSlug());

                    listCollections.get(i).getSets().get(j).setPrev(listCollections.get(i).getSets().get(j - 1).getPhotos().get(listCollections.get(i).getSets().get(j - 1).getPhotos().size() - 1).getFullSlug());




                    if (k == 0) {


                        listCollections.get(i).getSets().get(j).getPhotos().get(0).setPrev(listCollections.get(i).getSets().get(j).getFullSlug());

                    }else {


                        listCollections.get(i).getSets().get(j).getPhotos().get(k).setPrev(listCollections.get(i).getSets().get(j).getPhotos().listIterator(k).previous().getFullSlug() );


                    }




                    if (listCollections.get(i).getSets().get(j).getPhotos().listIterator(photoIndex).hasNext()) {


                        listCollections.get(i).getSets().get(j).getPhotos().get(k).setNext(listCollections.get(i).getSets().get(j).getPhotos().listIterator(photoIndex).next().getFullSlug());


                    } else if (listCollections.get(i).getSets().listIterator(albumIndex).hasNext()) {


                        listCollections.get(i).getSets().get(j).getPhotos().get(k).setNext(listCollections.get(i).getSets().listIterator(albumIndex).next().getFullSlug());


                    } else {


                        listCollections.get(i).getSets().get(j).getPhotos().get(k).setNext(listCollections.get(i).getSets().get(0).getFullSlug());


                    }
                }





                }




            }






        }




       for (f.Photo ph : listCollections) {

           if (ph.getId().contains("131106727-72157651678925075")) {





               starts.setId(ph.getId());
               starts.setSlug(ph.getSlug());
               starts.setTitle(ph.getTitle());
               starts.setSets(ph.getSets());




      }
     }



















        About about = new About();


        about.setH1("Timur Uteshbekov");

        about.setPersonal("Рассказ об авторе");
        about.setPreambula("Преамбульное вступление");
        about.setQuestions("Дополнительная инфа");
        about.setTitle("Обо мне");







        GeneralApp generalApp = new GeneralApp();




        generalApp.setTitle("Timur Uteshbekov");
        generalApp.setMenu("Menu");




        Item item = new Item();




        item.setPrev("Previus");
        item.setNext("Next");
        item.setPlay("Play");





        Meta meta = new Meta();



meta.setTitle("Timur Uteshbekov");
        meta.setDescription("Описание");
        meta.setImg("путь до картинки");












        Copy copy = new Copy();





        copy.setAbouts(about);

        copy.setGeneralApps(generalApp);

        copy.setItemList(item);
        copy.setMetaArrayList(meta);










        flickr.setIsIphone(false);
        flickr.setIsStart(false);
        flickr.setPath("/store");


        flickr.setCopies(copy);

        flickr.setMetaArrayList(meta);







        flickr.setStarts(starts);
        flickr.setPhotos(listCollections);

        flickrJson.setFlickr(flickr);

        String jsonToFile = gson.toJson(flickrJson);



        Writer out = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(writer), "UTF8"));




        out.append("var MODEL = ");
        out.append(jsonToFile);
        out.append(";");
        out.flush();
        out.close();





    }







    /**
     * @param urlString URL запрос к фликеру
     * @return Возвращает чистый JSON
     * @throws Exception
     */
    private static String readUrl(String urlString) throws Exception {
        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuilder buffer = new StringBuilder();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1)
                buffer.append(chars, 0, read);

            return buffer.toString();
        } finally {
            if (reader != null)
                reader.close();
        }
    }


}

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
String jsonGetList = readUrl("https://api.flickr.com/services/rest/?method=flickr.collections.getTree&api_key=272e482b6f9f6a51a114150d61d9ec98&user_id=66266013@N04&format=json&nojsoncallback=1");


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



    collectionsOfAlbums.setSlug(toTranslit(id.getTitle().toLowerCase()));




    collectionsOfAlbums.setTitle(toTranslit(id.getTitle()));




    collectionsOfAlbums.setId(id.getId());


    collectionsOfAlbums.setSets(listAlbums);


    listCollections.add(collectionsOfAlbums);




   for (d.Set ret : id.getSet()){


//Здесь пишем айди альбома его тайтл слаг и фулСлаг

       f.Set albums = new Set();
       List<Photo_> photo_list = new ArrayList<Photo_>();

       albums.setId(ret.getId());


       albums.setFullSlug(toTranslit(id.getTitle().toLowerCase()) + "/" + toTranslit(ret.getTitle().toLowerCase().replace(" ", "-")));


       albums.setTitle(toTranslit(ret.getTitle()));



       albums.setSlug(toTranslit(ret.getTitle().toLowerCase().replace(" ", "-")));



       albums.setIndex(index++);



       albums.setTitle2(ret.getTitle());





       albums.setPhotos(photo_list);



       listAlbums.add(albums);





       String jsonGetPhotos = readUrl("https://api.flickr.com/services/rest/?method=flickr.photosets.getPhotos&api_key=272e482b6f9f6a51a114150d61d9ec98&photoset_id="+ret.getId()+"&extras=url_k%2Curl_z%2Curl_h&media=photos&format=json&nojsoncallback=1");

       GetPhotosUrl modelPhotoSetByPhotoSetID = gson.fromJson(jsonGetPhotos, GetPhotosUrl.class);


       for (Photo der : modelPhotoSetByPhotoSetID.getPhotoset().getPhoto()) {




//Здесь пишем все по фоткам
           Photo_ photos = new Photo_();


           photos.setIndex(index++);
           photos.setSlug(der.getId());




           photos.setNext("gffgf");
           photos.setPrev("fgfgf");


           photos.setId(der.getId());
           photos.setFullSlug(albums.getFullSlug() + "/" + der.getId());



           photos.setSrc(der.getUrlZ());
           photos.setSrcHighres(der.getUrlK());
           photos.setSrcHighresMobile(der.getUrlH());




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

           if (ph.getId().contains("66233874-72157651565824598")) {







               starts.setId(ph.getId());
               starts.setSlug(ph.getSlug());
               starts.setTitle(ph.getTitle());
               starts.setSets(ph.getSets());




      }
     }



















        About about = new About();


        about.setH1("Timur Uteshbekov");


        about.setInquiries("Контакты: <br/><br/>E-mail: <a href=\"mailto:andreasstudio@mail.ru\">andreasstudio@mail.ru</a><br/>Vkontakte: <a href=\"https://vk.com/timuruteshbekov\" target=\"_blank\">vk.com/timuruteshbekov</a><br/>Facebook: <a href=\"https://www.facebook.com/timur.uteshbekov\" target=\"_blank\">facebook.com/timur.uteshbekov</a></br>Instagram: <a href=\"https://instagram.com/timuruteshbekov/\" target=\"_blank\">instagram.com/timuruteshbekov</a></br>");
        about.setPersonal("Сделано в <a href=\"http://www.growit.kz\" target=\"_blank\">GROW IT</a>.");
        about.setPreambula("Идеальный снимок только на 10% зависит от фотоаппаратуры и на 90% - от фотографа. Выбирая самые лучшие моменты и преподнося их с выгодными ракурсом, освещением и четкостью деталей, Тимур добивается результатов, которые по-настоящему захватывают дух. В репортажах, студийных портретах, корпоративных работах или свадебных фотографиях, работы Тимура всегда превосходят ожидания заказчика.");
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
















       listCollections.removeIf(x->x.getId().contains("66233874-72157651565824598"));


        flickr.setStarts(starts);
        flickr.setPhotos(listCollections);

        flickrJson.setFlickr(flickr);
        flickrJson.setCopy(copy);
        flickrJson.setMeta(meta);

        flickrJson.setIsIphone(false);
flickrJson.setIsStart(false);
flickrJson.setPath("/store");



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








//https://github.com/kremnef/tastika-tools/blob/master/src/main/java/ru/tastika/tools/string/Translit.java
    private static final String[] CHAR_TABLE = new String[81];
    private static final char START_CHAR = 'Ё';


    static {
        CHAR_TABLE['А' - START_CHAR] = "A";
        CHAR_TABLE['Б' - START_CHAR] = "B";
        CHAR_TABLE['В' - START_CHAR] = "V";
        CHAR_TABLE['Г' - START_CHAR] = "G";
        CHAR_TABLE['Д' - START_CHAR] = "D";
        CHAR_TABLE['Е' - START_CHAR] = "E";
        CHAR_TABLE['Ё' - START_CHAR] = "E";
        CHAR_TABLE['Ж' - START_CHAR] = "ZH";
        CHAR_TABLE['З' - START_CHAR] = "Z";
        CHAR_TABLE['И' - START_CHAR] = "I";
        CHAR_TABLE['Й' - START_CHAR] = "I";
        CHAR_TABLE['К' - START_CHAR] = "K";
        CHAR_TABLE['Л' - START_CHAR] = "L";
        CHAR_TABLE['М' - START_CHAR] = "M";
        CHAR_TABLE['Н' - START_CHAR] = "N";
        CHAR_TABLE['О' - START_CHAR] = "O";
        CHAR_TABLE['П' - START_CHAR] = "P";
        CHAR_TABLE['Р' - START_CHAR] = "R";
        CHAR_TABLE['С' - START_CHAR] = "S";
        CHAR_TABLE['Т' - START_CHAR] = "T";
        CHAR_TABLE['У' - START_CHAR] = "U";
        CHAR_TABLE['Ф' - START_CHAR] = "F";
        CHAR_TABLE['Х' - START_CHAR] = "H";
        CHAR_TABLE['Ц' - START_CHAR] = "C";
        CHAR_TABLE['Ч' - START_CHAR] = "CH";
        CHAR_TABLE['Ш' - START_CHAR] = "SH";
        CHAR_TABLE['Щ' - START_CHAR] = "SH";
        CHAR_TABLE['Ъ' - START_CHAR] = "D";
        CHAR_TABLE['Ы' - START_CHAR] = "Y";
        CHAR_TABLE['Ь' - START_CHAR] = "D";
        CHAR_TABLE['Э' - START_CHAR] = "E";
        CHAR_TABLE['Ю' - START_CHAR] = "U";
        CHAR_TABLE['Я' - START_CHAR] = "YA";

        for (int i = 0; i < CHAR_TABLE.length; i++) {
            char idx = (char) ((char) i + START_CHAR);
            char lower = new String(new char[]{idx}).toLowerCase().charAt(0);
            if (CHAR_TABLE[i] != null) {
                CHAR_TABLE[lower - START_CHAR] = CHAR_TABLE[i].toLowerCase();
            }
        }
    }


    /**
     * Переводит русский текст в транслит. В результирующей строке
     * каждая русская буква будет заменена на соответствующую английскую.
     * Не русские символы останутся прежними.
     *
     * @param text исходный текст с русскими символами
     * @return результат
     */
    public static String toTranslit(String text) {
        char charBuffer[] = text.toCharArray();
        StringBuilder sb = new StringBuilder(text.length());
        for (char symbol : charBuffer) {
            int i = symbol - START_CHAR;
            if (i >= 0 && i < CHAR_TABLE.length) {
                String replace = CHAR_TABLE[i];
                sb.append(replace == null ? symbol : replace);
            }
            else {
                sb.append(symbol);
            }
        }
        return sb.toString();
    }











}

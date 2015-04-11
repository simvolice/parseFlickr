
package f;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Flickr {

    @Expose
    private List<Photo> photos = new ArrayList<Photo>();
    @Expose
    private Start starts = new Start();








    @Expose
    private Boolean isIphone;

    @Expose
    private Boolean isStart;


    @Expose
    private String path;






    @SerializedName("copy")
    @Expose
    private
    Copy copies = new Copy();



    @SerializedName("meta")
    @Expose
    private
    Meta  metaArrayList = new Meta();













    /**
     * 
     * @return
     *     The photos
     */
    public List<Photo> getPhotos() {
        return photos;
    }

    /**
     * 
     * @param photos
     *     The photos
     */
    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }


    public Start getStarts() {
        return starts;
    }

    public void setStarts(Start starts) {
        this.starts = starts;
    }




    public Boolean isIphone() {
        return isIphone;
    }

    public void setIsIphone(Boolean isIphone) {
        this.isIphone = isIphone;
    }

    public Boolean isStart() {
        return isStart;
    }

    public void setIsStart(Boolean isStart) {
        this.isStart = isStart;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }


    public Copy getCopies() {
        return copies;
    }

    public void setCopies(Copy copies) {
        this.copies = copies;
    }


    public Meta getMetaArrayList() {
        return metaArrayList;
    }

    public void setMetaArrayList(Meta metaArrayList) {
        this.metaArrayList = metaArrayList;
    }


}

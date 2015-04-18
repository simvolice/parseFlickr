
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
    private Start start = new Start();


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
        return start;
    }

    public void setStarts(Start start) {
        this.start = start;
    }






}

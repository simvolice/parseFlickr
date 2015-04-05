
package f;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class Flickr {

    @Expose
    private List<Photo> photos = new ArrayList<Photo>();
    @Expose
    private List<Start> starts = new ArrayList<Start>();


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


    public List<Start> getStarts() {
        return starts;
    }

    public void setStarts(List<Start> starts) {
        this.starts = starts;
    }
}

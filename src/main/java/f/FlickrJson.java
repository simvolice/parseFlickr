
package f;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class FlickrJson {

    @Expose
    private Flickr flickr;



    @Expose
    private Copy copy;

    @Expose
    private Meta meta;



    @Expose
    private Boolean isIphone;

    @Expose
    private Boolean isStart;


    @Expose
    private String path;




    /**
     * 
     * @return
     *     The flickr
     */
    public Flickr getFlickr() {
        return flickr;
    }

    /**
     * 
     * @param flickr
     *     The flickr
     */
    public void setFlickr(Flickr flickr) {
        this.flickr = flickr;
    }

    public Copy getCopy() {
        return copy;
    }

    public void setCopy(Copy copy) {
        this.copy = copy;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
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
}

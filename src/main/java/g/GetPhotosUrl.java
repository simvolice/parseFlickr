
package g;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class GetPhotosUrl {

    @Expose
    private Photoset photoset;
    @Expose
    private String stat;

    /**
     * 
     * @return
     *     The photoset
     */
    public Photoset getPhotoset() {
        return photoset;
    }

    /**
     * 
     * @param photoset
     *     The photoset
     */
    public void setPhotoset(Photoset photoset) {
        this.photoset = photoset;
    }

    /**
     * 
     * @return
     *     The stat
     */
    public String getStat() {
        return stat;
    }

    /**
     * 
     * @param stat
     *     The stat
     */
    public void setStat(String stat) {
        this.stat = stat;
    }

}

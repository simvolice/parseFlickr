
package f;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.sun.istack.internal.Nullable;


//Альбом
@Generated("org.jsonschema2pojo")
public class Set  {

    @Expose
    private String fullSlug;
    @Expose
    private String id;
    @Expose
    private Integer index;
    @Expose
    @Nullable
    private String next;
    @Expose
    private List<Photo_> photos = new ArrayList<Photo_>();
    @Expose
    private String prev;
    @Expose
    private String slug;
    @Expose
    private String title;

    /**
     * 
     * @return
     *     The fullSlug
     */
    public String getFullSlug() {
        return fullSlug;
    }

    /**
     * 
     * @param fullSlug
     *     The fullSlug
     */
    public void setFullSlug(String fullSlug) {
        this.fullSlug = fullSlug;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The index
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * 
     * @param index
     *     The index
     */
    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * 
     * @return
     *     The next
     */
    public String getNext() {
        return next;
    }

    /**
     * 
     * @param next
     *     The next
     */
    public void setNext(String next) {
        this.next = next;
    }

    /**
     * 
     * @return
     *     The photos
     */
    public List<Photo_> getPhotos() {
        return photos;
    }

    /**
     * 
     * @param photos
     *     The photos
     */
    public void setPhotos(List<Photo_> photos) {
        this.photos = photos;
    }

    /**
     * 
     * @return
     *     The prev
     */
    public String getPrev() {
        return prev;
    }

    /**
     * 
     * @param prev
     *     The prev
     */
    public void setPrev(String prev) {
        this.prev = prev;
    }

    /**
     * 
     * @return
     *     The slug
     */
    public String getSlug() {
        return slug;
    }

    /**
     * 
     * @param slug
     *     The slug
     */
    public void setSlug(String slug) {
        this.slug = slug;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

}

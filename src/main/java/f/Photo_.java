
package f;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//Фотки
@Generated("org.jsonschema2pojo")
public class Photo_ {

    @Expose
    private String fullSlug;
    @Expose
    private String id;
    @Expose
    private Integer index;

    @Expose
    private String next;
    @Expose
    private String prev;
    @Expose
    private String slug;
    @Expose
    private String src;
    @SerializedName("src_highres")
    @Expose
    private String srcHighres;
    @SerializedName("src_highres_mobile")
    @Expose
    private String srcHighresMobile;



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
     *     The isVideo
     */


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
     *     The src
     */
    public String getSrc() {
        return src;
    }

    /**
     * 
     * @param src
     *     The src
     */
    public void setSrc(String src) {
        this.src = src;
    }

    /**
     * 
     * @return
     *     The srcHighres
     */
    public String getSrcHighres() {
        return srcHighres;
    }

    /**
     * 
     * @param srcHighres
     *     The src_highres
     */
    public void setSrcHighres(String srcHighres) {
        this.srcHighres = srcHighres;
    }

    /**
     * 
     * @return
     *     The srcHighresMobile
     */
    public String getSrcHighresMobile() {
        return srcHighresMobile;
    }

    /**
     * 
     * @param srcHighresMobile
     *     The src_highres_mobile
     */
    public void setSrcHighresMobile(String srcHighresMobile) {
        this.srcHighresMobile = srcHighresMobile;
    }

    /**
     * 
     * @return
     *     The videoDesktop
     */


}

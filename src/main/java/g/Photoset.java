
package g;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Photoset {

    @Expose
    private String id;
    @Expose
    private String primary;
    @Expose
    private String owner;
    @Expose
    private String ownername;
    @Expose
    private List<Photo> photo = new ArrayList<Photo>();
    @Expose
    private Integer page;
    @SerializedName("per_page")
    @Expose
    private String perPage;
    @Expose
    private String perpage;
    @Expose
    private Integer pages;
    @Expose
    private Integer total;
    @Expose
    private String title;

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
     *     The primary
     */
    public String getPrimary() {
        return primary;
    }

    /**
     * 
     * @param primary
     *     The primary
     */
    public void setPrimary(String primary) {
        this.primary = primary;
    }

    /**
     * 
     * @return
     *     The owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * 
     * @param owner
     *     The owner
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * 
     * @return
     *     The ownername
     */
    public String getOwnername() {
        return ownername;
    }

    /**
     * 
     * @param ownername
     *     The ownername
     */
    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    /**
     * 
     * @return
     *     The photo
     */
    public List<Photo> getPhoto() {
        return photo;
    }

    /**
     * 
     * @param photo
     *     The photo
     */
    public void setPhoto(List<Photo> photo) {
        this.photo = photo;
    }

    /**
     * 
     * @return
     *     The page
     */
    public Integer getPage() {
        return page;
    }

    /**
     * 
     * @param page
     *     The page
     */
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * 
     * @return
     *     The perPage
     */
    public String getPerPage() {
        return perPage;
    }

    /**
     * 
     * @param perPage
     *     The per_page
     */
    public void setPerPage(String perPage) {
        this.perPage = perPage;
    }

    /**
     * 
     * @return
     *     The perpage
     */
    public String getPerpage() {
        return perpage;
    }

    /**
     * 
     * @param perpage
     *     The perpage
     */
    public void setPerpage(String perpage) {
        this.perpage = perpage;
    }

    /**
     * 
     * @return
     *     The pages
     */
    public Integer getPages() {
        return pages;
    }

    /**
     * 
     * @param pages
     *     The pages
     */
    public void setPages(Integer pages) {
        this.pages = pages;
    }

    /**
     * 
     * @return
     *     The total
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * 
     * @param total
     *     The total
     */
    public void setTotal(Integer total) {
        this.total = total;
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

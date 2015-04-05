
package d;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class Collection {

    @Expose
    private String id;
    @Expose
    private String title;
    @Expose
    private String description;
    @Expose
    private String iconlarge;
    @Expose
    private String iconsmall;
    @Expose
    private List<Set> set = new ArrayList<Set>();

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

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The iconlarge
     */
    public String getIconlarge() {
        return iconlarge;
    }

    /**
     * 
     * @param iconlarge
     *     The iconlarge
     */
    public void setIconlarge(String iconlarge) {
        this.iconlarge = iconlarge;
    }

    /**
     * 
     * @return
     *     The iconsmall
     */
    public String getIconsmall() {
        return iconsmall;
    }

    /**
     * 
     * @param iconsmall
     *     The iconsmall
     */
    public void setIconsmall(String iconsmall) {
        this.iconsmall = iconsmall;
    }

    /**
     * 
     * @return
     *     The set
     */
    public List<Set> getSet() {
        return set;
    }

    /**
     * 
     * @param set
     *     The set
     */
    public void setSet(List<Set> set) {
        this.set = set;
    }

}

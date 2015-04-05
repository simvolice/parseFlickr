
package d;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class GetCollectionByID {

    @Expose
    private Collections collections;
    @Expose
    private String stat;

    /**
     * 
     * @return
     *     The collections
     */
    public Collections getCollections() {
        return collections;
    }

    /**
     * 
     * @param collections
     *     The collections
     */
    public void setCollections(Collections collections) {
        this.collections = collections;
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

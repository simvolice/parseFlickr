
package d;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class Collections {

    @Expose
    private List<Collection> collection = new ArrayList<Collection>();

    /**
     * 
     * @return
     *     The collection
     */
    public List<Collection> getCollection() {
        return collection;
    }

    /**
     * 
     * @param collection
     *     The collection
     */
    public void setCollection(List<Collection> collection) {
        this.collection = collection;
    }

}

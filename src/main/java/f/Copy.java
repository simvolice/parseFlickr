package f;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Moon on 06.04.2015 17:42
 */
public class Copy {


    @SerializedName("about")
    @Expose
    private
    About abouts = new About();


    @SerializedName("general")
    @Expose
    private
    GeneralApp generalApps = new GeneralApp();


    @SerializedName("item")
    @Expose
    private
    Item itemList = new Item();


    @SerializedName("meta")
    @Expose
    private
    Meta metaArrayList = new Meta();


    public About getAbouts() {
        return abouts;
    }

    public void setAbouts(About abouts) {
        this.abouts = abouts;
    }

    public GeneralApp getGeneralApps() {
        return generalApps;
    }

    public void setGeneralApps(GeneralApp generalApps) {
        this.generalApps = generalApps;
    }

    public Item getItemList() {
        return itemList;
    }

    public void setItemList(Item itemList) {
        this.itemList = itemList;
    }

    public Meta getMetaArrayList() {
        return metaArrayList;
    }

    public void setMetaArrayList(Meta metaArrayList) {
        this.metaArrayList = metaArrayList;
    }
}

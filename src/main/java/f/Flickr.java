
package f;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Flickr {

    @Expose
    private List<Photo> photos = new ArrayList<Photo>();
    @Expose
    private Start starts = new Start();



    @Expose
    private Integer activeMQ;

    @Expose
    private String baseUrl;

    @Expose
    private String base_url;

    @Expose
    private Boolean debug;


    @Expose
    private Boolean isIphone;

    @Expose
    private Boolean isStart;


    @Expose
    private String path;


    @SerializedName("config")
    @Expose
    private
    ConfigForApp configForApps = new ConfigForApp();



    @SerializedName("copy")
    @Expose
    private
    Copy copies = new Copy();


    @SerializedName("history")
    @Expose
    private
   History histories = new History();

    @SerializedName("meta")
    @Expose
    private
    Meta  metaArrayList = new Meta();


    @SerializedName("screen")
    @Expose
    private
    ScreenApp screenApps = new ScreenApp();










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


    public Start getStarts() {
        return starts;
    }

    public void setStarts(Start starts) {
        this.starts = starts;
    }

    public Integer getActiveMQ() {
        return activeMQ;
    }

    public void setActiveMQ(Integer activeMQ) {
        this.activeMQ = activeMQ;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getBase_url() {
        return base_url;
    }

    public void setBase_url(String base_url) {
        this.base_url = base_url;
    }

    public Boolean isDebug() {
        return debug;
    }

    public void setDebug(Boolean debug) {
        this.debug = debug;
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

    public ConfigForApp getConfigForApps() {
        return configForApps;
    }

    public void setConfigForApps(ConfigForApp configForApps) {
        this.configForApps = configForApps;
    }

    public Copy getCopies() {
        return copies;
    }

    public void setCopies(Copy copies) {
        this.copies = copies;
    }

    public History getHistories() {
        return histories;
    }

    public void setHistories(History histories) {
        this.histories = histories;
    }

    public Meta getMetaArrayList() {
        return metaArrayList;
    }

    public void setMetaArrayList(Meta metaArrayList) {
        this.metaArrayList = metaArrayList;
    }

    public ScreenApp getScreenApps() {
        return screenApps;
    }

    public void setScreenApps(ScreenApp screenApps) {
        this.screenApps = screenApps;
    }
}

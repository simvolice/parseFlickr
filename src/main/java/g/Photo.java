
package g;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Photo {

    @Expose
    private String id;
    @Expose
    private String secret;
    @Expose
    private String server;
    @Expose
    private Integer farm;
    @Expose
    private String title;
    @Expose
    private Integer isprimary;
    @Expose
    private Integer ispublic;
    @Expose
    private Integer isfriend;
    @Expose
    private Integer isfamily;
    @SerializedName("url_z")
    @Expose
    private String urlZ;
    @SerializedName("height_z")
    @Expose
    private String heightZ;
    @SerializedName("width_z")
    @Expose
    private String widthZ;

    @SerializedName("url_k")
    @Expose
    private String urlK;
    @SerializedName("height_k")
    @Expose
    private String heightK;
    @SerializedName("width_k")
    @Expose
    private String widthK;



    @SerializedName("url_h")
    @Expose
    private String urlH;
    @SerializedName("height_h")
    @Expose
    private String heightH;
    @SerializedName("width_h")
    @Expose
    private String widthH;

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
     *     The secret
     */
    public String getSecret() {
        return secret;
    }

    /**
     * 
     * @param secret
     *     The secret
     */
    public void setSecret(String secret) {
        this.secret = secret;
    }

    /**
     * 
     * @return
     *     The server
     */
    public String getServer() {
        return server;
    }

    /**
     * 
     * @param server
     *     The server
     */
    public void setServer(String server) {
        this.server = server;
    }

    /**
     * 
     * @return
     *     The farm
     */
    public Integer getFarm() {
        return farm;
    }

    /**
     * 
     * @param farm
     *     The farm
     */
    public void setFarm(Integer farm) {
        this.farm = farm;
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
     *     The isprimary
     */
    public Integer getIsprimary() {
        return isprimary;
    }

    /**
     * 
     * @param isprimary
     *     The isprimary
     */
    public void setIsprimary(Integer isprimary) {
        this.isprimary = isprimary;
    }

    /**
     * 
     * @return
     *     The ispublic
     */
    public Integer getIspublic() {
        return ispublic;
    }

    /**
     * 
     * @param ispublic
     *     The ispublic
     */
    public void setIspublic(Integer ispublic) {
        this.ispublic = ispublic;
    }

    /**
     * 
     * @return
     *     The isfriend
     */
    public Integer getIsfriend() {
        return isfriend;
    }

    /**
     * 
     * @param isfriend
     *     The isfriend
     */
    public void setIsfriend(Integer isfriend) {
        this.isfriend = isfriend;
    }

    /**
     * 
     * @return
     *     The isfamily
     */
    public Integer getIsfamily() {
        return isfamily;
    }

    /**
     * 
     * @param isfamily
     *     The isfamily
     */
    public void setIsfamily(Integer isfamily) {
        this.isfamily = isfamily;
    }

    /**
     * 
     * @return
     *     The urlZ
     */
    public String getUrlZ() {
        return urlZ;
    }

    /**
     * 
     * @param urlZ
     *     The url_z
     */
    public void setUrlZ(String urlZ) {
        this.urlZ = urlZ;
    }

    /**
     * 
     * @return
     *     The heightZ
     */
    public String getHeightZ() {
        return heightZ;
    }

    /**
     * 
     * @param heightZ
     *     The height_z
     */
    public void setHeightZ(String heightZ) {
        this.heightZ = heightZ;
    }

    /**
     * 
     * @return
     *     The widthZ
     */
    public String getWidthZ() {
        return widthZ;
    }

    /**
     * 
     * @param widthZ
     *     The width_z
     */
    public void setWidthZ(String widthZ) {
        this.widthZ = widthZ;
    }

    public String getUrlK() {
        return urlK;
    }

    public void setUrlK(String urlK) {
        this.urlK = urlK;
    }

    public String getHeightK() {
        return heightK;
    }

    public void setHeightK(String heightK) {
        this.heightK = heightK;
    }

    public String getWidthK() {
        return widthK;
    }

    public void setWidthK(String widthK) {
        this.widthK = widthK;
    }

    public String getUrlH() {
        return urlH;
    }

    public void setUrlH(String urlH) {
        this.urlH = urlH;
    }

    public String getHeightH() {
        return heightH;
    }

    public void setHeightH(String heightH) {
        this.heightH = heightH;
    }

    public String getWidthH() {
        return widthH;
    }

    public void setWidthH(String widthH) {
        this.widthH = widthH;
    }
}

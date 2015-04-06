package f;

import com.google.gson.annotations.Expose;

/**
 * Created by Moon on 06.04.2015 17:50
 */
public class Meta {


    @Expose
    private String description;


    @Expose
    private String img;


    @Expose
    private String title;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

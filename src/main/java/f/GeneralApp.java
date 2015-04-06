package f;

import com.google.gson.annotations.Expose;

/**
 * Created by Moon on 06.04.2015 17:49
 */
public class GeneralApp {


    @Expose
    private String menu;


    @Expose
    private String title;


    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

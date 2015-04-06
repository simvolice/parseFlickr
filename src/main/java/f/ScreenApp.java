package f;

import com.google.gson.annotations.Expose;

/**
 * Created by Moon on 06.04.2015 17:54
 */
public class ScreenApp {

    @Expose
    private Integer h;


    @Expose
    private Integer w;


    public Integer getH() {
        return h;
    }

    public void setH(Integer h) {
        this.h = h;
    }

    public Integer getW() {
        return w;
    }

    public void setW(Integer w) {
        this.w = w;
    }
}

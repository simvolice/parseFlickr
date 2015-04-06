package f;

import com.google.gson.annotations.Expose;

/**
 * Created by Moon on 06.04.2015 17:51
 */
public class History {


    @Expose
    private Boolean backFwd;


    public Boolean isBackFwd() {
        return backFwd;
    }

    public void setBackFwd(Boolean backFwd) {
        this.backFwd = backFwd;
    }
}

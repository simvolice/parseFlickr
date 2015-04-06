package f;

import com.google.gson.annotations.Expose;

/**
 * Created by Moon on 06.04.2015 17:38
 */
public class ConfigForApp {


    @Expose
    private Boolean isFirstRun;


    public Boolean isFirstRun() {
        return isFirstRun;
    }

    public void setIsFirstRun(Boolean isFirstRun) {
        this.isFirstRun = isFirstRun;
    }
}

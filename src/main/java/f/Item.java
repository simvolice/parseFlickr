package f;

import com.google.gson.annotations.Expose;

/**
 * Created by Moon on 06.04.2015 17:49
 */
public class Item {


    @Expose
    private String next;

    @Expose
    private String prev;


    @Expose
    private String play;


    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrev() {
        return prev;
    }

    public void setPrev(String prev) {
        this.prev = prev;
    }

    public String getPlay() {
        return play;
    }

    public void setPlay(String play) {
        this.play = play;
    }
}

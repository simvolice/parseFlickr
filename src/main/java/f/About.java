package f;

import com.google.gson.annotations.Expose;

/**
 * Created by Moon on 06.04.2015 17:46
 */
public class About {


    @Expose
    private String h1;

    @Expose
    private String questions;

    @Expose
    private String personal;


    @Expose
    private String preamble;


    @Expose
    private String inquiries;


    @Expose
    private String title;


    public String getH1() {
        return h1;
    }

    public void setH1(String h1) {
        this.h1 = h1;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public String getPersonal() {
        return personal;
    }

    public void setPersonal(String personal) {
        this.personal = personal;
    }

    public String getPreambula() {
        return preamble;
    }

    public void setPreambula(String preamble) {
        this.preamble = preamble;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInquiries() {
        return inquiries;
    }

    public void setInquiries(String inquiries) {
        this.inquiries = inquiries;
    }
}

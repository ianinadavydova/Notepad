import java.util.Date;

public class Record {
    private Date creationDate = new Date();
    private String title;
    private String content;

    public Record(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Record(String title) {
        this.title = title;
        this.content = "";
    }
}

import java.util.Date;

public class Record {
    private Date creationDate = new Date();
    private Date modificationDate = new Date();
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

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void updateContent(String content) {
        this.content = content;
        this.modificationDate = new Date();
    }

    @Override
    public String toString() {
        return title.toUpperCase() + "\n" + content + "\n" + "Created: " + creationDate.toString() + "\n" + "Edited: " + modificationDate.toString();
    }
}

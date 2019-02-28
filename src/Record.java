import java.util.Date;

public class Record {
    private Date creationDate;
    private Date modificationDate;
    private String title;
    private String content;

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
        return String.format(
                "%s\n" +
                "%s\n" +
                "Created: %s\n" +
                "Edited: %s",
                title.toUpperCase(), content, creationDate, modificationDate);
    }

    public Record(String title, String content) {
        this.title = title;
        this.content = content;
        creationDate = new Date();
        modificationDate = creationDate;
    }

    public Record(String title) {
        this(title, "");
    }
}

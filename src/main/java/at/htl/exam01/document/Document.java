package at.htl.exam01.document;

public class Document {

    private String author;

    public Document(){
    }

    public Document(String author) {
        this.author = author;
    }

    // region Getter and Setter
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    // endregion



}

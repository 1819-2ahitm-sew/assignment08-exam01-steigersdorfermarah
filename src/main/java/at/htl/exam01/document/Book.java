package at.htl.exam01.document;

public class Book extends Document {

    String title;

    public Book(String title) {
        this.title = title;
    }

    public Book(){
    }

    public Book(String author, String title) {
        super(author);
        this.title = title;
    }


    // region Getter and Setter

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //endregion


    @Override
    public String toString() {
        return String.format("Book: %s, %s" ,getAuthor() , getTitle());
    }
}

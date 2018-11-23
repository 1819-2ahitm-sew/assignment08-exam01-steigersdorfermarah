package at.htl.exam01.document;

public class Email extends Document {

    String subject;
    String to;

    public Email(String subject, String to) {
        this.subject = subject;
        this.to = to;
    }

    public Email(String author, String subject, String to) {
        super(author);
        this.subject = subject;
        this.to = to;
    }

    // region Getter and Setter

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }


    // endregion

}

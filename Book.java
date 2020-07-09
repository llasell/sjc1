
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    private String content="";
    private String title="";
    private  String author="";

    public Book(String title) {
        this.title = title;
    }

    public String getBookInfo() {
        return "Book '" + title + "', by " + author + ": " +  content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

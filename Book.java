
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book 
{
    private String myContent="";
    private String title="";

    public Object getContent() {
        return title + ": " +  myContent;
    }

    public void setMyContent(String content) {
        this.myContent = content;
    }

    public Book(String title) {
        this.title = title;
    }
    
}

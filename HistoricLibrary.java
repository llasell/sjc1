
/**
 * This is an ancient library or a modern library with ancient books 
 * It contains books, but no one is allowed to check them out
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HistoricLibrary extends Library
{
    // instance variables - replace the example below with your own
    private int yearCreated;

    /**
     * Constructor for objects of class HistoricLibrary
     */
    public HistoricLibrary(String libraryName)
    {
        super(libraryName);
    }

    
    public int getYearCreated() {
        return yearCreated;
    }
    public void setYearCreated(int year) {
        this.yearCreated = year;
    }
    
    
     /**
     * Don't allow anyone to check out a historic book!
     * @param title
     * @return always nothing!
     */
    public Book checkoutBook(String title) {
        //look through all of the books in my collection
        for (Book aBook : books ) {
            if (aBook.getTitle().equalsIgnoreCase(title)){
                       System.out.println(title + "Is In the collection but YOU ARE NOT ALLOWED TO CHECK OUT THIS OUT");
            }
        }
        return null;  //always
    }
    
}

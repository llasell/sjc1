import java.util.Vector;

/**
 * Write a description of class Library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Library
{
    private String libraryName = "";
    private Vector<Book> books = new Vector<>();

    public Library(String name)
    {
        libraryName = name;
    }

    public void addBook(Book book) {
        books.add(book);
    }
    
    public void showInventory() {
        System.out.println("Library "+ libraryName);
        for (Book aBook : books ) {
          System.out.println(aBook.getContent());
        }
    }
    
    public static void main(String args[]) {
        Library library = new Library("Annapolis Library");

        Book warAndPeace = new Book("War and Peace");
        Book prideAndPrejudice = new Book("Pride and Prejudice");
        Book lestat = new Book("The Vampire Lestat");

        library.addBook( warAndPeace);
        library.addBook(prideAndPrejudice);
        library.addBook(lestat);
        
        library.showInventory();

    }

}

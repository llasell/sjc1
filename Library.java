import java.util.Vector;

/**
 * This is a library, which contains books and allows a user to add and check out the books
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

    public void addBookToInventory(Book book) {
        books.add(book);
    }

    /**
     * Return a book from this library if the title exists in my collection.
     * @param title
     * @return a book with that title or null if no book exists
     */
    public Book checkoutBook(String title) {
        Book foundBook = null;
        //look through all of the books in my collection
        for (Book aBook : books ) {
            if (aBook.getTitle().equalsIgnoreCase(title)){
                foundBook = aBook;  //grab the first book that matches my title
                break;
            }
        }
        return foundBook;
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
        warAndPeace.setAuthor("Leo Tolstoy");
        warAndPeace.setContent("WELL, PRINCE, Genoa and Lucca are now no more than private estates of the Bonaparte family. No, I warn you, that if you do not tell me we are at war, if you again allow yourself to palliate all the infamies and atrocities of this Antichrist (upon my word, I believe he is), I don't know you in future, you are no longer my friend, no longer my faithful slave, as you say. There, how do you do, how do you do? I see I'm scaring you, sit down and talk to me.\"");

        Book prideAndPrejudice = new Book("Pride and Prejudice");
        prideAndPrejudice.setAuthor("Jane Austen");
        prideAndPrejudice.setContent("It is a truth universally acknowledged, that a single man in possession of a good fortune, must be in want of a wife");

        Book lestat = new Book("The Vampire Lestat");
        lestat.setContent("Anne Rice");
        lestat.setContent("Very few beings really seek knowledge in this world. Mortal or immortal, few really ask. On the contrary, they try to wring from the unknown the answers they have already shaped in their own minds -- justifications, confirmations, forms of consolation without which they can't go on. To really ask is to open the door to the whirlwind. The answer may annihilate the question and the questioner.");

        library.addBookToInventory( warAndPeace);
        library.addBookToInventory(prideAndPrejudice);
        library.addBookToInventory(lestat);


        library.showInventory();

    }

}

import java.util.*;

public class Library {

    private List<Book> books;

    public Library()
    {
        books = new ArrayList<>();
    }

    public void addBook(Book b)
    {
        books.add(b);
        System.out.println(" + The following book was added to the library: " + b);
    }

    public void deleteBook(int i)
    {
        Book b = books.get(i);
        books.remove(i);
        System.out.println(" - The following book was removed from the library: \n" + b);
    }

    public void listBooks()
    {
        System.out.println("\n The current list of books in the library is: ");
        for(Book b: books)
            System.out.println(" * " + b);
    }
}

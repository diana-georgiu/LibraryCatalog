import java.util.List;

public class Main {

    public static void main(String[] args) {

        Library l = new Library();

        l.addBook(new Novel("The Book Thief", 350, "Historical fiction"));
        l.addBook(new Novel("Where the Crawdads Sing", 150, "Literary fiction"));
        l.addBook(new Novel("The Gifts of Imperfection", 200, "Self-help"));
        l.addBook(new Album("Perspectives on Degas", 200, "Silk coated paper"));
        l.addBook(new Album("Impressionism: Reimagining Art", 400, "Gloss coated paper"));
        l.listBooks();
        System.out.println();

        l.deleteBook(2);
        l.listBooks();
    }
}

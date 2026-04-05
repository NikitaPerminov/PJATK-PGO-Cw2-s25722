import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    Book book = new Book("The Hobbit", "Nikita P", 78, true);
    Book book2 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 100, true);
    Book book3 = new Book("The Hunger Games", "Suzanne Collins", 300, true);

    Library Library = new Library();
    Library.addBook(book);
    Library.addBook(book2);
    Library.addBook(book3);

    Reader reader = new Reader("John", "Doe", "1234567890123456", 0);
    Reader reader2 = new Reader("Jane", "Doe", "0987654321098765", 0);

        System.out.print("Enter book title to search: ");
        String titleToSearch = scanner.nextLine();
        Library.findBookTitle(titleToSearch);

        System.out.print("Enter book title to borrow: ");
        String titleToBorrow = scanner.nextLine();
        Library.borrowBook(titleToBorrow, reader);

        System.out.println("--------------------");
        Library.showAvailableBooks();
        Library.countAvailableBooks();

        System.out.print("Enter book title to return: ");
        String titleToReturn = scanner.nextLine();
        Library.returnBook(titleToReturn, reader);

        Library.countAvailableBooks();

    }

}

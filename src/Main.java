




public class Main {
    public static void main(String[] args){

    Book book = new Book("The Hobbit", "Nikita P", 78, true);

    book.showDetails();
    book.borrowBook();

    System.out.println("Book borrowed.");
    System.out.println("Thank you for using our service.");
        System.out.println("\t");

    book.setAvailable(!book.isAvailable());
    book.showDetails();
        System.out.println("\t");

    //book.borrowBook();

    book.returnBook();
    book.showDetails();
    System.out.println("Book returned.");
    System.out.println("Thank you for using our service.");

    }

}

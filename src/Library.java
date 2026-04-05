import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public Library(){
        books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public Book findBookByTitle(String title) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equalsIgnoreCase(title)) {
                return books.get(i);
            }
        }
        throw new IllegalArgumentException("Book with title \"" + title + "\" was not found.");
    }

    public void findBookTitle(String title) {
        Book foundBook = findBookByTitle(title);

        if (foundBook != null) {
            foundBook.showDetails();
        } else {
            System.out.println("Book with title \"" + title + "\" was not found.");
        }
    }

    public void borrowBook(String title, Reader reader) {
        Book foundBook = findBookByTitle(title);

        if (foundBook == null) {
            System.out.println("Book with title \"" + title + "\" was not found.");
            return;
        }

        if (!foundBook.isAvailable()) {
            System.out.println("Book \"" + title + "\" is already borrowed.");
            return;
        }

        foundBook.borrowBook();
        System.out.println("Book \"" + title + "\" has been borrowed by reader: " + reader.getName() + " " +reader.getLastName());
    }

    public void returnBook(String title, Reader reader) {
        Book foundBook = findBookByTitle(title);

        if (foundBook == null) {
            System.out.println("Book with title \"" + title + "\" was not found.");
            return;
        }

        foundBook.returnBook();
        System.out.println("Book \"" + title + "\" has been returned by reader: " + reader.getName() + " " + reader.getLastName());
    }

    public void showAvailableBooks(){
        for(int i = 0; i < books.size(); i++){
            if(books.get(i).isAvailable()){
                System.out.println("Title: " + books.get(i).getTitle());
                System.out.println("Author: " + books.get(i).getAuthor());
                System.out.println("-----------------------");
            }
        }
    }

    public void countAvailableBooks(){
        int count = 0;
        for(int i = 0; i < books.size(); i++){
            if(books.get(i).isAvailable()){
                count++;
            }
        }
        System.out.println("Number of available books: " + count);
    }




}

import java.util.Scanner;

public class Library {

    private Book[] books;
    private int numberOfBooks;

    public Library(int MaxSize){
        books = new Book[MaxSize];
    }
    public void addBook(Book book){
        books[numberOfBooks] = book;
        numberOfBooks++;
    }

    public void showavailableBooks(){
        for(int i = 0; i < numberOfBooks; i++){
            if(books[i].isAvailable()){
                books[i].showDetails();
            }
        }
    }

    public void findBookbyTitle(String title){
        Scanner findbyTitle = new Scanner(System.in);
        System.out.println("Enter the title of the book you want to find: ");
        title = findbyTitle.nextLine();
        for(int i = 0; i < numberOfBooks; i++){
            if(books[i].getTitle().equals(title)){
                books[i].showDetails();
            }
        }
    }

    public void countavailableBooks(){
        int count = 0;
        for(int i = 0; i < numberOfBooks; i++){
            if(books[i].isAvailable()){
                count++;
            }
        }
        System.out.println("Number of available books: " + count);
    }




}

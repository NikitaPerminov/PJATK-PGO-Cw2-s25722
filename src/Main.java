




public class Main {
    public static void main(String[] args){

    Book book = new Book("The Hobbit", "Nikita P", 78, true);
    Book book2 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 100, false);
    Book book3 = new Book("The Hunger Games", "Suzanne Collins", 300, true);

    Reader reader = new Reader("John", "Doe", "1234567890123456", 2);
    Reader reader2 = new Reader("Jane", "Doe", "0987654321098765", 3);


        System.out.println(book3.getTitle());
        System.out.println(reader2.getCardNumber());


    }

}

public class Reader {

    private String name;
    private String lastName;
    private String cardNumber;
    private int numberBorrowedBooks;

    public Reader(String name, String lastName, String cardNumber, int numberBorrowedBooks) {
        this.name = name;
        this.lastName = lastName;
        this.cardNumber = cardNumber;
        this.numberBorrowedBooks = numberBorrowedBooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {

            throw new IllegalArgumentException("Name cannot be null or empty.");

        }
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.isEmpty()) {

            throw new IllegalArgumentException("Last name cannot be null or empty.");

        }
        this.lastName = lastName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        if (cardNumber == null || cardNumber.isEmpty()) {
            throw new IllegalArgumentException("Card number cannot be null or empty.");
        }

        if (!cardNumber.matches("\\d+")) {
            throw new IllegalArgumentException("Card number must contain only digits.");
        }

        if (cardNumber.length() != 16) {
            throw new IllegalArgumentException("Card number must contain exactly 16 digits.");
        }

        this.cardNumber = cardNumber;
    }

    public int getNumberBorrowedBooks() {
        return numberBorrowedBooks;
    }

    public void setNumberBorrowedBooks(int numberBorrowedBooks) {
        this.numberBorrowedBooks = numberBorrowedBooks;
    }

    public void showDetails(){
        System.out.println("Name: " + name);
        System.out.println("Last name: " + lastName);
        System.out.println("Card number: " + cardNumber);
        System.out.println("Number of borrowed books: " + numberBorrowedBooks);
    }

    public void increaseNumberBorrowedBooks(){
        numberBorrowedBooks++;
    }
    public void decreaseNumberBorrowedBooks(){
        numberBorrowedBooks--;
    }
}

public class Book {

    private String title;
    private String author;
    private int pages;
    private boolean isAvailable;

    public Book(String title, String author, int pages, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.isEmpty()) {

            throw new IllegalArgumentException("Title cannot be null or empty.");

        }
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author == null || author.isEmpty()) {

            throw new IllegalArgumentException("Author cannot be null or empty.");

        }
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages <= 0) {

            throw new IllegalArgumentException("Pages cannot be less than or equal to 0.");

        }
        this.pages = pages;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void borrowBook(){
        if(!isAvailable) {
            throw new IllegalStateException("Book is already borrowed.");
        }
        isAvailable = false;
    }

    public void returnBook(){
        if(isAvailable){
            throw new IllegalStateException("Book is already available.");
        }
        isAvailable = true;
    }

    public void showDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Available: " + isAvailable);
    }
}

interface LibraryItem {
    String getTitle();
    String getAuthor();
    int getYear();
    boolean isAvailable();
}

class Book implements LibraryItem {
    private String title;
    private String author;
    private int year;
    private boolean available;

    public Book(String title, String author, int year, boolean available) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = available;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }
}

class Magazine implements LibraryItem {
    private String title;
    private String author;
    private int year;
    private boolean available;

    public Magazine(String title, String author, int year, boolean available) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = available;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        LibraryItem book = new Book("The Alchemist", "Paulo Coelho", 1988, true);
        LibraryItem magazine = new Magazine("National Geographic", "Various", 2023, false);

        System.out.println("Book Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Year: " + book.getYear());
        System.out.println("Available: " + book.isAvailable());

        System.out.println("\nMagazine Title: " + magazine.getTitle());
        System.out.println("Author: " + magazine.getAuthor());
        System.out.println("Year: " + magazine.getYear());
        System.out.println("Available: " + magazine.isAvailable());
    }
}
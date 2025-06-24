package DesignPatterns.CreationalPatterns.PrototypePattern;

public class Book implements IBook {
    private String title, author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Copy constructor using getters
    public Book(IBook book) {
        this.title = book.getTitle();
        this.author = book.getAuthor();
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public IBook clone() {
        return new Book(this);
    }
}

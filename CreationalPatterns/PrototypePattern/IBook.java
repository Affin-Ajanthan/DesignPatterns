package DesignPatterns.CreationalPatterns.PrototypePattern;

public interface IBook {
    public String getTitle();
    public String getAuthor();
    public IBook clone();

}

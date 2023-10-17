package session13_recap.challenges.oop.library_management_sys;

import java.util.UUID;

public class Book {
    private final String isbn = UUID.randomUUID().toString();
    private String title;
    private String publisher;
    private int copiesNumber;
    private Author author;

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getCopiesNumber() {
        return copiesNumber;
    }

    public void setCopiesNumber(int copiesNumber) {
        this.copiesNumber = copiesNumber;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title + "\nauthor: " + author + "ISBN: " + isbn + "\npublisher" + publisher + "\nnumber of copies: " + copiesNumber);
    }

    public void addCopy(){
        copiesNumber++;
    }
}

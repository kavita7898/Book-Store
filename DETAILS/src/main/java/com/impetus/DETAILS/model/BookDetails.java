package com.impetus.DETAILS.model;

public class BookDetails {
    int bookId;
    String title;
    String authorName;
    int numberOfPages;
    long price;

    public BookDetails() {
    }

    public BookDetails(int bookId, String title, String authorName, int numberOfPages, long price) {
        this.bookId = bookId;
        this.title = title;
        this.authorName = authorName;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}

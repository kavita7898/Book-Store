package com.impetus.PRODUCTPAGE.model;

public class BookStore {
    int bookId;
    String title;
    String authorName;
    int numberOfPages;
    double price;
    String reviews;
    int ratings;

    public BookStore() {
    }

    public BookStore(int bookId, String title, String authorName, int numberOfPages, double price, String reviews, int ratings) {
        this.bookId = bookId;
        this.title = title;
        this.authorName = authorName;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.reviews = reviews;
        this.ratings = ratings;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getReviews() {
        return reviews;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }
}

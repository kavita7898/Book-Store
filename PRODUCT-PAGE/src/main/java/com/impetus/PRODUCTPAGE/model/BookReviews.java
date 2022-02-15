package com.impetus.PRODUCTPAGE.model;

public class BookReviews {

    int bookId;
    String reviews;
    int ratings;

    public BookReviews() {
    }

    public BookReviews(int bookId, String reviews, int ratings) {
        this.bookId = bookId;
        this.reviews = reviews;
        this.ratings = ratings;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
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

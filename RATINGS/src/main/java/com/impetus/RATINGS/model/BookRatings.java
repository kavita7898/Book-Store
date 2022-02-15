package com.impetus.RATINGS.model;

public class BookRatings {
    int bookId;
    int ratings;


    public BookRatings() {
    }

    public BookRatings(int bookId, int ratings) {
        this.bookId = bookId;
        this.ratings = ratings;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }
}

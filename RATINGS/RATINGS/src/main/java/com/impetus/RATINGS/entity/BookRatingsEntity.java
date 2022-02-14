package com.impetus.RATINGS.entity;

import javax.persistence.*;

@Entity
@Table(name = "book_review")
public class BookRatingsEntity {

    @Id
    int bookId;
    int ratings;

    public BookRatingsEntity() {
    }

    public BookRatingsEntity(int bookId, int ratings) {
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

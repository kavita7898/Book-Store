package com.impetus.RATINGS.controller;

import com.impetus.RATINGS.model.BookRatings;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class BookRatingsController {

    @GetMapping("/{bookId}")
    public BookRatings getRatingsById(@PathVariable("bookId") int bookId)
    {
        List<BookRatings> bookRatingsList=new ArrayList<BookRatings>();
                bookRatingsList.add(new BookRatings(1,0));
        bookRatingsList.add(new BookRatings(2,5));
        bookRatingsList.add(new BookRatings(3,4));
        bookRatingsList.add(new BookRatings(4,3));
        bookRatingsList.add(new BookRatings(5,2));
        bookRatingsList.add(new BookRatings(6,1));
        bookRatingsList.add(new BookRatings(7,8));
        for (BookRatings bookRatings:bookRatingsList) {
            if (bookRatings.getBookId() == bookId)
                return bookRatings;
        }
        return null;
    }
}

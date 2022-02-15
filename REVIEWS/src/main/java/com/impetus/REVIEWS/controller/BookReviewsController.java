package com.impetus.REVIEWS.controller;
import com.impetus.REVIEWS.model.BookRatings;
import com.impetus.REVIEWS.model.BookReviews;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/reviews")
public class BookReviewsController {

    String bookRatingsURL="http://34.71.157.155/ratings/";
    private RestTemplate restTemplate=new RestTemplate();

    @GetMapping("/{bookId}")
    public BookReviews getReviewsById(@PathVariable("bookId") int bookId)
    {
        List<BookReviews> bookReviewsList=new ArrayList<BookReviews>();
        bookReviewsList.add(new BookReviews(1,"Nice",restTemplate.getForObject(bookRatingsURL+1,BookRatings.class).getRatings()));
        bookReviewsList.add(new BookReviews(2,"Nice",restTemplate.getForObject(bookRatingsURL+2,BookRatings.class).getRatings()));
        bookReviewsList.add(new BookReviews(3,"Nice",restTemplate.getForObject(bookRatingsURL+3,BookRatings.class).getRatings()));
        bookReviewsList.add(new BookReviews(4,"Nice",restTemplate.getForObject(bookRatingsURL+4,BookRatings.class).getRatings()));
        bookReviewsList.add(new BookReviews(5,"Nice",restTemplate.getForObject(bookRatingsURL+5,BookRatings.class).getRatings()));
        bookReviewsList.add(new BookReviews(6,"Nice",restTemplate.getForObject(bookRatingsURL+6,BookRatings.class).getRatings()));

        for (BookReviews bookReviews:bookReviewsList) {
            if (bookReviews.getBookId() == bookId)
                return bookReviews;
        }
        return null;
    }
}

package com.impetus.PRODUCTPAGE.controller;

import com.impetus.PRODUCTPAGE.model.BookDetails;
import com.impetus.PRODUCTPAGE.model.BookReviews;
import com.impetus.PRODUCTPAGE.model.BookStore;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/bookStore")
public class ProductPageController {
    String bookDetailsURL="http://34.135.14.219/BookDetails/";
    String bookReviewsURL="http://34.68.119.163/reviews/";

    private RestTemplate restTemplate=new RestTemplate();
    @GetMapping("/ViewAllBooks")
    public List<BookStore> getAllBooks()
    {
        ResponseEntity<BookDetails[]> response=restTemplate.getForEntity(bookDetailsURL+"/all",BookDetails[].class);
        List<BookStore> bookStores=new ArrayList<BookStore>();
        for (BookDetails bookDetails:response.getBody())
        {
            BookReviews bookReviews=restTemplate.getForObject(bookReviewsURL+bookDetails.getBookId(), BookReviews.class);
            BookStore bookStore=new BookStore(bookDetails.getBookId(),bookDetails.getTitle(),bookDetails.getAuthorName(),bookDetails.getNumberOfPages(),bookDetails.getPrice(),bookReviews.getReviews(),bookReviews.getRatings());
            bookStores.add(bookStore);
        }
       return bookStores;
    }

    @GetMapping("/findById/{bookId}")
    public BookStore findBookById(@PathVariable("bookId") String bookId)
    {
        BookReviews bookReviews=restTemplate.getForObject(bookReviewsURL+bookId,BookReviews.class);
        BookDetails bookDetails=restTemplate.getForObject(bookDetailsURL+"findById/"+bookId,BookDetails.class);
        BookStore bookStore=new BookStore(bookDetails.getBookId(),bookDetails.getTitle(),bookDetails.getAuthorName(),bookDetails.getNumberOfPages(),bookDetails.getPrice(),bookReviews.getReviews(),bookReviews.getRatings());
        return bookStore;
    }

    @GetMapping("/findByTitle/{title}")
    public BookStore findBookByTitle(@PathVariable("title") String title)
    {

        BookDetails bookDetails=restTemplate.getForObject(bookDetailsURL+title,BookDetails.class);
        BookReviews bookReviews=restTemplate.getForObject(bookReviewsURL+bookDetails.getBookId(),BookReviews.class);
        BookStore bookStore=new BookStore(bookDetails.getBookId(),bookDetails.getTitle(),bookDetails.getAuthorName(),bookDetails.getNumberOfPages(),bookDetails.getPrice(),bookReviews.getReviews(),bookReviews.getRatings());
        return bookStore;
    }
}

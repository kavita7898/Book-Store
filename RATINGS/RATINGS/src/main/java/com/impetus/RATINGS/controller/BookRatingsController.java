package com.impetus.RATINGS.controller;

import com.impetus.RATINGS.entity.BookRatingsEntity;
import com.impetus.RATINGS.model.BookRatings;
import com.impetus.RATINGS.repository.BookRatingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/ratings")
public class BookRatingsController {

    @Autowired
    BookRatingsRepository bookRatingsRepository;

    @GetMapping("/{bookId}")
    public BookRatings getRatingsById(@PathVariable("bookId") int bookId)
    {
        BookRatingsEntity bookRatingsEntity=bookRatingsRepository.findById(bookId).orElseThrow();
        BookRatings bookRatings=new BookRatings(bookRatingsEntity.getBookId(),bookRatingsEntity.getRatings());
        return bookRatings;
    }
}

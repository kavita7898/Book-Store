package com.impetus.DETAILS.controller;
import com.impetus.DETAILS.model.BookDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/BookDetails")
public class BookDetailsController {

    List<BookDetails> bookDetailsList =new ArrayList<BookDetails>();
    BookDetailsController(){
        bookDetailsList.add(new BookDetails(1,"The Guide","R.K.Narayan",150,200));
        bookDetailsList.add(new BookDetails(2,"Everuone has a story","Shavi sharma",167,250));
        bookDetailsList.add(new BookDetails(3,"Ramayan","Maharshi Valmiki",150,200));
        bookDetailsList.add(new BookDetails(4,"GEETA","Maharshi Vedvyas",150,200));
        bookDetailsList.add(new BookDetails(5,"Tell your story","Unknown",150,200));
        bookDetailsList.add(new BookDetails(6,"A kind of thing","Unknown",150,200));
    }

    @GetMapping("/all")
    public List<BookDetails> getAllBooks()
    {
        return bookDetailsList;
    }

    @GetMapping("/findById/{bookId}")
    public BookDetails getBookById(@PathVariable("bookId") int bookId)
    {
        for (BookDetails bookDetails:bookDetailsList)
        {
            if(bookDetails.getBookId()==bookId)
                return bookDetails;
        }
        return null;
    }

    @GetMapping("/findByTitle/{title}")
    public BookDetails getBookById(@PathVariable("title") String title)
    {
        for (BookDetails bookDetails:bookDetailsList)
        {
            if(bookDetails.getTitle().equals(title))
                return bookDetails;
        }
        return null;
    }
}

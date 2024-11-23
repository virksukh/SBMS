package in.india.controller;

import in.india.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookRestController {

    @GetMapping(value = "/book" , produces = "application/json")
    public ResponseEntity<Book> getBook(){
        Book b = new Book(101, "java", 1250.0);
        return new ResponseEntity<>(b, HttpStatus.OK);
    }

    @GetMapping(value = "/books", produces = "application/json")
    public ResponseEntity<List<Book>> getBooks(){
        List<Book> books = new ArrayList<Book>();
        books.add(new Book(101, "java", 1250.0));
        books.add(new Book(102, "devops", 1250.0));
        return new ResponseEntity<>(books, HttpStatus.OK);
    }
}

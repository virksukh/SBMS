package in.india.controller;
import in.india.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class BookRestController {

    @GetMapping(
            value = "/book",
            produces = {
                    "application/json"})
    public ResponseEntity<Book> getBook(){
        Book b = new Book(101,"java", 1250);
        return new ResponseEntity<>(b, HttpStatus.OK);
    }

    @GetMapping(
            value = "/books",
            produces = { "application/json", "application/xml"})
    public ResponseEntity<List<Book>> getBooks(){
        Book b1 = new Book(101,"java", 1250);
        Book b2 = new Book(103,"dsa", 1250);
        Book b3 = new Book(103,"microservices", 1250);
        List<Book> list = Arrays.asList(b1, b2, b3);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping(
            value = "/book",
            consumes = {
                    "application/json",
                    "application/xml"
            },
            produces = "text/plain")
    public ResponseEntity<String> addBook(@RequestBody Book book){
        System.out.println(book);
        return new ResponseEntity<>("success", HttpStatus.OK);
    }
}

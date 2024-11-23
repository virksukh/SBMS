package in.india.controller;
import in.india.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductRestConroller {

    @GetMapping("/product")
    public ResponseEntity<String> getProducts(@RequestParam("id") Integer id) {
        String msg = "";

        if(id==101){
            msg="Apple costs 2 lacs";
        }else if(id==102){
            msg="Apple costs 1 lacs";
        }else{
            msg="no product found";
        }
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<String> getProductsPrice(@PathVariable("id") Integer id) {
        String msg = "";

        if(id==101){
            msg="Samsung costs 2 lacs";
        }else if(id==102){
            msg="Samsung costs 1 lacs";
        }else{
            msg="no Samsung product found";
        }
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }

    @PostMapping(value ="/book", consumes = "application/json", produces = "text/plain")
    public ResponseEntity<String> addBook(@RequestBody Book book ){
        System.out.println(book);
        String msg = "book saved";
        return new ResponseEntity<>(msg, HttpStatus.CREATED);
    }
}

package in.india.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}

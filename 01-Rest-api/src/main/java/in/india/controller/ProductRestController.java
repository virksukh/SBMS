package in.india.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {

    @GetMapping("/product")
    public ResponseEntity<String> getProductInfo(@RequestParam("id") Integer id) {

        if(id == 101){
            return new ResponseEntity<>("Applle costs 2 lacs", HttpStatus.OK);
        }else  if(id == 102){
            return new ResponseEntity<>("Applle costs 1 lac", HttpStatus.OK);
        }else{
            return new ResponseEntity<>("no product found", HttpStatus.OK);
        }
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<String> getProductName(@PathVariable("id") Integer id) {

        if(id == 101){
            return new ResponseEntity<>("Samsung costs 2 lacs", HttpStatus.OK);
        }else  if(id == 102){
            return new ResponseEntity<>("Samsung costs 1 lac", HttpStatus.OK);
        }else{
            return new ResponseEntity<>("no Samsung product found", HttpStatus.OK);
        }
    }
}

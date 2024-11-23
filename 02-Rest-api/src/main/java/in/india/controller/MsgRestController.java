package in.india.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

    @GetMapping(value = "/welcome ", produces = "text/plain")
    public String getWelcomeMsg() {
        return "Welcome to Spring Boot";
    }

    @GetMapping(value = "/greet", produces = "text/plain")
    public ResponseEntity<String> getGreetMsg(){
        return new ResponseEntity<>("good morning",HttpStatus.OK);
    }

}

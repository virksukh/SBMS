package in.india.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

    @GetMapping(value = "/welcome", produces = "text/plain")
    public String getWelcomeMsg() {
        return "Welcome to Rest api";
    }

    @GetMapping(value = "/greet", produces = "text/plain")
    public ResponseEntity<String> getGreetMessage() {
        return new ResponseEntity<>("Rest apis are awesome", HttpStatus.OK);
    }
}

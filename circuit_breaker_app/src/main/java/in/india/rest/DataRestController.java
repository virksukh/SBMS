package in.india.rest;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataRestController {

    @GetMapping("/data")
    @CircuitBreaker(fallbackMethod = "getDataFromDB", name = "sukhdi")
    public String getDataFromRedis(){
        System.out.println("getDataFromRedis called");
        int i = 10 / 0;
        return "retreived from redis";
    }

    public String getDataFromDB(Throwable throwable){
        System.out.println("getDataFromDB called");
        return "retreived from DB";
    }

}

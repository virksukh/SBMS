package in.india.beans;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class ReportService {
    public ReportService() {
        System.out.println("Report Service constructor");
    }
    @PostConstruct
    public void init(){
        System.out.println("Report Service init() method");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Report Service destroy() method");
    }
}

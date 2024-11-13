package in.india.dao;
import org.springframework.stereotype.Component;

@Component
public class UserDao {

    public void connectToDatabase() {
        System.out.println("Inserting record in database.....");
    }
}

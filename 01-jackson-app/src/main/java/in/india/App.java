package in.india;
import com.fasterxml.jackson.databind.ObjectMapper;
import in.india.customer.Customer;
import java.io.File;
import java.io.IOException;

public class App {

    public void convertJavaToJson() throws IOException {
        File f = new File("customer.json");
        Customer c = new Customer();
        c.setId(101);
        c.setName("Sukhdeep");
        c.setPhone(3245234L);
        c.setGender("male");
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(f,c);
        System.out.println("Customer converted to JSON");
    }

    public void convertJsonToJava() throws IOException {
        File f = new File("customer.json");
        ObjectMapper mapper = new ObjectMapper();
        Customer cust = mapper.readValue(f, Customer.class);
        System.out.println("Customer converted to Java");
        System.out.println(cust);
    }
}

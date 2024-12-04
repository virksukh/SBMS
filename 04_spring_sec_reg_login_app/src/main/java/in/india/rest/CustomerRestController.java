package in.india.rest;
import in.india.entity.Customer;
import in.india.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/login")
    public ResponseEntity<String> loginCheck(@RequestBody Customer customer ){
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(customer.getEmail(),customer.getPwd());


        Authentication authenticate = authenticationManager.authenticate(authenticationToken);
        if (authenticate.isAuthenticated()) {
            return new ResponseEntity<>("Welcome to Ashok IT", HttpStatus.OK);
        }else {
            return new ResponseEntity<>("Invalid email or password", HttpStatus.UNAUTHORIZED);
        }

        return new ResponseEntity<>("invalid credentials",HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/register")
    public ResponseEntity<String> saveCustomer(@RequestBody Customer customer) {

        String encodedPwd = passwordEncoder.encode(customer.getPwd());
        customer.setPwd(encodedPwd);
        customerRepository.save(customer);
        return new ResponseEntity<>("Customer registered", HttpStatus.CREATED);
    }
}

package in.india.service;
import in.india.request.Passenger;
import in.india.response.Ticket;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

@Service
public class MMTService {

    private static final String BOOK_TICKET_URL = "https://classes.ashokit.in/ticket";
    private static final String ALL_TICKETS_URL = "https://classes.ashokit.in/tickets";



    @PostMapping("/ticket")
    public Ticket bookTicket(@RequestBody Passenger passenger) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Ticket> ticketResponseEntity = restTemplate.postForEntity(BOOK_TICKET_URL, passenger, Ticket.class);
        return ticketResponseEntity.getBody();
    }

    @GetMapping("/tickets")
    public Ticket[] getAllTickets() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Ticket[]> forEntity = restTemplate.getForEntity(ALL_TICKETS_URL, Ticket[].class);
        return forEntity.getBody();
    }

   /* @GetMapping("/tickets/{email}")
    public Ticket[] getTicketsEmail(@PathVariable String email) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Ticket[]> forEntity = restTemplate.getForEntity(ALL_TICKETS_URL + "/email/" + email, Ticket[].class);
        return forEntity.getBody();
    }*/
}

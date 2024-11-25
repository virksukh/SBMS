package in.india.service;
import in.india.request.Passenger;
import in.india.response.Ticket;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MakeMyTripService {

    private static final String BOOK_TICKET_URL = "https://classes.ashokit.in/ticket";
    private static final String ALL_TICKETS_URL = "https://classes.ashokit.in/tickets";


    public Ticket bookTicket(Passenger passenger) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Ticket> ticketResponseEntity = restTemplate.postForEntity(BOOK_TICKET_URL, passenger, Ticket.class);
        return ticketResponseEntity.getBody();
    }

    public Ticket[] getAllTickets() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Ticket[]> forEntity = restTemplate.getForEntity(ALL_TICKETS_URL, Ticket[].class);
        Ticket[] body = forEntity.getBody();
        return body;
    }

    public Ticket getTicketByEmail(String email) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://classes.ashokit.in/ticket"+"{"+ email + "}";
        ResponseEntity<Ticket> forEntity = restTemplate.getForEntity(url, Ticket.class);
        return forEntity.getBody();
    }
}

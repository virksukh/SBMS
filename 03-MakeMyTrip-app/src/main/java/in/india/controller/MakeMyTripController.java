package in.india.controller;
import in.india.request.Passenger;
import in.india.response.Ticket;
import in.india.service.MakeMyTripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MakeMyTripController {
    @Autowired
    private MakeMyTripService makeMyTripService;

    @GetMapping("/")
    public String index(Model model) {
        Ticket[] allTickets = makeMyTripService.getAllTickets();
        model.addAttribute("tickets", allTickets);
        return "index";
    }

    @GetMapping("/bookTicket")
    public String loadTicketBookingPage(Model model) {
        Passenger passenger = new Passenger();
        model.addAttribute("passenger", passenger);
        return "bookTicket";
    }

    @PostMapping("/ticket")
    public String handleTicketBooking(@ModelAttribute("passenger") Passenger passenger , Model model) {
        Ticket ticket = makeMyTripService.bookTicket(passenger);
        model.addAttribute("ticket", ticket);
        return "bookTicket";
    }
}

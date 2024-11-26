package in.india.controller;
import in.india.request.Passenger;
import in.india.response.Ticket;
import in.india.service.MMTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MMTController {

    @Autowired
    private MMTService mmtService;

    @GetMapping("/")
    public String index(Model model) {
        Ticket[] allTickets = mmtService.getAllTickets();
        model.addAttribute("tickets", allTickets);
        return "index";
    }

    @GetMapping("/bookticket")
    public String loadTicketBookingPage(Model model) {
        Passenger p = new Passenger();
        model.addAttribute("p", p);
        return "bookticket";
    }

    @PostMapping("/ticket")
    public String handleTicketBooking(@ModelAttribute("p") Passenger p , Model model) {
        Ticket ticket = mmtService.bookTicket(p);
        model.addAttribute("ticket", ticket);
        return "bookticket";
    }


}

package in.india.service;
import in.india.binding.Quote;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.Disposable;
import reactor.core.publisher.Mono;

@Service
public class QuoteService {
    private static final String API_URL = "https://dummyjson.com/quotes/random";

    public void getRandomQuote1() {
        WebClient webClient = WebClient.create();
        Mono<String> stringMono = webClient.get().uri(API_URL).retrieve().bodyToMono(String.class);
        String block = stringMono.block();
        System.out.println(block);
    }

    public void getRandomQuote2() {
        WebClient webClient = WebClient.create();
        Mono<Quote> quoteMono = webClient.get().uri(API_URL).retrieve().bodyToMono(Quote.class);
        Quote quote = quoteMono.block();
        System.out.println(quote.toString());
    }

    public void getRandomQuote3() {
        WebClient webClient = WebClient.create();
        System.out.println(" ====================Request sending start=======================");

        webClient.get().uri(API_URL).retrieve().bodyToMono(Quote.class).subscribe(response ->{
            // handle response
            System.out.println(response.toString());
        });

        System.out.println("====================Request sending end=====================");
    }
}



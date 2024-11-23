package in.india;
import lombok.Data;

@Data
public class Book {
    private Integer id;
    private String title;
    private Double price;

    public Book(Integer id, String title, Double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }
}

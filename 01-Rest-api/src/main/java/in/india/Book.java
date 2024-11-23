package in.india;
import lombok.Data;

@Data
public class Book {
    private Integer id;
    private String name;
    private Integer price;

    public Book(Integer id, String name, Integer price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Stock {
    public int id;
    public String companyName;
    public int numberOfUnits;
    public double price;
    public User user;
}

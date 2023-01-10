import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Company {
    public int id;
    public String companyName;
    public int stocks;
    public double price;
    public Date dateOfIncorporation;

}

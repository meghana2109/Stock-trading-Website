import java.util.Date;

public class MainClass {
    public static void main(String[] args) {
        User u1 = new User(01,"meg","m","meg123","123456",new Date(1993,10,9),"HMS Hisar");
        Company c1 = new Company(01,"Reliance Digitals Inc",3201,120.00,new Date(1970,12,21));
        Stock s1 = new Stock(01,c1.companyName,12,c1.price,u1);

        System.out.println("Stock Details : " + s1.user.firstName+ " "+s1.user.lastName );
        System.out.println("Company : "+s1.companyName);
        System.out.println("Number Of Units bought : "+s1.numberOfUnits );
        System.out.println("Price : "+s1.price);
    }
}

import java.util.ArrayList;
import java.util.List;

public class ProductTicketDataBase {
    public List<Saleable> productTicketList;

    public ProductTicketDataBase() {
        this.productTicketList = new ArrayList<>();
    }

    public void addProductTicket(Saleable saleable){
        this.productTicketList.add(saleable);
    }

    public double calcTotalEarnings(){
        Double totalEarnings = 0.0;
        for (Saleable pt: productTicketList){
            totalEarnings += pt.calculateTotal();
        }
        return totalEarnings;
    }
}

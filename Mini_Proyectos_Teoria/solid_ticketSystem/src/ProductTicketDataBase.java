import java.util.ArrayList;
import java.util.List;

public class ProductTicketDataBase {
    public List<ProductTicket> productTicketList;

    public ProductTicketDataBase() {
        this.productTicketList = new ArrayList<>();
    }

    public void addProductTicket(ProductTicket productTicket){
        this.productTicketList.add(productTicket);
    }

    public double calcTotalEarnings(){
        Double totalEarnings = 0.0;
        for (ProductTicket pt: productTicketList){
            totalEarnings += pt.calculateTotal();
        }
        return totalEarnings;
    }
}

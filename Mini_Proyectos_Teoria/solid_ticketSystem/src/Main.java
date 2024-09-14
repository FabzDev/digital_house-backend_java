import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductTicketDataBase productTicketDataBase = new ProductTicketDataBase();
        productTicketDataBase.addProductTicket(new ProductTicket("Banana", 10, 1.0));
        productTicketDataBase.addProductTicket(new ProductTicket("Chocolate", 1, 8.0));
        System.out.println("Total ventas: $" + productTicketDataBase.calcTotalEarnings());
    }
}

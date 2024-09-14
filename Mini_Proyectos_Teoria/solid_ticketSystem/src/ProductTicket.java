public class ProductTicket implements Saleable{
    public String productName;
    public Integer quantity;
    public Double price;

    public ProductTicket(String productName, Integer quantity, Double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public Double calculateTotal() {
        return quantity * price;
    }
}

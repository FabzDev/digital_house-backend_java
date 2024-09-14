public class ProductTicket {
    public String productName;
    public Integer quantity;
    public Double price;

    public ProductTicket(String productName, Integer quantity, Double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public Double calculateTotal(){
        return quantity * price;
    }


}

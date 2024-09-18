public class SingleProduct extends Product{
    private Double price;

    public SingleProduct(String name, Double price) {
        super(name);
        this.price = price;
    }

    @Override
    public Double calculatePrice() {
        return price;
    }
}

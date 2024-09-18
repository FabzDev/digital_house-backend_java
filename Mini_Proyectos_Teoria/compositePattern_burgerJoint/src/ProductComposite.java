import java.util.ArrayList;
import java.util.List;

public class ProductComposite extends Product{
    private List<Product> comboItems;
    private Double discount;

    public ProductComposite(String name, Double discount) {
        super(name);
        this.comboItems = new ArrayList<>();
        this.discount = discount;
    }

    public void addProductToCombo(Product prod){
        this.comboItems.add(prod);
    }

    @Override
    public Double calculatePrice() {
        Double totalWithoutDiscount = 0.0;
        for(Product comboProd:comboItems){
            totalWithoutDiscount += comboProd.calculatePrice();
        }
        return totalWithoutDiscount - (totalWithoutDiscount * discount);
    }
}

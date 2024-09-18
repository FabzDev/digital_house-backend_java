import java.util.ArrayList;
import java.util.List;

public class BurgerJoint {
    private List<Product> productCart;

    public BurgerJoint() {
        this.productCart = new ArrayList<>();
    }

    public Double calculateTotal(){
        Double total = 0.0;
        for(Product prod: productCart){
            total += prod.calculatePrice();
        }
        return total;
    }

    public void addProduct(Product prod){
        this.productCart.add(prod);
    }
}

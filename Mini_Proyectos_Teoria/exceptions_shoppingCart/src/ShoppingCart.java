import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> shoppingList;

    public ShoppingCart() {
        this.shoppingList = new ArrayList<Product>();
    }

    public void addToCart(Product prod) throws ShoppingCartException{
        if (prod == null)
            throw new ShoppingCartException("No es posible agregar Nulo a tu ShoppingCart");
        shoppingList.add(prod);
    }
}

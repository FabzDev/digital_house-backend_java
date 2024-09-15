import java.util.ArrayList;
import java.util.List;

public class CartShop {
    private List<Item> listItem;

    public CartShop() {
        this.listItem = new ArrayList<>();
    }

    public void addItemToCart(Item item){
        listItem.add(item);
    }

    public Double calculateTotal(){
        Double totalPrice = 0.0;
        for (Item item: listItem){
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
}

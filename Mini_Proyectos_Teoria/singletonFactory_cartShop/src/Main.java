public class Main {
    public static void main(String[] args) {
        ItemFactory itemFactory1 = ItemFactory.getInstance();
        CartShop cart = new CartShop();

        cart.addItemToCart(itemFactory1.createItem(1));
        cart.addItemToCart(itemFactory1.createItem(2));
        cart.addItemToCart(itemFactory1.createItem(3));

        cart.calculateTotal();

    }
}

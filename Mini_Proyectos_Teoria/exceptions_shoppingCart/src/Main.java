import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inicia programa");
        ShoppingCart fabioCart = new ShoppingCart();

        try {
            fabioCart.addToCart(new Product("TV TCL 65", 2699000.0));
            fabioCart.addToCart(new Product("SOPORTE TV 65", 99000.0));
            fabioCart.addToCart(null);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Termina programa");
    }
}

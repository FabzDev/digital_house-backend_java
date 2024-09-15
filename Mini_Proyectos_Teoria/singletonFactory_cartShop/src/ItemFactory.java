public class ItemFactory {

    private static ItemFactory instance;

    private ItemFactory() {}

    public static ItemFactory getInstance() {
        if (instance == null)
            instance = new ItemFactory();
        return instance;
    }

    public Item createItem(Integer id){
        switch (id){
            case 1:
                return new Item("Hamburguesa", 10.0);
            case 2:
                return new Item("Papas Fritas", 3.0);
            case 3:
                return new Item("Helado", 1.0);
            default:
                System.out.println("El id no existe");
                return null;
        }
    }
}

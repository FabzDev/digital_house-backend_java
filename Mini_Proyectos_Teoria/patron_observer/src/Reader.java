public class Reader implements Observer{

    private String name;

    public Reader(String name) {
        this.name = name;
    }

    @Override
    public void doSomethingWithNotification() {
        System.out.println(name + " is reading the new article");
    }
}

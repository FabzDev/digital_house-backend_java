public class Main {
    public static void main(String[] args) {

        User user1 = new User("Fabio");
        User user2 = new User("Yulieth");

        user1.spendMoney(500.0);
        user2.spendMoney(800.0);

        System.out.println(user1.compareTo(user2));

    }
}

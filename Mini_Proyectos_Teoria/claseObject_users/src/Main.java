public class Main {

    public static void main(String[] args) {
        User user1 = new User(1, "Fabio");
        User user2 = new User(2,"Yulieth");

        //ToString
        System.out.println(user1);
        System.out.println(user2.toString());

        //Equals
        System.out.println(user1.equals(user1));

        //Hashcode
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());

    }
}

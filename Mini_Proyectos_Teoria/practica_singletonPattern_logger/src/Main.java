public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.toLog("This is the first message");
        logger2.toLog("This is the second message");

        System.out.println(logger1==logger2);

        logger2.printLog();
    }
}

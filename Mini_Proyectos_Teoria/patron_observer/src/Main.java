public class Main {
    public static void main(String[] args) {
        Reader fabio = new Reader("Fabio Escobar");
        Reader alejandro = new Reader("Alejandro Escobar");

        Newspaper newspaper = new Newspaper();

        newspaper.addObserver(fabio);
        newspaper.addObserver(alejandro);
        newspaper.notifyObserver();
    }
}

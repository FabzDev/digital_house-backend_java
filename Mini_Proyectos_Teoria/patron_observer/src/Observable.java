public interface Observable {
    void notifyObserver();
    void addObserver(Observer obs);
    void removeObserver(Observer obs);
}

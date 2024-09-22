import java.util.ArrayList;
import java.util.List;

public class Newspaper implements Observable{

    private List<Observer> observerList;

    public Newspaper() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer obs) {
        observerList.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        observerList.remove(obs);
    }

    @Override
    public void notifyObserver() {
        for (Observer obs:observerList){
            obs.doSomethingWithNotification();
        }
    }
}

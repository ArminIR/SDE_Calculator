import java.util.ArrayList;
import java.util.List;

public class CalculatorSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyUpdate(double result) {
        for (Observer o : observers) {
            o.update(result);
        }
    }
}
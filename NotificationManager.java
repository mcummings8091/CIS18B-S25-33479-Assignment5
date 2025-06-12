
import java.util.ArrayList;
import java.util.List;

public class NotificationManager<T> {
    private List<Observer<? super T>> observers = new ArrayList<>(); // No generic lists allowed 
    
    public void addObserver(Observer<? super T> observer) {
        observers.add(observer);
    }

    // Notify observers
    public void notifyObservers(Notification<T> notification) {
        for (Observer<? super T> observer : observers) {
            ((Observer<T>) observer).update(notification);
        }
    }
} 
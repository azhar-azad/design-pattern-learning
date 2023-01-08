package books.head_first_design_patterns._02_observer;

public interface Subject {

    void registerObserver(Observer observer); // Both of these methods take an Observer as an argument - that's it,
    void removeObserver(Observer observer); // the Observer to be registered or removed.

    /**
     * This method is called to notify all observers
     * when the Subject's state has changed.
     */
    void notifyObservers();
}

package books.head_first_design_patterns._02_observer.weather;

/***
 * All our weather components implement the Observer
 * interface. This gives the Subject a common interface to
 * talk to when its come time to update the observers.
 */
public interface Observer {

    /***
     * The Observer interface is implemented by all observers, so they all
     * have to implement the update() method.
     * @param temp Temperature state
     * @param humidity Humidity state
     * @param pressure Pressure state
     */
    void update(double temp, double humidity, double pressure);
}

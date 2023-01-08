package books.head_first_design_patterns._02_observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observers; // An ArrayList to hold the Observers.
    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    /***
     * When an observer registers, we just add it to the end of the list.
     * @param observer Observer to register
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /***
     * When an observer wants to un-register, we just take if off the list.
     * @param observer Observer to remove
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /***
     * Here we tell all the observers about the state.
     * Because they are all Observers, we know they all implement update(),
     * so we know how to notify them .
     */
    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    /***
     * We notify the Observers when we get updated measurements
     * from the Weather Station.
     */
    public void measuresChanged() {
        notifyObservers();
    }

    /***
     * Rather than reading actual weather data off of a device, we're going to
     * use this method to test our display elements.
     * @param temperature actual temperature value
     * @param humidity actual humidity value
     * @param pressure actual pressure value
     */
    public void setMeasurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measuresChanged();
    }
}

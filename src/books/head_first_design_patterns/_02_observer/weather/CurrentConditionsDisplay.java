package books.head_first_design_patterns._02_observer.weather;

/***
 * This display implements the Observer interface, so it can get changes
 * from the WeatherData object.
 * It also implements the DisplayElement interface, because our API is
 * going to require all display elements to implement this interface.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{

    private double temperature;
    private double humidity;
    private WeatherData weatherData;

    /***
     * The constructor is passed the WeatherData object (the subject)
     * and use it to register the display as an observer.
     * @param weatherData as subject to the observer.
     */
    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    /***
     * When update() is called, we save the temperature and humidity
     * and call display().
     * @param temp Temperature state
     * @param humidity Humidity state
     * @param pressure Pressure state
     */
    @Override
    public void update(double temp, double humidity, double pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    /***
     * The display() method just prints out the most recent temperature and humidity.
     */
    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity.");
    }
}

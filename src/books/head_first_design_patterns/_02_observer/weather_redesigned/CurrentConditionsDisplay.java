package books.head_first_design_patterns._02_observer.weather_redesigned;

/***
 * This display implements the Observer interface, so it can get changes
 * from the WeatherData object.
 * It also implements the DisplayElement interface, because our API is
 * going to require all display elements to implement this interface.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

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
     */
    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
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

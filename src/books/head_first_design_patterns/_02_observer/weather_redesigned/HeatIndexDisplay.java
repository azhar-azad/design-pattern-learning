package books.head_first_design_patterns._02_observer.weather_redesigned;

public class HeatIndexDisplay implements Observer, DisplayElement {

    double headIndex = 0.0;
    private WeatherData weatherData;

    public HeatIndexDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        headIndex = computeHeatIndex(weatherData.getTemperature(), weatherData.getHumidity());
        display();
    }

    @Override
    public void display() {
        System.out.println("Heat Index is " + headIndex);
    }

    /***
     * The heat index is an index that combines the temperature and humidity to determine the apparent
     * temperature (how hot it actually feels). To compute the heat index, you take the temperature, T,
     * and the relative humidity, RH, and use the formula.
     * @param t Temperature value
     * @param rh Relative Humidity value
     * @return heatIndex
     */
    private double computeHeatIndex(double t, double rh) {
        return ((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh)
                + (0.00941695 * (t * t)) + (0.00728898 * (rh * rh))
                + (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
    }
}

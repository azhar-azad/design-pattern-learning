package practices.builder.carproduction.builders;

import practices.builder.carproduction.cars.CarType;
import practices.builder.carproduction.components.Engine;
import practices.builder.carproduction.components.GPSNavigator;
import practices.builder.carproduction.components.Transmission;
import practices.builder.carproduction.components.TripComputer;

/***
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {

    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}

package practices.builder.carproduction.cars;

import practices.builder.carproduction.components.Engine;
import practices.builder.carproduction.components.GPSNavigator;
import practices.builder.carproduction.components.Transmission;
import practices.builder.carproduction.components.TripComputer;

public class Manual {

    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(CarType carType, int seats, Engine engine, Transmission transmission,
               TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        StringBuilder info = new StringBuilder();
        info.append("Type of car: ").append(carType).append("\n");
        info.append("Count of seats: ").append(seats).append("\n");
        info.append("Engine: volume - ").append(engine.getVolume())
                .append("; mileage - ").append(engine.getMileage()).append("\n");
        info.append("Transmission: ").append(transmission).append("\n");
        if (this.tripComputer != null) {
            info.append("Trip Computer: Functional\n");
        } else {
            info.append("Trip Computer: N/A\n");
        }
        if (this.gpsNavigator != null) {
            info.append("GPS Navigator: Functional\n");
        } else {
            info.append("GPS Navigator: N/A\n");
        }

        return info.toString();
    }
}

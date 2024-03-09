package practices.builder.carproduction.components;

public class GPSNavigator {

    private String route;

    public GPSNavigator() {
        this.route = "841, Mirpur to Sher-e-Bangla Nagar, Dhaka";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}

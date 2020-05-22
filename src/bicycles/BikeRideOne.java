package bicycles;

public class BikeRideOne implements BikeRide {

    @Override
    public void ride(Bicycle bicycle) {
        bicycle.accelerate();
//        bicycle.stop();
    }
}

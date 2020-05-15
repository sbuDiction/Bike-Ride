package bicycles;

public class BikeRide {
    Bicycle bicycle = new Bicycle();
    BikeRide bikeRide = new BikeRide(bicycle);


    bikeRide.ride();
    System.out.println(bikeRide.currentSpeed());

    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }
}

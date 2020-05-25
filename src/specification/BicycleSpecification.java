package specification;


public class BicycleSpecification {

    private int accelerationSpeed;
    private int brakeSpeed;

    public BicycleSpecification(int accelerationSpeed, int brakeSpeed) {
        this.accelerationSpeed = accelerationSpeed;
        this.brakeSpeed = brakeSpeed;
    }

    public int getAccelerationSpeed(){
        return accelerationSpeed;
    }

    public int getBrakeSpeed() {
        return brakeSpeed;
    }
}

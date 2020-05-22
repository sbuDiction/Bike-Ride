package specification;


public class BicycleSpecification {

    private int accelerationSpeed;
    private int brakeSpeed;
    // add a variable for brakeSpeed

    public BicycleSpecification(int accelerationSpeed, int brakeSpeed) {
        this.accelerationSpeed = accelerationSpeed;
        this.brakeSpeed = brakeSpeed;
        // initialize brakeSpeed private variable
    }

    public int getAccelerationSpeed(){
        return accelerationSpeed;
    }

    public int getBrakeSpeed() {
        return brakeSpeed;
    }
    // add getters for brakeSpeed
}

package specification;

import bicycles.BicycleBase;

public class BicycleFromSpec extends BicycleBase {

    private int accelerationSpeed;
    private int brakeSpeed;

    public BicycleFromSpec(BicycleSpecification bicycleSpecification) {
        this.accelerationSpeed = bicycleSpecification.getAccelerationSpeed();
        this.brakeSpeed = bicycleSpecification.getBrakeSpeed();
    }

    @Override
    public void accelerate() {
        changeSpeed(this.accelerationSpeed);
    }

    @Override
    public void brake() {
        changeSpeed(- this.brakeSpeed);
    }
    
}

package specification;

import bicycles.BicycleBase;
import models.BicycleType;

public class BicycleFromSpec extends BicycleBase {

    private int accelerationSpeed;
    private int brakeSpeed;
    private BicycleType bicycleType;

    public BicycleFromSpec(BicycleSpecification bicycleSpecification) {
        this.accelerationSpeed = bicycleSpecification.getAccelerationSpeed();
        this.brakeSpeed = bicycleSpecification.getBrakeSpeed();
        this.bicycleType = bicycleSpecification.getBicycleType();
    }

    @Override
    public void accelerate() {
        changeSpeed(this.accelerationSpeed);
    }

    @Override
    public void brake() {
        changeSpeed(- this.brakeSpeed);
    }

    @Override
    public void stop() {
        accelerationSpeed = 0;
    }

    @Override
    public BicycleType getBicycleType() {
        return bicycleType;
    }


}

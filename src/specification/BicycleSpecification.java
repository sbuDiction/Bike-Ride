package specification;

import models.BicycleType;

<<<<<<< HEAD
public class    BicycleSpecification {
=======
public class BicycleSpecification {
>>>>>>> 43d820e39a812f90d9fe1e580619020cd2b5812b
    private int accelerationSpeed;
    private int brakeSpeed;
    private BicycleType bicycleType;

    public BicycleSpecification(int accelerationSpeed, int brakeSpeed, BicycleType bicycleType) {
        this.accelerationSpeed = accelerationSpeed;
        this.brakeSpeed = brakeSpeed;
        this.bicycleType = bicycleType;
    }

    public int getAccelerationSpeed(){
        return accelerationSpeed;
    }

    public int getBrakeSpeed() {
        return brakeSpeed;
    }

    public BicycleType getBicycleType(){
        System.out.println(bicycleType);
        return bicycleType;
    }
}

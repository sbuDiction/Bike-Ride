package bicycles.specification;

import bicycles.models.BicycleType;
import bicycles.models.RoadBike;


public class BicycleSpecification extends RoadBike {

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
        System.out.println(bicycleType + " type what");
        return bicycleType;
    }
}

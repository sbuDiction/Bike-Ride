package models;

import bicycles.BicycleBase;

public class MountainBike extends BicycleBase {
    private BicycleType bicycleType;

    @Override
    public void accelerate() {
            changeSpeed(5);
    }

    @Override
    public void brake() {
        changeSpeed(-4);

    }

    @Override
    public BicycleType getBicycleType() {
        return bicycleType;
    }


}

package models;

import bicycles.BicycleBase;

public class RoadBike extends BicycleBase {
    private BicycleType bicycleType;

    @Override
    public void accelerate () {
        changeSpeed(11);
    }

    @Override
    public void brake () {
        changeSpeed(-4);
    }

    @Override
    public BicycleType getBicycleType() {
        return bicycleType;
    }
}
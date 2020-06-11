package models;

import bicycles.BicycleBase;

public class Tandem extends BicycleBase {
    private BicycleType bicycleType;

    @Override
    public void accelerate() {
        changeSpeed(12);
    }

    @Override
    public void brake() {
        changeSpeed(-7);
    }

    @Override
    public BicycleType getBicycleType() {
        return bicycleType;
    }

}

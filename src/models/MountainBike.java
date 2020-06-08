package models;

import bicycles.BicycleBase;

public class MountainBike extends BicycleBase {

    @Override
    public void accelerate() {
            changeSpeed(5);
    }
    @Override
    public void brake() {
        changeSpeed(-4);

    }


}

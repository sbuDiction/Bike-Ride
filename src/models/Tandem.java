package models;

import bicycles.BicycleBase;

public class Tandem extends BicycleBase {

    public void accelerate() {
        changeSpeed(12);
    }

    public void brake() {
        changeSpeed(-7);
    }
}

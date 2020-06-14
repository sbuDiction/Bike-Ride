package bicycles.models;

import bicycles.BicycleBase;

public class Tandem extends BicycleBase {

    @Override
    public void accelerate() {
        changeSpeed(12);
    }

    @Override
    public void brake() {
        changeSpeed(-7);
    }

}

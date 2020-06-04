package ride;

import bicycles.Bicycle;
import models.BicycleType;

import java.util.ArrayList;

public class FunRide {
    private int bikesLimit;
    private ArrayList bikes = new ArrayList<Bicycle>();

    public FunRide(int bikesLimit) {
        this.bikesLimit = bikesLimit;
    }

    public void accept(Bicycle bicycle) {

    }

    public void getCountForType(BicycleType bicycleType) {}

    public void getEnteredCount() {}
}

package ride;

import bicycles.Bicycle;
import models.BicycleType;
import specification.BicycleSpecification;

import java.util.ArrayList;

public class FunRide {
    private int bikesLimit;
    private int count = 0;
    private ArrayList bikes = new ArrayList<Bicycle>();

    public FunRide(int bikesLimit) {
        this.bikesLimit = bikesLimit;

    }

    public void accept(BicycleType bicycle) {
        if (!bikes.contains(bicycle) && (bikes.size() < bikesLimit)) {
            bikes.add(bicycle);
            count++;
            System.out.println(bicycle + " bike added\nTotal " + count);
            System.out.println(bikes.contains(BicycleType.MountainBike));
        }
    }

    public void getCountForType(BicycleType bicycleType) {
        int count = 0;
    }

    public int getEnteredCount() {
        System.out.println(bikesLimit + " bikes are allowed.");
        return bikesLimit;
    }
}

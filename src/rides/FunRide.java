package rides;

import bicycles.Bicycle;
import models.BicycleType;

import java.util.ArrayList;

public class FunRide {
    private int bikesLimit;
    private int count = 0;
    private ArrayList<Bicycle> bikes = new ArrayList<Bicycle>();

    public FunRide(int bikesLimit) {
        this.bikesLimit = bikesLimit;

    }

    public boolean accept(Bicycle bicycle) {
        System.out.println(bicycle.getBicycleType() + " accept method");
        if ((bikes.size() < bikesLimit)) {
            bikes.add(bicycle);
            count++;
            System.out.println(count);
        }else {
            return false;
        }
        return true;
    }

    public int getCountForType(BicycleType bicycleType) {
        int countFor = 0;
        System.out.println(bikes);
        for (Bicycle object : bikes) {
            if (object.getBicycleType() == bicycleType) {
                countFor++;
            }
        }
        return countFor;
    }

    public int getEnteredCount() {
        return bikes.size();
    }

}

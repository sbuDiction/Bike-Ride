package bicycles.rides;

import bicycles.Bicycle;
import bicycles.models.BicycleType;

import java.util.ArrayList;

public class FunRide {
    private int bikesLimit;

    private ArrayList<Bicycle> bikes = new ArrayList<Bicycle>();

    public FunRide(int bikesLimit) {
        this.bikesLimit = bikesLimit;

    }

    public boolean accept(Bicycle bicycle) {
        System.out.println(bicycle);
        if ((!bikes.contains(bicycle) && bikes.size() < bikesLimit)) {
            bikes.add(bicycle);
        }else {
            return false;
        }
        return true;
    }

    public int getCountForType(BicycleType bicycleType) {
        int countFor = 0;
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

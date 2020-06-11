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
//        System.out.println(bicycle);
//        BicycleType bicycleType = bicycle.getBicycleType();
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
        System.out.println(bicycleType + " input");
        int countFor = 0;
        System.out.println(bikes);
        for (Bicycle object : bikes) {
            System.out.println(object.getBicycleType() == bicycleType);
            if (object.getBicycleType() == bicycleType) {
                countFor++;
                System.out.println(countFor + "count for bikes");
            }
        }
        return countFor;
    }

    public int getEnteredCount() {
        return bikes.size();
    }

}

package ride;

import bicycles.Bicycle;
import models.BicycleType;

import java.util.ArrayList;

public class FunRide {
    private int bikesLimit;
    private int count = 0;
    private String errorMsg;
    private ArrayList bikes = new ArrayList<Bicycle>();

    public FunRide(int bikesLimit) {
        this.bikesLimit = bikesLimit;

    }

    public boolean accept(BicycleType bicycle) {
        if ((bikes.size() < bikesLimit)) {
            bikes.add(bicycle);
            count++;
        }else {
            errorMsg = "Sorry the fun ride is closed";
        }
        return true;
    }

    public int getCountForType(BicycleType bicycleType) {
        int countFor = 0;
        for (Object object : bikes) {
            if (object.equals(bicycleType)) {
                countFor++;
            }
        }
        return countFor;
    }

    public int getEnteredCount() {
        return bikesLimit;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}

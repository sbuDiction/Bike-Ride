package rides;

import models.BicycleType;
import org.junit.jupiter.api.Test;
import ride.FunRide;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {

    @Test
    public void shouldAddBikesToFunRide() {
        FunRide funRide = new FunRide(5);
        funRide.accept(BicycleType.MountainBike);
        funRide.accept(BicycleType.RoadBike);
        funRide.accept(BicycleType.Tandem);
        funRide.getCountForType(BicycleType.Tandem);

        assertEquals(funRide.getEnteredCount(),5);

    }

    @Test
    public void getCountForTypeMountainBike() {
        FunRide funRide = new FunRide(10);
        funRide.accept(BicycleType.MountainBike);
        funRide.accept(BicycleType.MountainBike);
        funRide.accept(BicycleType.MountainBike);
        funRide.accept(BicycleType.RoadBike);
        funRide.accept(BicycleType.Tandem);
        funRide.getCountForType(BicycleType.MountainBike);

        assertEquals(funRide.getCountForType(BicycleType.MountainBike),3);
    }

    @Test
    public void getCountForTypeTandem() {
        FunRide funRide = new FunRide(10);
        funRide.accept(BicycleType.MountainBike);
        funRide.accept(BicycleType.RoadBike);
        funRide.accept(BicycleType.Tandem);
        funRide.accept(BicycleType.Tandem);
        funRide.accept(BicycleType.Tandem);
        funRide.accept(BicycleType.Tandem);
        funRide.accept(BicycleType.Tandem);
        funRide.accept(BicycleType.Tandem);
        funRide.accept(BicycleType.Tandem);
        funRide.getCountForType(BicycleType.Tandem);

        assertEquals(funRide.getCountForType(BicycleType.Tandem),7);
    }

    @Test
    public void getCountForTypeRoadBike() {
        FunRide funRide = new FunRide(8);
        funRide.accept(BicycleType.MountainBike);
        funRide.accept(BicycleType.RoadBike);
        funRide.accept(BicycleType.RoadBike);
        funRide.accept(BicycleType.RoadBike);
        funRide.accept(BicycleType.RoadBike);
        funRide.accept(BicycleType.Tandem);
        funRide.getCountForType(BicycleType.RoadBike);

        assertEquals(funRide.getCountForType(BicycleType.RoadBike),4);
    }

    @Test
    public void errorHandlingForFunRide() {
        FunRide funRide = new FunRide(5);
        funRide.accept(BicycleType.MountainBike);
        funRide.accept(BicycleType.MountainBike);
        funRide.accept(BicycleType.RoadBike);
        funRide.accept(BicycleType.RoadBike);
        funRide.accept(BicycleType.Tandem);
        funRide.accept(BicycleType.Tandem);

        assertEquals(funRide.getErrorMsg(),"Sorry the fun ride is closed");
    }
}

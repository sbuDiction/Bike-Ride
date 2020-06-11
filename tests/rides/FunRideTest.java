package rides;

import bicycles.Bicycle;
import models.BicycleType;
import models.MountainBike;
import models.RoadBike;
import models.Tandem;
import org.junit.jupiter.api.Test;
import rides.FunRide;
import specification.BicycleSpecification;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {

    @Test
    public void shouldAddBikesToFunRide() {
        FunRide funRide = new FunRide(5);
        MountainBike mountainBike = new MountainBike();
        Tandem tandem = new Tandem();
        RoadBike roadBike = new RoadBike();
        funRide.accept(mountainBike);
        funRide.accept(mountainBike);
        funRide.accept(tandem);
        funRide.accept(roadBike);

        assertEquals(funRide.getEnteredCount(),4);

    }

    @Test
    public void getCountForTypeMountainBike() {
        FunRide funRide = new FunRide(10);
        MountainBike mountainBike = new MountainBike();
        RoadBike roadBike = new RoadBike();
        Tandem tandem = new Tandem();
        funRide.accept(mountainBike);
        funRide.accept(mountainBike);
        funRide.accept(mountainBike);
        funRide.accept(roadBike);
        funRide.accept(tandem);

        assertEquals(funRide.getCountForType(BicycleType.MountainBike),3);
    }

    @Test
    public void getCountForTypeTandem() {
        FunRide funRide = new FunRide(10);
        MountainBike mountainBike = new MountainBike();
        RoadBike roadBike = new RoadBike();
        Tandem tandem = new Tandem();
        funRide.accept(mountainBike);
        funRide.accept(roadBike);
        funRide.accept(tandem);
        funRide.accept(tandem);
        funRide.accept(tandem);
        funRide.accept(tandem);
        funRide.accept(tandem);
        funRide.accept(tandem);
        funRide.accept(tandem);
        funRide.getCountForType(BicycleType.Tandem);

        assertEquals(funRide.getCountForType(BicycleType.Tandem),7);
    }

    @Test
    public void getCountForTypeRoadBike() {
        FunRide funRide = new FunRide(8);
        MountainBike mountainBike = new MountainBike();
        RoadBike roadBike = new RoadBike();
        Tandem tandem = new Tandem();
        funRide.accept(mountainBike);
        funRide.accept(roadBike);
        funRide.accept(roadBike);
        funRide.accept(roadBike);
        funRide.accept(roadBike);
        funRide.accept(tandem);

        assertEquals(funRide.getCountForType(BicycleType.RoadBike),4);
    }

    @Test
    public void errorHandlingForFunRide() {
        FunRide funRide = new FunRide(5);
        MountainBike mountainBike = new MountainBike();
        RoadBike roadBike = new RoadBike();
        Tandem tandem = new Tandem();
        funRide.accept(mountainBike);
        funRide.accept(mountainBike);
        funRide.accept(roadBike);
        funRide.accept(roadBike);
        funRide.accept(tandem);
        funRide.accept(tandem);

        assertEquals(funRide.accept(tandem),false);
    }
}

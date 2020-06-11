package rides;

import models.BicycleType;
import org.junit.jupiter.api.Test;
import specification.BicycleSpecification;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {

    @Test
    public void shouldAddBikesToFunRide() {
        BicycleSpecification mountainBike = new BicycleSpecification(2,1,BicycleType.MountainBike);
        BicycleSpecification tandem = new BicycleSpecification(7,5,BicycleType.Tandem);
        BicycleSpecification roadBike = new BicycleSpecification(6,3,BicycleType.RoadBike);

        FunRide funRide = new FunRide(5);

        funRide.accept(mountainBike);
        funRide.accept(mountainBike);
        funRide.accept(tandem);
        funRide.accept(roadBike);

        assertEquals(funRide.getEnteredCount(),4);

    }

    @Test
    public void getCountForTypeMountainBike() {
        BicycleSpecification mountainBike = new BicycleSpecification(6,3,BicycleType.MountainBike);
        BicycleSpecification tandem = new BicycleSpecification(6,3,BicycleType.Tandem);
        BicycleSpecification roadBike = new BicycleSpecification(6,3,BicycleType.RoadBike);

        FunRide funRide = new FunRide(10);

        funRide.accept(mountainBike);
        funRide.accept(mountainBike);
        funRide.accept(mountainBike);
        funRide.accept(roadBike);
        funRide.accept(tandem);

        assertEquals(funRide.getCountForType(mountainBike.getBicycleType()),3);
    }

    @Test
    public void getCountForTypeTandem() {
        BicycleSpecification mountainBike = new BicycleSpecification(3,2,BicycleType.MountainBike);
        BicycleSpecification tandem = new BicycleSpecification(7,4,BicycleType.Tandem);
        BicycleSpecification roadBike = new BicycleSpecification(5,3,BicycleType.RoadBike);
        FunRide funRide = new FunRide(10);


        funRide.accept(mountainBike);
        funRide.accept(roadBike);
        funRide.accept(tandem);
        funRide.accept(tandem);
        funRide.accept(tandem);
        funRide.accept(tandem);
        funRide.accept(tandem);
        funRide.accept(tandem);
        funRide.accept(tandem);

        assertEquals(funRide.getCountForType(tandem.getBicycleType()),7);
    }

    @Test
    public void getCountForTypeRoadBike() {
        BicycleSpecification mountainBike = new BicycleSpecification(3,2,BicycleType.MountainBike);
        BicycleSpecification tandem = new BicycleSpecification(7,4,BicycleType.Tandem);
        BicycleSpecification roadBike = new BicycleSpecification(5,3,BicycleType.RoadBike);
        FunRide funRide = new FunRide(8);

        funRide.accept(mountainBike);
        funRide.accept(roadBike);
        funRide.accept(roadBike);
        funRide.accept(roadBike);
        funRide.accept(roadBike);
        funRide.accept(tandem);

        assertEquals(funRide.getCountForType(roadBike.getBicycleType()),4);
    }

    @Test
    public void errorHandlingForFunRide() {
        BicycleSpecification mountainBike = new BicycleSpecification(3,2,BicycleType.MountainBike);
        BicycleSpecification tandem = new BicycleSpecification(7,4,BicycleType.Tandem);
        BicycleSpecification roadBike = new BicycleSpecification(5,3,BicycleType.RoadBike);
        FunRide funRide = new FunRide(5);

        funRide.accept(mountainBike);
        funRide.accept(mountainBike);
        funRide.accept(roadBike);
        funRide.accept(roadBike);
        funRide.accept(tandem);
        funRide.accept(tandem);

        assertEquals(funRide.accept(tandem),false);
    }
}

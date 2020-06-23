package bicycles.rides;

import bicycles.models.BicycleType;
import bicycles.rides.FunRide;
import org.junit.jupiter.api.Test;
import bicycles.specification.BicycleSpecification;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {

    @Test
    public void shouldAddBikesToFunRide() {
        BicycleSpecification mountainBike = new BicycleSpecification(2,1,BicycleType.MountainBike);
        BicycleSpecification tandem = new BicycleSpecification(7,5,BicycleType.Tandem);
        BicycleSpecification roadBike = new BicycleSpecification(6,3,BicycleType.RoadBike);

        FunRide funRide = new FunRide(5);

        funRide.accept(mountainBike);
        funRide.accept(tandem);
        funRide.accept(roadBike);

        assertEquals(funRide.getEnteredCount(),3);

    }

    @Test
    public void acceptMethodTest() {
        BicycleSpecification mountainBike = new BicycleSpecification(6,3,BicycleType.MountainBike);
        BicycleSpecification tandem = new BicycleSpecification(6,3,BicycleType.Tandem);
        BicycleSpecification roadBike = new BicycleSpecification(6,3,BicycleType.RoadBike);

        FunRide funRide = new FunRide(5);

        funRide.accept(mountainBike);
        funRide.accept(roadBike);
        funRide.accept(tandem);

        assertEquals(funRide.getCountForType(mountainBike.getBicycleType()),1);
        assertEquals(funRide.getCountForType(roadBike.getBicycleType()),1);
        assertEquals(funRide.getCountForType(tandem.getBicycleType()),1);
    }

    @Test
    public void duplicationTest() {
        BicycleSpecification mountainBike = new BicycleSpecification(3,2,BicycleType.MountainBike);
        BicycleSpecification tandem = new BicycleSpecification(7,4,BicycleType.Tandem);
        BicycleSpecification roadBike = new BicycleSpecification(5,3,BicycleType.RoadBike);
        FunRide funRide = new FunRide(5);

        funRide.accept(mountainBike);
        funRide.accept(mountainBike);
        funRide.accept(roadBike);
        funRide.accept(tandem);
        funRide.accept(tandem);

        assertEquals(funRide.getEnteredCount(),3);
    }

    @Test
    public void checkIfBikeWasAdded() {
        BicycleSpecification mountainBike = new BicycleSpecification(3,2,BicycleType.MountainBike);
        BicycleSpecification tandem = new BicycleSpecification(7,4,BicycleType.Tandem);
        BicycleSpecification roadBike = new BicycleSpecification(5,3,BicycleType.RoadBike);
        FunRide funRide = new FunRide(3);

        funRide.accept(mountainBike);
        funRide.accept(roadBike);
        funRide.accept(tandem);

        assertEquals(funRide.accept(mountainBike),false);
    }
}
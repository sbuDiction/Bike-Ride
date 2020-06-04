package rides;

import bicycles.Bicycle;
import bicycles.BikeRideOne;
import models.BicycleType;
import models.MountainBike;
import models.RoadBike;
import models.Tandem;
import org.junit.jupiter.api.Test;
import ride.FunRide;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {

    @Test
    public void shouldAddBikesToFunRide() {
        FunRide funRide = new FunRide(10);
        funRide.accept(BicycleType.MountainBike);
        funRide.accept(BicycleType.RoadBike);

        assertEquals(funRide.getEnteredCount(),10);

    }
}

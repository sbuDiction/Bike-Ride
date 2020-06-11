package rides;

import bicycles.BikeRideOne;
import models.BicycleType;
import models.RoadBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoadBikeRideTest {

    @Test
    public void shouldTakeRoadBikeForRide() {
        BikeRideOne bikeRideOne = new BikeRideOne();
        RoadBike roadBike = new RoadBike(BicycleType.RoadBike);
        bikeRideOne.ride(roadBike);
        bikeRideOne.ride(roadBike);

        assertEquals(roadBike.currentSpeed(),22,"Should be able to take the Mountain bike for a ride with acceleration speed of 10");

    }
}

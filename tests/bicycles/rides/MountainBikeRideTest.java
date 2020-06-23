package bicycles.rides;

import bicycles.BikeRideOne;
import bicycles.models.MountainBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MountainBikeRideTest {

    @Test
    public void shouldTakeMountainBikeForRide() {
        BikeRideOne bikeRideOne = new BikeRideOne();
        MountainBike mountainBike = new MountainBike();
        bikeRideOne.ride(mountainBike);
        bikeRideOne.ride(mountainBike);

        assertEquals(mountainBike.currentSpeed(),10,"Should be able to take the Mountain bike for a ride with acceleration speed of 10");

    }
}

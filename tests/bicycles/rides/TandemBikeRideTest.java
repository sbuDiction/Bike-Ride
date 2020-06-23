package bicycles.rides;

import bicycles.BikeRideOne;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TandemBikeRideTest {

    @Test
    public void shouldTakeRoadBikeForRide() {
        BikeRideOne bikeRideOne = new BikeRideOne();
        Tandem tandem = new Tandem();
        bikeRideOne.ride(tandem);
        bikeRideOne.ride(tandem);

        assertEquals(tandem.currentSpeed(),24);

    }
}

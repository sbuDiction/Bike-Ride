package bicycles;

import models.MountainBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MountainBikeTest {
    @Test
    public void shouldAccelerate() {

        MountainBike mountainBike = new MountainBike();
        mountainBike.accelerate();
        assertEquals(mountainBike.currentSpeed(),5,"Should return the current speed for Mountain bike");
    }
}

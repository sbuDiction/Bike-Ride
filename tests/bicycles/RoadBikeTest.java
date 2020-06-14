package bicycles;

import bicycles.models.RoadBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoadBikeTest {
    @Test
    public void shouldAccelerate() {
        RoadBike roadBike = new RoadBike();
        roadBike.accelerate();
        assertEquals(roadBike.currentSpeed(),11,"Should return the current speed of a Road bike");
    }

    @Test
    public void shouldAccelerateAndBrakeCorrect() {
        RoadBike roadBike = new RoadBike();
        roadBike.accelerate();
        roadBike.brake();
        assertEquals(roadBike.currentSpeed(),7,"Should be able to accelerate and brake correct.");
    }
}

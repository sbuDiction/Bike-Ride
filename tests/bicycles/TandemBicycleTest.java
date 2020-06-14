package bicycles;

import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TandemBicycleTest {

    @Test
    public void shouldAccelerate() {
        Tandem tandem = new Tandem();
        tandem.accelerate();
        assertEquals(tandem.currentSpeed(),12,"Should return the current speed of a Tandem bike");
    }

    @Test
    public void shouldAccelerateAndBrakeCorrect() {
        Tandem tandem = new Tandem();
        tandem.accelerate();
        tandem.brake();
        assertEquals(tandem.currentSpeed(),5,"Should be able to accelerate and brake correct.");
    }
}

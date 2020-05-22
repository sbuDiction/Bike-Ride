package bicycles;
import models.MountainBike;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {
    @Test
    public void shouldAccelerate() {

        MountainBike mountainBike = new MountainBike();
        mountainBike.accelerate();
        assertEquals(mountainBike.currentSpeed(),5);
    }
//
//    @Test
//    public void shouldAccelerateAndBrakeCorrect() {
//
//        Bicycle bicycle = new Bicycle();
//        bicycle.accelerate();
//        bicycle.brake();
//        assertEquals(bicycle.currentSpeed(),2);
//
//    }
//
//    @Test
//    public void shouldDoMultipleAcceleratesCorrectly() {
//
//        Bicycle bicycle = new Bicycle();
//        bicycle.accelerate();
//        bicycle.accelerate();
//        bicycle.accelerate();
//        assertEquals(15, bicycle.currentSpeed());
//
//    }
//
//    @Test
//    public void shouldDoMultipleAccelerateAndBrakesCorrectly() {
//
//        Bicycle bicycle = new Bicycle();
//        bicycle.accelerate();
//        bicycle.brake();
//        bicycle.accelerate();
//        bicycle.brake();
//        bicycle.brake();
//        assertEquals(1, bicycle.currentSpeed());
//
//    }
//
//    @Test
//    public void shouldBeAbleToStop() {
//
//        Bicycle bicycle = new Bicycle();
//        bicycle.accelerate();
//        bicycle.brake();
//        bicycle.accelerate();
//        bicycle.stop();
//        assertEquals(0, bicycle.currentSpeed());
//
//    }
}

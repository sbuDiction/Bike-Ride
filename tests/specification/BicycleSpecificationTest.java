package specification;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleSpecificationTest {

    @Test
    public void shouldGetAccelerationSpeed() {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(20,5);

        assertEquals(bicycleSpecification.getAccelerationSpeed(),20,"Should be able to get the acceleration speed");
    }

    @Test
    public void shouldGetAccelerationSpeeds() {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(20,5);
        assertEquals(bicycleSpecification.getAccelerationSpeed(),20,"Should be able to get the acceleration speed");

    }
}

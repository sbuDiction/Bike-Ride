package bicycles.specification;

import bicycles.models.BicycleType;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleFromSpecTest {

    @Test
    public void bicycleFromSpecTest() {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(20,5, BicycleType.RoadBike);
        BicycleFromSpec bicycleFromSpec = new BicycleFromSpec(bicycleSpecification);
        bicycleFromSpec.accelerate();
        bicycleFromSpec.brake();

        assertEquals(bicycleSpecification.getAccelerationSpeed(),20);
        assertEquals(bicycleSpecification.getBrakeSpeed(),5);
    }
}

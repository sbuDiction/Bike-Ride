package specification;

import models.BicycleType;
import models.MountainBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleSpecificationTest {

    @Test
    public void specificationTest() {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(20,5,BicycleType.MountainBike);


        assertEquals(bicycleSpecification.getAccelerationSpeed(),20,"Should be able to get the acceleration speed");
        assertEquals(bicycleSpecification.getBrakeSpeed(),5,"Should be able to get the brake speed");
        assertEquals(bicycleSpecification.getBicycleType(), BicycleType.MountainBike);
    }
}

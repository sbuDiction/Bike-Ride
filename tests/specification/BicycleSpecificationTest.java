package specification;

import models.BicycleType;
import models.MountainBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleSpecificationTest {

    @Test
    public void specificationTest() {
<<<<<<< HEAD
        BicycleSpecification bicycleSpecification = new BicycleSpecification(20,5,BicycleType.MountainBike);
=======
        BicycleSpecification bicycleSpecification = new BicycleSpecification(20,5);
>>>>>>> 43d820e39a812f90d9fe1e580619020cd2b5812b
        

        assertEquals(bicycleSpecification.getAccelerationSpeed(),20,"Should be able to get the acceleration speed");
        assertEquals(bicycleSpecification.getBrakeSpeed(),5,"Should be able to get the brake speed");
        assertEquals(bicycleSpecification.getBicycleType(), BicycleType.MountainBike);
    }
}

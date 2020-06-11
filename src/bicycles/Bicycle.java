package bicycles;


import models.BicycleType;

public interface Bicycle {

      void accelerate();
      void brake();
      int currentSpeed();
      void stop();
      BicycleType getBicycleType();
}
package models;

import bicycles.Bicycle;
//import bicycles.Bicycle.*;

public abstract class RoadBike implements Bicycle {
        public void accelerate () {
//        speed = speed + 5;
        System.out.println(speed + " " + "speed increased");
    }
        public void brake () {
//        speed = speed - 3;
        System.out.println(speed + " " + "speed decreased");
    }
}

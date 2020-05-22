package models;

public class RoadBike {

    private int speed;

    public void accelerate () {
        speed = speed + 11;
        System.out.println(speed + " " + "Road bike speed");
    }

    public void brake () {
        speed = speed - 4;
        System.out.println(speed + " " + "Slowing down");
    }

    public int currentSpeed() {
        return speed;
    }
}
package models;

public class MountainBike  {

    private int speed;

    public void accelerate () {
        speed = speed + 5;
        System.out.println(speed + " " + "Mountain bike speed");
    }
    public void brake () {
        speed = speed - 3;
        System.out.println(speed + " " + "Slowing down");
    }

    public int currentSpeed() {
        return speed;
    }
}

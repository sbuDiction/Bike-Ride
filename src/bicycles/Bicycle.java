package bicycles;

public class Bicycle {
    private int speed;

    public void accelerate () {
        speed = speed + 5;
        System.out.println(speed + " " + "speed increased");
    }
    public void brake () {
        speed = speed - 3;
        System.out.println(speed + " " + "speed decreased");
    }
    public int currentSpeed () {
        return speed;
    }
    public void stop () {
        speed = 0;
        System.out.println(speed + " " + "The bike has stop");
    }
}

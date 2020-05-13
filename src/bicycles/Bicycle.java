package bicycles;

public class Bicycle {
    private int speed;

    public void accelerate () {
// a public accelerate method which increase a private speed variable with 5,
        speed = speed + 5;
        System.out.println(speed + " " + "speed increased");
    }
    public void brake () {
// a public brake method that decrease the private speed variable with of the bike with 3
        speed = speed - 3;
        System.out.println(speed + " " + "speed decreased");

    }

    public int currentSpeed () {
//  a public currentSpeed method that returns the current speed of the bicycle,
        return speed;
    }
    public void stop () {
// add a stop method that sets the bicycle speed variable 0
        speed = 0;
        System.out.println(speed + " " + "The bike has stop");
    }
}

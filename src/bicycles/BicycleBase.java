package bicycles;

public abstract class BicycleBase implements Bicycle  {

    private int speed;

    protected void changeSpeed(int bicycleSpeed) {
        speed += bicycleSpeed;
    }

    @Override
    public int currentSpeed() {
        System.out.println(speed + " speed level");
        return speed;
    }

    @Override
    public void stop() {
        speed = 0;
    }
}

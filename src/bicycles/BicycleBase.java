package bicycles;

import bicycles.models.BicycleType;

public abstract class BicycleBase implements Bicycle  {

    private int speed;
    private BicycleType bicycleType;

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

    @Override
    public BicycleType getBicycleType() {
        return bicycleType;
    }

}

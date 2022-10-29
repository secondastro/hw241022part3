package Animals;

public abstract class Mammals extends Animals{

    private final String environment;

    private  int movingSpeed;

    public Mammals(String name, int birthYear, String environment, int movingSpeed) {
        super(name, birthYear);
        this.environment = ValidationUtils.validationString(environment, "не указано");
        this.movingSpeed = ValidationUtils.validationInt(movingSpeed);
    }

    public abstract void walk();

    @Override
    public abstract void eat();

    @Override
    public abstract void sleep();

    @Override
    public abstract void move();

    public String getEnvironment() {
        return environment;
    }


    public int getMovingSpeed() {
        return movingSpeed;
    }

    public void setMovingSpeed(int movingSpeed) {

        this.movingSpeed = ValidationUtils.validationInt(movingSpeed);
    }
}

package Animals;

public class Flightless extends Birds{

    private final String movingType;

    public Flightless(String name, int birthYear, String environment, String movingType) {
        super(name, birthYear, environment);
        this.movingType = ValidationUtils.validationString(movingType, "не указано");
    }

    public String getMovingType() {
        return movingType;
    }

public void walk(){

}

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void move() {

    }
    @Override
    public String toString() {
        return "Класс " + getClass() +" Нелетающие: "  +
                getName() + ", возраст: " + getAge() + ", среда обитания: " + getEnvironment() +
                ", тип передвижения: " + getMovingType();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flightless)) return false;
        Flightless flightless  = (Flightless) o;
        return getAge()== flightless.getAge() && getName().equals(flightless.getName()) && getMovingType().equals(flightless.getMovingType());
    }

}

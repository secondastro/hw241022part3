package Animals;

import java.util.Objects;

public class Flying extends Birds{

    private final String movingType;

    public Flying(String name, int birthYear, String environment, String movingType) {
        super(name, birthYear, environment);
        this.movingType = ValidationUtils.validationString(movingType, "не указано");
    }

    public String getMovingType() {
        return movingType;
    }

    public void fly() {

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
        return "Класс " + getClass() + " Летающие: "  +
                getName() + ", возраст: " + getAge() + ", среда обитания: " + getEnvironment() +
                ", тип передвижения: " + getMovingType();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flying)) return false;
        Flying flying = (Flying) o;
        return getAge()== flying.getAge() && getName().equals(flying.getName()) && getMovingType().equals(flying.getMovingType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMovingType());
    }
}

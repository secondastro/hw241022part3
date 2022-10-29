package Animals;

import java.util.Objects;

public class Predators extends Mammals {

private String foodType;

    public Predators(String name, int birthYear, String environment, int movingSpeed,String foodType) {
        super(name, birthYear, environment, movingSpeed);
        this.foodType = ValidationUtils.validationString(foodType, "мясо");
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = ValidationUtils.validationString(foodType,"мясо");
    }

    @Override
    public void walk() {

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Predators)) return false;
        Predators predators = (Predators) o;
        return getAge() == predators.getAge() && getName().equals(predators.getName())
                &&getFoodType().equals(predators.getFoodType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFoodType());
    }

    @Override
    public String toString() {
        return "Класс " + getClass() + "  Хищники: "  +
                getName() + ", возраст: " + getAge() + ", среда обитания: " + getEnvironment() +
                ", скорость передвижения: " + getMovingSpeed() + ", питается: " + getFoodType();
    }
}

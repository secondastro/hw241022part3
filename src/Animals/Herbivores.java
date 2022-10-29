package Animals;

import java.util.Objects;

public class Herbivores extends Mammals{

    private String foodType;

    public Herbivores(String name, int birthYear, String environment, int movingSpeed, String foodType) {
        super(name, birthYear, environment, movingSpeed);
        this.foodType = ValidationUtils.validationString(foodType, "трава");
    }
public void graze() {

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

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = ValidationUtils.validationString(foodType, "трава");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Herbivores)) return false;
        Herbivores that = (Herbivores) o;
        return getAge()== that.getAge() && getName().equals(that.getName())
                &&getFoodType().equals(that.getFoodType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFoodType());
    }

    @Override
    public String toString() {
        return "Класс" + getClass() + " Травоядные: "  +
                getName() + ", возраст: " + getAge() + ", среда обитания: " + getEnvironment() +
                ", скорость передвижения: " + getMovingSpeed() + ", питается: " + getFoodType();
    }
}

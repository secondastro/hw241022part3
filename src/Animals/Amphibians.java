package Animals;

public class Amphibians extends Animals {

    private final String environment;

    public Amphibians(String name, int birthYear, String environment) {
        super(name, birthYear);
        this.environment = ValidationUtils.validationString(environment, "не указано");

    }

    public String getEnvironment() {
        return environment;
    }

    public void hunt() {

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
        return "Класс " + getClass() + " Земноводные: "  +
                getName() + ", возраст: " + getAge() + ", среда обитания: " + getEnvironment();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Amphibians)) return false;
        Amphibians that = (Amphibians) o;
        return getAge() == that.getAge() && getName().equals(that.getName())
                && getEnvironment().equals(that.environment);
    }
}

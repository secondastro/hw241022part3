package Animals;

public abstract class Animals {
    private final String name;
    private final int age;

    public Animals(String name, int birthYear) {
        this.name = ValidationUtils.validationString(name, "имя не указано");
        this.age = ValidationUtils.validationAge(birthYear);

    }
    public abstract void eat();

    public abstract void sleep();

    public abstract void move();

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }
}

package Animals;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animals)) return false;
        Animals animals = (Animals) o;
        return getAge() == animals.getAge() && getName().equals(animals.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }
}

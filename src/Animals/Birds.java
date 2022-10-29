package Animals;

public abstract class Birds extends Animals {

    private final String environment;

    public Birds(String name, int birthYear, String environment) {
        super(name, birthYear);
        this.environment = ValidationUtils.validationString(environment, "не указано");
    }

    public String getEnvironment() {
        return environment;
    }

    @Override
    public abstract void eat() ;

    @Override
    public abstract void sleep() ;

    @Override
    public abstract void move() ;


}

import Animals.*;

public class Main {
    public static void main(String[] args) {
        Herbivores giraffe = new Herbivores("жираф", 1999, "саванна", 20, "листья");
        Herbivores gazelle = new Herbivores("газель", 2009, "саванна", 42, "трава");
        Herbivores horse = new Herbivores("лошадь", 2015, "степь", 39, "трава");

        Predators hyena = new Predators("гиена", 2000, "саванна", 29, "падаль");
        Predators bear = new Predators("медведь", 1995, "тайга", 36, "животные и растения");
        Predators tiger = new Predators("тигр", 2007, "джунгли", 47, "мясо");

        Amphibians frog = new Amphibians("лягушка", 2020, "болото");
        Amphibians snake = new Amphibians("уж пресноводный", 2020, "пресные водоемы");

        Flightless peacock = new Flightless("павлин", 2019, "тропики", "ходит");
        Flightless penguin = new Flightless("пингвин", 2015, "арктика", "ходит");
        Flightless dodo = new Flightless("птица додо", 2014, "джунгли", "несётся сломя голову как душевнобольная");

        Flying gull = new Flying("чайка", 2010, "побережье", "летает");
        Flying albatross = new Flying("альбатрос", 2021, "побережье морей и океанов", "летает");
        Flying hawk = new Flying("сокол", 2020, "тайга, степь", "летает");

        System.out.println(giraffe);
        System.out.println(gazelle);
        System.out.println(horse);

        System.out.println(giraffe.equals(gazelle));

        System.out.println(bear);
        System.out.println(hyena);
        System.out.println(tiger);

        System.out.println(bear.equals(hyena));

        System.out.println(frog);
        System.out.println(snake);

        System.out.println(frog.equals(snake));

        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodo);

        System.out.println(peacock.equals(dodo));

        System.out.println(gull);
        System.out.println(albatross);

        System.out.println(gull.equals(albatross));

        Animals[] animals = {giraffe, gazelle, horse, hyena, bear, tiger, frog, snake, peacock, penguin, dodo, gull, albatross};
        for (int i = 0; i < animals.length; i++) {
            for (int j = i+1; j < animals.length; j++) {
                if (animals[i].equals(animals[j])) {
                    System.out.println("Найден дубликат: " + animals[i]);
                }
            }
        }

    }
}
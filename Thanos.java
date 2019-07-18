import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        Hero blackWidow = new Hero("Black Widow", 34);
        Hero captain = new Hero("Captain America", 100);
        Hero vision = new Hero("Vision", 3);
        Hero ironMan = new Hero("Iron Man", 48);
        Hero scarlet = new Hero("Scarlet Witch", 29);
        Hero thor = new Hero("Thor", 1500);
        Hero spiderMan = new Hero("Spider Man", 18);
        Hero hulk = new Hero("Hulk", 49);
        Hero doctor = new Hero("Doctor Strange", 42);

        // TODO 1 : Create an empty heroes list
        ArrayList<Hero> heroes = new ArrayList<>();

        // TODO 2 : Add those heroes to the list
        heroes.add(blackWidow);
        heroes.add(captain);
        heroes.add(vision);
        heroes.add(ironMan);
        heroes.add(scarlet);
        heroes.add(thor);
        heroes.add(spiderMan);
        heroes.add(hulk);
        heroes.add(doctor);

        // TODO 3 : It's Thor birthday, now he's 1501
        thor.setAge(1501);

        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(heroes);

        // TODO 5 : Keep only the half of the list
        for (int i = 0; i <= heroes.size() / 2; i++ ) {
            heroes.remove(i);
        }

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        for (Hero hero : heroes) {
            System.out.println(hero.getName());
        }
    }
}
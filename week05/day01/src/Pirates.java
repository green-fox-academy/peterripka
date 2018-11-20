import java.util.*;

class PirateCounter {

    static class Pirate {
        String name;
        boolean hasWoodenLeg;
        int gold;

        Pirate(String name, boolean hasWoodenLeg, int gold) {
            this.name = name;
            this.hasWoodenLeg = hasWoodenLeg;
            this.gold = gold;
        }
    }

    public static void main(String... args) {
        ArrayList<Pirate> pirates = new ArrayList<>();

        // Given this list...

        pirates.add( new Pirate( "Olaf", false, 12 ) );
        pirates.add( new Pirate( "Uwe", true, 9 ) );
        pirates.add( new Pirate( "Jack", true, 16 ) );
        pirates.add( new Pirate( "Morgan", false, 17 ) );
        pirates.add( new Pirate( "Hook", true, 20 ) );

        // Write a function that takes any list that contains pirates as in the example,
        // And returns a list of names containing the pirates that
        // - have wooden leg and
        // - have more than 15 gold

        List<String> filteredPirateList = filterThePirates( pirates );
        System.out.println( filteredPirateList.toString() );

    }

    private static List<String> filterThePirates(List<Pirate> pirates) {
        List<String> filteredPirates = new ArrayList<>();
        for (Pirate pirate : pirates) {
            if (pirate.hasWoodenLeg && pirate.gold > 15) {
                filteredPirates.add( pirate.name );
            }
        }
        return filteredPirates;
    }
}
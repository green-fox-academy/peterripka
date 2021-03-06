package comparable2;

import java.util.Collections;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        Thing milk = new Thing("Get milk");
        Thing obstacles = new Thing("Remove the obstacles");
        Thing standUp = new Thing("Stand up");
        Thing eatLunch = new Thing("Eat lunch");

        standUp.complete();
        eatLunch.complete();

        fleet.add(milk);
        fleet.add(obstacles);
        fleet.add(standUp);
        fleet.add(eatLunch);


        System.out.println(fleet);

        Collections.sort(fleet.getThings());

        System.out.println(fleet);

    }
}
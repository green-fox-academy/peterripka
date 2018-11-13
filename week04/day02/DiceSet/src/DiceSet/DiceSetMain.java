package DiceSet;

import java.util.Arrays;


public class DiceSetMain {
    public static void main(String[] args) {

        DiceSet diceSet = new DiceSet();
        diceSet.getCurrent();
        diceSet.roll();
        diceSet.getCurrent();
        diceSet.getCurrent(5);
        diceSet.reroll();
        diceSet.getCurrent();
        diceSet.reroll(4);
        diceSet.getCurrent();

        int rollCounter = 0;
        while (diceSet.getCurrent(0) != 6 || diceSet.getCurrent(1) != 6 || diceSet.getCurrent(2) != 6 || diceSet.getCurrent(3) != 6
                || diceSet.getCurrent(4) != 6 || diceSet.getCurrent(5) != 6) {
            diceSet.reroll();
            rollCounter++;
            System.out.print("Required rolls "+rollCounter);
            System.out.println(Arrays.toString(diceSet.getCurrent()));

        }
    }
}

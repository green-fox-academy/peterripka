package Sharpie;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

    List<Sharpie> listOfSharpies;

    public SharpieSet() {
        this.listOfSharpies = new ArrayList<>();
    }

    public static int countUsable(List<Sharpie> listOfSharpies) {
        int counter = 0;
        for (Sharpie currentSharpie : listOfSharpies) {
            if (currentSharpie.getInkAmount() > 0) {
                counter++;
            }
        }
        return counter;
    }
    public static List<Sharpie> removeThrash(List<Sharpie> listOfSharpies) {
        for (int i = (listOfSharpies.size() - 1); i > -1; i--) {
            if (listOfSharpies.get(i).getInkAmount() <= 0) {
                listOfSharpies.remove(i);
            }
        }
        return listOfSharpies;
    }
}

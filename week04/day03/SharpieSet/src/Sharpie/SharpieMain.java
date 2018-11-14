package Sharpie;

import java.util.ArrayList;
import java.util.List;

public class SharpieMain {

    public static void main(String[] args) {

//        Sharpie blueSharpie = new Sharpie("blue", 32.5, 44.5);
//
//        blueSharpie.use();
//
//        System.out.println(blueSharpie.getInkAmount());
//        System.out.println("My sharpy has "+blueSharpie.color+" color, its width is "+blueSharpie.width+" and the amount of ink in it is "+blueSharpie.inkAmount);

        List<Sharpie> listOfSharpies = new ArrayList<>();
        Sharpie magentaSharpie = new Sharpie("magenta", 3, 24);
        Sharpie redSharpie = new Sharpie("red", 3,2);
        Sharpie orangeSharpie = new Sharpie("orange", 3, 21);
        Sharpie pinkSharpie = new Sharpie("pink", 3, 1);
        Sharpie blueSharpie = new Sharpie("blue", 32.5, 44.5);

        listOfSharpies.add(magentaSharpie);
        listOfSharpies.add(orangeSharpie);
        listOfSharpies.add(blueSharpie);
        listOfSharpies.add(redSharpie);
        listOfSharpies.add(pinkSharpie);

        orangeSharpie.useAllInk();
        pinkSharpie.use();
        redSharpie.use();

        System.out.println(SharpieSet.countUsable(listOfSharpies));
        System.out.println(SharpieSet.removeThrash(listOfSharpies));

    }
}

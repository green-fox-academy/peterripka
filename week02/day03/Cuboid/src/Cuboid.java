import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {

        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000

        Scanner scan = new Scanner(System.in);

        double sideA;
        double sideB;
        double sideC;
        double volume;
        double surfaceArea;

        System.out.println("Please, enter the length of side 'a' :");
        sideA = scan.nextInt();

        System.out.println("Please, enter the length of side 'b' :");
        sideB = scan.nextInt();

        System.out.println("Please, enter the length of side 'c' :");
        sideC = scan.nextInt();

        volume = (sideA * sideB * sideC);
        surfaceArea = 2 * ((sideA*sideB) + (sideB*sideC) + (sideC*sideA));

        System.out.println("Surface Area: " + surfaceArea);
        System.out.println("Volume: " + volume);

    }
}
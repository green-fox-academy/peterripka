import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner animal = new Scanner(System.in);

        System.out.println("Please, enter the first number!");
        Scanner chickennr = new Scanner(System.in);
        int chicken = animal.nextInt();

        System.out.println("Please, enter the second number!");
        Scanner pignr = new Scanner(System.in);
        int pigs = animal.nextInt();

        int totallegs = (chicken * 2) + (pigs * 4);

        System.out.println("The total number of animal legs is " + totallegs);
    }
}

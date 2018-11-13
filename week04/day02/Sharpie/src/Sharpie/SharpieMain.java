package Sharpie;

public class SharpieMain {

    public static void main(String[] args) {

        Sharpie shark = new Sharpie("blue", 32.5, 44.5);

        shark.use();

        System.out.println(shark.getInkAmount());
        System.out.println("My sharpy has "+shark.color+" color, its width is "+shark.width+" and the amount of ink in it is "+shark.inkAmount);
    }
}

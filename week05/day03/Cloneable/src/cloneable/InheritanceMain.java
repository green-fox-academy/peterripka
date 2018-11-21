package cloneable;

public class InheritanceMain {
    public static void main(String[] args) {

        Student john = new Student( "John Doe", 20, "male", "BME" );

        Student johnTheClone = john.clone();

        john.introduce();
        johnTheClone.introduce();

    }
}
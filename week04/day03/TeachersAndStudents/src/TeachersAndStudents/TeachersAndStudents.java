package TeachersAndStudents;

public class TeachersAndStudents {

    public static void main(String[] args) {
        Students Peter = new Students("Peter");
        Teachers Levi = new Teachers("Levi");

        Peter.question(Levi);
        Levi.teach(Peter);
    }
}

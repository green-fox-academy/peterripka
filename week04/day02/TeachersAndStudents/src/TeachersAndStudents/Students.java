package TeachersAndStudents;

public class Students {
    String name;

    public Students(String name) {
        this.name = name;
    }

    public void learn() {
        System.out.println(this.name+" is learning.");

    }

    public void question(Teachers teacher) {
        System.out.println(this.name+" has a question.");
        teacher.answer();
    }
}
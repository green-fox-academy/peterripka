package TeachersAndStudents;

public class Teachers {
    String name;

    public Teachers(String name) {
        this.name = name;
    }

    public void answer() {
        System.out.println(this.name+" is answering the question.");
    }

    public void teach(Students student) {
        student.learn();
    }
}

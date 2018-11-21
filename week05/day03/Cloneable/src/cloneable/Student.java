package cloneable;

public class Student extends Person implements Cloneable {

    private String previousOrganization;
    private int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        super( name, age, gender );
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;

    }

    public Student() {
        super();
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;

    }

    public void introduce() {
        System.out.println( "Hi, I'm " + name + " and I'm a " + age + " year old " + gender + " who skipped " + skippedDays + " days from the course already." );
    }

    public void getGoal() {
        System.out.println( "Be a junior software developer." );
    }

    public int skipDays(int numberOfDays) {
        return skippedDays + numberOfDays;
    }

    @Override
    public Student clone() {
        Student clonedStudent = null;
        try {
            clonedStudent = (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println( "Couldn't clone." );
        }
        return clonedStudent;

        //or protected Student clone() {
        //        return new Student( name, age, gender, previousOrganization );
    }

    public String toString() {
        return name + " " + age;
    }
}

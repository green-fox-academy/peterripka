package Inherit_Example;

public class Student extends Person {

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
}

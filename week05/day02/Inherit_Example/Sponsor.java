package Inherit_Example;

public class Sponsor extends Person {
    private String company;
    private int hiredStudents;


    public Sponsor(String name, int age, String gender, String company) {
        super( name, age, gender );
        this.company = company;
        this.hiredStudents = 0;
    }

    public Sponsor() {
        super();
        this.company = "Google";
        this.hiredStudents = 0;
    }

    public void introduce() {
        System.out.println( "Hi, I'm " + name + ", a " + age + " year old " + gender + " who represents " + company + " and hired " + hiredStudents + " students so far." );
    }

    public int hire() {
        return hiredStudents++;
    }

    public void getGoal() {
        System.out.println( "Hire brilliant junior software developers." );
    }
}


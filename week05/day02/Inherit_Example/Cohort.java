package Inherit_Example;

import java.util.ArrayList;

public class Cohort {

    private String name;
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Mentor> mentors = new ArrayList<>();

    public Cohort(String name) {
        this.name = name;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void setMentors(ArrayList<Mentor> mentors) {
        this.mentors = mentors;
    }

    public void info() {
        System.out.println( "The " + name + " cohort has" + students.size() + " students and " + mentors.size() +
                " mentors." );
    }

    public void addStudent(Student student) {
        students.add( student );
    }

    public void addMentor(Mentor mentor) {
        mentors.add( mentor );
    }
}

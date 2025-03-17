package coursemanagementsystem;

import java.util.ArrayList;

public class Instructor {



    private String eMail;
    private String firstName;
    private String lastName;
    private String instructorID;
    private String password;
    ArrayList<Course> courses = new ArrayList<>();
    private static int count = 1;


    public Instructor(String eMail, String password, String firstName, String lastName) {
        this.eMail = eMail ;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.instructorID = instructorID();
        count++;
    }

    private static String instructorID() {
        return String.format("I-0"+count);
    }

    public String getID() {
        return this.instructorID;
    }

    public void createCourse(String courseName, String courseCode, String instructorID, String instructorName) {
        Course course = new Course(courseName, courseCode, instructorID , instructorName);
        courses.add(course);
    }

    public int numberOfCreatedCourses() {
        return courses.size();
    }

}

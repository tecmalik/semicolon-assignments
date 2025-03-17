package coursemanagementsystem;

public class Course {
    private String courseCode;
    private String courseName;
    private String instructorID;
    private String instructorName;

    public Course(String courseName, String courseCode, String instructorID, String instructorName) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructorID = instructorID;
        this.instructorName = instructorName;
    }
    public String getCourseCode() {
        return courseCode;
    }


}

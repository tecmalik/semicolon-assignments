package coursemanagementsystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourseManagementTest {
    Instructor instructor;
    @BeforeEach
    public void startWith() {
        instructor = new Instructor("Instructor@gmail.com","password","firstName","LastName");
    }

    @Test
    public void instructorCanRegisterInstructorsTest() {
        Instructor instructor2 = new Instructor("Instructor@gmail.com","password","firstName","LastName");

        assertEquals("I-01",instructor.getID());
        assertEquals("I-02",instructor2.getID());
    }
    @Test
    public void instructorCanCreateCourseTest() {
        instructor.createCourse("CourseName","cos101", "I-01", "instructorName");
        assertEquals(1,instructor.numberOfCreatedCourses());
        instructor.createCourse("CourseName2","cos102", "I-01", "instructorName");
        assertEquals(2,instructor.numberOfCreatedCourses());

    }
    @Test
    public void CourseCanBeFoundByIdTest() {
        instructor.createCourse("CourseName","cos101", "I-01", "instructorName");
        assertEquals(1,instructor.numberOfCreatedCourses());
        instructor.createCourse("CourseName2","cos102", "I-01", "instructorName");
        assertEquals(2,instructor.numberOfCreatedCourses());

    }
}

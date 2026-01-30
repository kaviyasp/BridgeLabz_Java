package collectionsandstreams.generics.applications;

/*
 * Class: UniversityTest
 * Description: Demonstrates university course management system.
 */
public class UniversityTest {

    public static void main(String[] args) {

        Course<ExamCourse> examCourses = new Course<>();
        examCourses.addCourse(new ExamCourse("Data Structures"));
        examCourses.addCourse(new ExamCourse("Operating Systems"));

        Course<AssignmentCourse> assignmentCourses = new Course<>();
        assignmentCourses.addCourse(new AssignmentCourse("Software Engineering"));

        Course<ResearchCourse> researchCourses = new Course<>();
        researchCourses.addCourse(new ResearchCourse("AI Research"));

        System.out.println("Exam Courses:");
        CourseUtil.displayCourses(examCourses.getCourses());

        System.out.println("\nAssignment Courses:");
        CourseUtil.displayCourses(assignmentCourses.getCourses());

        System.out.println("\nResearch Courses:");
        CourseUtil.displayCourses(researchCourses.getCourses());
    }
}

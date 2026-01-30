package collectionsandstreams.generics.applications;

/*
 * Class: AssignmentCourse
 */
public class AssignmentCourse extends CourseType {

    public AssignmentCourse(String courseName) {
        super(courseName);
    }

    @Override
    public String getEvaluationType() {
        return "Assignment-Based";
    }
}

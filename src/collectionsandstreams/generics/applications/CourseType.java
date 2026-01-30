package collectionsandstreams.generics.applications;

/*
 * Abstract Class: CourseType
 * Description: Base class for all course evaluation types.
 */
public abstract class CourseType {

    private String courseName;

    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public abstract String getEvaluationType();
}

package collectionsandstreams.generics.applications;

import java.util.ArrayList;
import java.util.List;

/*
 * Class: Course
 * Description: Generic course manager restricted to CourseType.
 */
public class Course<T extends CourseType> {

    private List<T> courses = new ArrayList<>();

    public void addCourse(T course) {
        courses.add(course);
    }

    public List<T> getCourses() {
        return courses;
    }
}

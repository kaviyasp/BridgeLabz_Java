package collectionsandstreams.generics.applications;

import java.util.List;

/*
 * Class: CourseUtil
 * Description: Displays courses using wildcard generics.
 */
public class CourseUtil {

    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println(
                    course.getCourseName() + " | " + course.getEvaluationType()
            );
        }
    }
}

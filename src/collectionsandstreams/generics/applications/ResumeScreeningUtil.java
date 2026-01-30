package collectionsandstreams.generics.applications;

import java.util.List;

/*
 * Class: ResumeScreeningUtil
 * Description: Screens resumes for multiple job roles.
 */
public class ResumeScreeningUtil {

    public static void screenResumes(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            System.out.println("Screening resumes for: " + role.getRoleName());
        }
    }
}

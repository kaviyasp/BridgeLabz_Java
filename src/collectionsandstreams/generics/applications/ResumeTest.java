package collectionsandstreams.generics.applications;

import java.util.List;

/*
 * Class: ResumeTest
 * Description: Demonstrates AI-driven resume screening.
 */
public class ResumeTest {

    public static void main(String[] args) {

        Resume<SoftwareEngineer> r1 =
                new Resume<>("Jayanthi", new SoftwareEngineer());

        Resume<DataScientist> r2 =
                new Resume<>("Arun", new DataScientist());

        r1.displayResume();
        r2.displayResume();

        ResumeScreeningUtil.screenResumes(
                List.of(new SoftwareEngineer(),
                        new DataScientist(),
                        new ProductManager())
        );
    }
}

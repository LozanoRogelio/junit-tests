import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CohortTest {
    Cohort empty;
    Cohort oneStudent;
    Cohort twoStudents;

    @Before
    public void setUp() {
        empty = new Cohort();
        oneStudent = new Cohort();
        twoStudents = new Cohort();

        Student batman = new Student(1, "Batman");
        Student wolverine = new Student(2, "Wolverine");
        Student ash = new Student(3, "Ash");

        batman.addGrade(100);
        wolverine.addGrade(95);
        wolverine.addGrade(98);
        ash.addGrade(70);
        ash.addGrade(80);

        oneStudent.addStudent(ash);
        twoStudents.addStudent(batman);
        twoStudents.addStudent(ash);
    }

        @Test
        public void testAddStudent() {
        assertEquals(2, twoStudents.getStudents().size());
        assertEquals(1, oneStudent.getStudents().size());
        }

        @Test
        public void testGetStudent() {
        assertEquals(1, twoStudents.getStudents().get(0).getId());
        assertEquals(3, twoStudents.getStudents().get(1).getId());
        }

        @Test
        public void TestCohortAverage() {
        assertEquals(75, oneStudent.getCohortAverage(), 0);
//        assertEquals(83.3, twoStudents.getCohortAverage(), 0.5);
        }



}

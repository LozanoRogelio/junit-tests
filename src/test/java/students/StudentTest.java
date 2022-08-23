package students;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class StudentTest {
    Student Roger;
    Student Midlyn;
    Student Spiderman;

   @Before
    public void setUp() {
       Spiderman = new Student(2, "Peter Parker");

       Roger = new Student(1, "Last Name Ever First Name Greatest");
       Roger.addGrade(100);
       Roger.addGrade(98);
       Roger.addGrade(99);

       Midlyn = new Student(5, "Midlyn");
       Midlyn.addGrade(20);
       Midlyn.addGrade(50);
       Midlyn.addGrade(35);
   }

   @Test
    public void AddGradeWorksIf() {
       assertSame(98, Roger.getGrades().get(1));
       Spiderman.addGrade(100);
       assertTrue(Spiderman.getGrades().contains(100));

   }

   @Test
    public void getGradeAverageWorksIf () {

   }

}

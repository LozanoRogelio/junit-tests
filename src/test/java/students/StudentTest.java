package students;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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
       assertSame(98, Roger.grades.get(1));
       Spiderman.addGrade(100);
       assertTrue(Spiderman.grades.contains(100));

   }

   @Test
    public void getGradeAverageWorksIf () {
       double expected = 89.1;
       double actual = 89.0000001;
       assertEquals(expected, actual, .1);
        assertEquals(35, Midlyn.getGradeAverage(), 0 );
        assertEquals(99, Roger.getGradeAverage(), 0 );
   }

   @Test
    public void TestDeleteGrade() {
       Roger.deleteGrade(2);
        assertEquals(2, Roger.grades.size());
        assertFalse(Roger.grades.contains(99));
   }

   @Test
    public void TestUpdateGrade() {
       Midlyn.updateGrade(0, 95);

       assertTrue(Midlyn.grades.contains(95));
   }




}

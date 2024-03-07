import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTest {
    private GradeBook gradeBook1;
    private GradeBook gradeBook2;

    @Before
    public void setUp() {
        gradeBook1 = new GradeBook(5);
        gradeBook2 = new GradeBook(5);

        // Adding scores to gradeBook1
        gradeBook1.addScore(80);
        gradeBook1.addScore(90);

        // Adding scores to gradeBook2
        gradeBook2.addScore(75);
        gradeBook2.addScore(85);
    }

    @After
    public void tearDown() {
        gradeBook1 = null;
        gradeBook2 = null;
    }

    @Test
    public void testAddScore() {
        assertEquals("80.0 90.0", gradeBook1.toString());
        assertEquals(2, gradeBook1.getScoreSize());

        assertEquals("75.0 85.0", gradeBook2.toString());
        assertEquals(2, gradeBook2.getScoreSize());
    }

    @Test
    public void testSum() {
        assertEquals(170.0, gradeBook1.sum(), 0.01);
        assertEquals(160.0, gradeBook2.sum(), 0.01);
    }

    @Test
    public void testMinimum() {
        assertEquals(80.0, gradeBook1.minimum(), 0.01);
        assertEquals(75.0, gradeBook2.minimum(), 0.01);
    }

    @Test
    public void testFinalScore() {
        assertEquals(90.0, gradeBook1.finalScore(), 0.01);
        assertEquals(85.0, gradeBook2.finalScore(), 0.01);
    }
}

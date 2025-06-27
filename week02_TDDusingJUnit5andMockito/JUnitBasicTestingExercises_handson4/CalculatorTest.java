package week02_TDDusingJUnit5andMockito.JUnitBasicTestingExercises_handson4;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class CalculatorTest {

    private Calculator calc;

    // Setup: runs before each test
    @Before
    public void setUp() {
        System.out.println("Setting up...");
        calc = new Calculator(); // Arrange
    }

    // Teardown: runs after each test
    @After
    public void tearDown() {
        System.out.println("Cleaning up...");
        calc = null;
    }

    // Test add method using AAA
    @Test
    public void testAddition() {
        // Arrange handled in @Before

        // Act
        int result = calc.add(10, 5);

        // Assert
        assertEquals(15, result);
    }

    // Test subtract method using AAA
    @Test
    public void testSubtraction() {
        // Arrange handled in @Before

        // Act
        int result = calc.subtract(10, 5);

        // Assert
        assertEquals(5, result);
    }
}


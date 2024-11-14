package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ApplicationTest {

    @Test
    public void testSimpleInterest() {
        Application app = new Application();
        double result = app.simpleInterest(1000, 2, 5);
        assertEquals(100.0, result, 0.001);
    }

    @Test
    public void testDiscount() {
        Application app = new Application();
        double result = app.discount(200, 10);
        assertEquals(20.0, result, 0.001);
    }

    @Test
    public void testMinValue() {
        Application app = new Application();
        int[] arr = {5, 3, 8, 1, 4};
        int result = app.minValue(arr);
        assertEquals(1, result);
    }

    @Test
    public void testMinValueWithEmptyArray() {
        Application app = new Application();
        int[] arr = {};
        Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            app.minValue(arr);
        });
        assertEquals("Index 0 out of bounds for length 0", exception.getMessage());
    }
}

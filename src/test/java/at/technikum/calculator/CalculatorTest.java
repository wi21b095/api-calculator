package at.technikum.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calc = new Calculator();

    @BeforeEach
    void before(){
        calc = new Calculator();
    }

    @Test
    void testSum(){
        int res = calc.sum(1,3);
        assertEquals(4, res);
    }

    @Test
    void testMultiply(){
        int res = calc.multiply(2,3);
        assertEquals(6, res);
    }

    @Test
    void testDivide() throws Exception {
        int res = calc.divide(4,2);
        assertEquals(2, res);
        assertThrowsExactly(Exception.class, () -> calc.divide(5,0));
        assertDoesNotThrow(() -> calc.divide(5, 3));
    }
}

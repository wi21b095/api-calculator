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
}

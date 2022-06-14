package at.technikum.calculator;

public class Calculator {
    public int sum (int a, int b){
        return a + b;
    }

    public int multiply (int a, int b){
        return a * b;
    }

    public int divide (int divisor, int dividend) throws Exception {
        if (dividend == 0){
            throw new Exception("Divided by 0");
        }

        return divisor / dividend;
    }
}


package at.technikum.calculator;

import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {

    Calculator calc = new Calculator();

    @GetMapping("/sum")
    public int sum(@RequestParam int a, @RequestParam int b) {
        return calc.sum(a,b);
    }
}

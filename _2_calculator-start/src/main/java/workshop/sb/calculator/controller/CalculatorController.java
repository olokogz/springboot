package workshop.sb.calculator.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/calculator/sum/{a}/{b}")
    public double addValue(@PathVariable double a,@PathVariable double b)
    {
        return a+b;
    }
    @GetMapping("/calculator/substract/{a}/{b}")
    public double substract(@PathVariable double a, @PathVariable double b)
    {
        return a-b;
    }
    @GetMapping("/calculator/multiply")
    public double multiply(@RequestParam(value="liczba1") double a, @RequestParam(value="liczba2") double b)
    {
        return a*b;
    }
    @GetMapping("/calculator/divide")
    public double divide(@RequestParam(value="liczba1") double a, @RequestParam(value="liczba2") double b)
    {
        return a/b;
    }



}

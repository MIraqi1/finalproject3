package com.calculator.app.calculatorapp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorApp {


    @GetMapping("/multiply/{x}/{y}")
    public Response multiply(@PathVariable int x, @PathVariable int y){
        return new Response(x, y, x*y);
    }





}

package com.kodilla.calculator.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {

        SpringApplication.run(CalculatorApplication.class, args);
        Calculator calculator = new Calculator(5, 10);
        System.out.println(calculator.addNumbers());
        System.out.println(calculator.substractNumbers());
    }

}

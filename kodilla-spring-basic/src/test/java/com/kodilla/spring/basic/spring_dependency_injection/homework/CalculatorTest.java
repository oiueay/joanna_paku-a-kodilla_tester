package com.kodilla.spring.basic.spring_dependency_injection.homework;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class CalculatorTest {


    @Test
    public void shouldReturnCorrectValue() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Display bean = context.getBean(Display.class);
        Double result = bean.display(0.0);
        Assertions.assertNotNull(result);
    }

    @Test
    public void shouldReturnResultOfAddOperation() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.add(3.0, 2.0);
        Assertions.assertEquals(5.0, result, 0.01);
    }

    @Test
    public void shouldReturnResultOfSubtractOperation() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.subtract(3.0, 2.0);
        Assertions.assertEquals(1.0, result, 0.01);
    }

    @Test
    public void shouldReturnResultOfMultiplyOperation() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.multiply(3.0, 2.0);
        Assertions.assertEquals(6.0, result, 0.01);
    }

    @Test
    public void shouldReturnResultOfDivideOperation() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.divide(3.0, 2.0);
        Assertions.assertEquals(1.5, result, 0.01);
    }
}



package com.kodilla.spring.basic.spring_dependency_injection.homework2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ShippingCenterTest {

    @Test
    public void shouldDeliverPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryService bean = context.getBean(DeliveryService.class);
        Boolean deliverPackage = bean.deliverPackage("ul.XXX", 10.0);
        Assertions.assertEquals(true, deliverPackage);
    }

    @Test
    public void shouldReturnCorrectAddress() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        NotificationService bean = context.getBean(NotificationService.class);
        String address = bean.success("ul. Piękna");
        Assertions.assertNotNull(address);
    }

    @Test
    public void shouldReturnInCorrectAddress() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        NotificationService bean = context.getBean(NotificationService.class);
        String address = bean.fail("ul. Złota");
        Assertions.assertNotNull(address);
    }

    @Test
    public void shouldSendPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String sendPackage = bean.sendPackage("ul. Piękna", 10.0);
        Assertions.assertEquals("Package delivered to: ul. Piękna", sendPackage);
    }
}
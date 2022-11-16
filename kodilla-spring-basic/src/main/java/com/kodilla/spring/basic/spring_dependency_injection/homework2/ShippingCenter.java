package com.kodilla.spring.basic.spring_dependency_injection.homework2;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class ShippingCenter {

    @Resource(name = "deliveryService")
    private DeliveryServiceInterface deliveryServiceInterface;
    @Resource(name = "notificationService")
    private NotificationServiceInterface notificationServiceInterface;

    public String sendPackage(String address, double weight) {
        if (deliveryServiceInterface.deliverPackage(address, weight)) {
            return notificationServiceInterface.success(address);
        }
        return notificationServiceInterface.fail(address);
    }
}
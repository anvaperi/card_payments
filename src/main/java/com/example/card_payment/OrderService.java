package com.example.card_payment;

import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;


@Service
public abstract class OrderService {
    public static OrderEntity getDiscount(OrderEntity orderEntity) {
        KieSession kieSession = DroolsConfig.orderKieContainer().newKieSession();
        kieSession.insert(orderEntity);
        kieSession.fireAllRules();
        kieSession.dispose();
        return orderEntity;
    }
}

package com.example.card_payment;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderController {

    @PostMapping("/getDiscounts")
    public List<OrderEntity> getDiscounts(@RequestBody List<OrderEntity> orders) {
        List<OrderEntity> processedOrders = new ArrayList<>();
        for (OrderEntity orderEntity: orders) {
            processedOrders.add(OrderService.getDiscount(orderEntity));
        }
        return processedOrders;
    }

}
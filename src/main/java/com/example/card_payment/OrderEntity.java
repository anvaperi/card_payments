package com.example.card_payment;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
public class OrderEntity {

    private String name;
    private String cardType;
    private boolean cardBlocked = false;
    private Date expirationDate = new Date();
    private String country = "USA";
    private int discountPercentage;
    private Integer priceDollars;
    private String currency = "dollar";
    private boolean orderCancelled = false;

}
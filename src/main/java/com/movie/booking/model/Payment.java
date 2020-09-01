package com.movie.booking.model;

import com.movie.booking.types.PaymentType;

public class Payment {
    private Integer id;
    private Double totalAmount;
    private PaymentType paymentType;

    public Payment(Integer id, Double totalAmount, PaymentType paymentType) {
        this.id = id;
        this.totalAmount = totalAmount;
        this.paymentType = paymentType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
}

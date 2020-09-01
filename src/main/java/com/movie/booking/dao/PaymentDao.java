package com.movie.booking.dao;

import com.movie.booking.model.City;
import com.movie.booking.model.Payment;

import java.util.ArrayList;
import java.util.List;

public class PaymentDao {

    private List<Payment> payments = new ArrayList<Payment>();

    public boolean createPayment(Payment payment) {
        return payments.add(payment);
    }

    public boolean deletePayment(Integer id) {
        for (Payment payment : payments) {
            if (payment.getId().equals(id)) {
                return payments.remove(payment);
            }
        }
        return true;
    }

    public Payment getPayment(String id) {
        for (Payment payment : payments) {
            if (payment.getId().equals(id)) {
                return payment;
            }
        }
        return null;
    }

    public List<Payment> getAll() {
        return payments;
    }
}
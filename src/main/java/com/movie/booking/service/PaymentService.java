package com.movie.booking.service;

import com.movie.booking.dao.PaymentDao;
import com.movie.booking.model.City;
import com.movie.booking.model.Payment;

import java.util.List;

public class PaymentService {

    private PaymentDao paymentDao = new PaymentDao();

    public boolean createPayment(Payment payment) {
        return paymentDao.createPayment(payment);
    }

    public boolean deletePayment(Integer id) {
        return paymentDao.deletePayment(id);
    }

    public Payment getPayment(String id) {
        return paymentDao.getPayment(id);
    }

    public List<Payment> getAll(){
        return paymentDao.getAll();
    }
}

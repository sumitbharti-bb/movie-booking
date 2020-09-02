package com.movie.booking.service;

import com.movie.booking.dao.BookingDao;
import com.movie.booking.model.Booking;
import com.movie.booking.model.Movie;

import java.util.List;

public class BookingService {

    private BookingDao bookingDao = new BookingDao();

    public boolean createBooking(Booking booking) {
        return bookingDao.createBooking(booking);
    }

    public  boolean deleteBooking(String mobileNumber) {
        return bookingDao.deleteBooking(mobileNumber);
    }

    public Booking getBooking(String mobileNumber) {
        return bookingDao.getBooking(mobileNumber);
    }

    public List<Booking> getAll(){
        return bookingDao.getAll();
    }

}

package com.movie.booking.dao;

import com.movie.booking.model.Booking;
import com.movie.booking.model.Cinema;
import com.movie.booking.model.City;

import java.util.ArrayList;
import java.util.List;

public class BookingDao {

    private List<Booking> bookings = new ArrayList<Booking>();

    public boolean createBooking(Booking booking) {
        return bookings.add(booking);
    }

    public  boolean deleteBooking(String mobileNumber) {
        for(Booking booking : bookings) {
            if(booking.getUser().getMobileNumber().equals(mobileNumber)) {
                return bookings.remove(booking);
            }
        }
        return true;
    }

    public Booking getBooking(String mobileNumber) {
        for(Booking booking : bookings) {
            if(booking.getUser().getMobileNumber().equals(mobileNumber)) {
                return booking;
            }
        }
        return null;
    }

    public List<Booking> getAll(){
        return bookings;
    }

}

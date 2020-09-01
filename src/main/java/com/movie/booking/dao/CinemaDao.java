package com.movie.booking.dao;

import com.movie.booking.model.Booking;
import com.movie.booking.model.Cinema;
import com.movie.booking.model.CinemaHall;

import java.util.ArrayList;
import java.util.List;

public class CinemaDao {

    private List<Cinema> cinemas = new ArrayList<Cinema>();

    public boolean createCinema(Cinema cinema) {
        return cinemas.add(cinema);
    }

    public  boolean deleteCinema(String name) {
        for(Cinema cinema : cinemas) {
            if(cinema.getName().equals(name)) {
                return cinemas.remove(cinema);
            }
        }
        return true;
    }

    public Cinema getCinema(String name) {
        for(Cinema cinema : cinemas) {
            if(cinema.getName().equals(name)) {
                return cinema;
            }
        }
        return null;
    }

    public List<Cinema> getAll(){
        return cinemas;
    }
}

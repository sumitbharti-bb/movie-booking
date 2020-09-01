package com.movie.booking.dao;

import com.movie.booking.model.CinemaHall;
import com.movie.booking.model.City;

import java.util.ArrayList;
import java.util.List;

public class CinemaHallDao {

    private List<CinemaHall> cinemaHalls = new ArrayList<CinemaHall>();

    public boolean createCinemaHall(CinemaHall cinemaHall) {
        return cinemaHalls.add(cinemaHall);
    }

    public boolean deleteCinemaHall(String cinemaName, String cinemaHallName) {
        for (CinemaHall cinemaHall : cinemaHalls) {
            if (cinemaHall.getCinema().getName().equals(cinemaName) && cinemaHall.getName().equals(cinemaHallName)) {
                return cinemaHalls.remove(cinemaHall);
            }
        }
        return true;
    }

    public CinemaHall getCinemaHall(String cinemaName, String cinemaHallName) {
        for (CinemaHall cinemaHall : cinemaHalls) {
            if (cinemaHall.getCinema().getName().equals(cinemaName) && cinemaHall.getName().equals(cinemaHallName)) {
                return cinemaHall;
            }
        }
        return null;
    }

    public List<CinemaHall> getAll(){
        return cinemaHalls;
    }
}

package com.movie.booking.service;

import com.movie.booking.dao.CinemaDao;
import com.movie.booking.model.Cinema;
import com.movie.booking.model.CinemaHall;

import java.util.List;

public class CinemaService {

    private CinemaDao cinemaDao = new CinemaDao();

    public boolean createCinema(Cinema cinema) {
        return cinemaDao.createCinema(cinema);
    }

    public  boolean deleteCinema(String name) {
        return cinemaDao.deleteCinema(name);
    }

    public Cinema getCinema(String name) {
        return cinemaDao.getCinema(name);
    }

    public List<Cinema> getAll(){
        return cinemaDao.getAll();
    }
}

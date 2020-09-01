package com.movie.booking.service;

import com.movie.booking.dao.CinemaHallDao;
import com.movie.booking.model.CinemaHall;

public class CinemaHallService {

    private CinemaHallDao cinemaHallDao = new CinemaHallDao();
    public boolean createCinemaHall(CinemaHall cinemaHall) {
        return cinemaHallDao.createCinemaHall(cinemaHall);
    }

    public boolean deleteCinemaHall(String cinemaName, String cinemaHallName) {
        return cinemaHallDao.deleteCinemaHall(cinemaName, cinemaHallName);
    }

    public CinemaHall getCinemaHall(String cinemaName, String cinemaHallName) {
        return cinemaHallDao.getCinemaHall(cinemaName, cinemaHallName);
    }
}

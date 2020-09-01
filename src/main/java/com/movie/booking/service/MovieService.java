package com.movie.booking.service;

import com.movie.booking.dao.MovieDao;
import com.movie.booking.model.Movie;

import java.util.List;

public class MovieService {

    private MovieDao movieDao = new MovieDao();

    public boolean createMovie(Movie movie) {
        return movieDao.createMovie(movie);
    }

    public  boolean deleteMovie(String name) {
        return movieDao.deleteMovie(name);
    }

    public Movie getBooking(String name) {
        return movieDao.getBooking(name);
    }

    public List<Movie> getAll(){
        return movieDao.getAll();
    }
}

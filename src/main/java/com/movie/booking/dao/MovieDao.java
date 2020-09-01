package com.movie.booking.dao;

import com.movie.booking.model.Booking;
import com.movie.booking.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieDao {

    private List<Movie> movies = new ArrayList<Movie>();

    public boolean createMovie(Movie movie) {
        return movies.add(movie);
    }

    public  boolean deleteMovie(String name) {
        for(Movie movie : movies) {
            if(movie.getName().equals(name)) {
                return movies.remove(movie);
            }
        }
        return true;
    }

    public Movie getBooking(String name) {
        for(Movie movie : movies) {
            if(movie.getName().equals(name)) {
                return movie;
            }
        }
        return null;
    }

    public List<Movie> getAll(){
        return movies;
    }

}

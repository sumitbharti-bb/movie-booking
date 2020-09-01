package com.movie.booking.model;

import java.util.List;

public class CinemaHall {
    private Integer id;
    private String name;
    private Cinema cinema;
    private LocationArea locationArea;
    private Movie movie;
    private Integer totalSeatCapacity;
    private List<Seat> seats;

    public CinemaHall(Integer id, String name, Cinema cinema, LocationArea locationArea, Movie movie, Integer totalSeatCapacity) {
        this.id = id;
        this.name = name;
        this.cinema = cinema;
        this.locationArea = locationArea;
        this.movie = movie;
        this.totalSeatCapacity = totalSeatCapacity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public LocationArea getLocationArea() {
        return locationArea;
    }

    public void setLocationArea(LocationArea locationArea) {
        this.locationArea = locationArea;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

}

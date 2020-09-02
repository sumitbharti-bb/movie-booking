package com.movie.booking.model;

import java.util.ArrayList;
import java.util.List;

public class Cinema {

    private Integer id;
    private String name;
    private List<CinemaHall> cinemaHalls = new ArrayList<CinemaHall>();

    public Cinema(Integer id, String name) {
        this.id = id;
        this.name = name;
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

    public List<CinemaHall> getCinemaHalls() {
        return cinemaHalls;
    }

    public void setCinemaHalls(List<CinemaHall> cinemaHalls) {
        this.cinemaHalls = cinemaHalls;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cinemaHalls=" + cinemaHalls +
                '}';
    }
}

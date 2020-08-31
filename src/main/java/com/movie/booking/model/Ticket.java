package com.movie.booking.model;

import java.util.List;

public class Ticket {
    private Integer id;
    private List<Seat> seats;
    private List<User> users;

    public Ticket(Integer id, List<Seat> seats, List<User> users) {
        this.id = id;
        this.seats = seats;
        this.users = users;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}

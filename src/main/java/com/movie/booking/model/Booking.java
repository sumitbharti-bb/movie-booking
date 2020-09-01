package com.movie.booking.model;

public class Booking {
    private Integer id;
    private User user;
    private Ticket ticket;
    private ShowTime showTime;
    private Movie movie;
    private CinemaHall cinemaHall;
    private Payment payment;

    public Booking(Integer id, User user, Ticket ticket, ShowTime showTime, Movie movie, CinemaHall cinemaHall) {
        this.id = id;
        this.user = user;
        this.ticket = ticket;
        this.showTime = showTime;
        this.movie = movie;
        this.cinemaHall = cinemaHall;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public ShowTime getShowTime() {
        return showTime;
    }

    public void setShowTime(ShowTime showTime) {
        this.showTime = showTime;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public CinemaHall getCinemaHall() {
        return cinemaHall;
    }

    public void setCinemaHall(CinemaHall cinemaHall) {
        this.cinemaHall = cinemaHall;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}

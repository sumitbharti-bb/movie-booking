package com.movie.booking.model;

import com.movie.booking.types.SeatStatus;
import com.movie.booking.types.SeatType;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CinemaHall {
    private Integer id;
    private String name;
    private Cinema cinema;
    private LocationArea locationArea;
    private Movie movie;
    private Integer totalGoldSeatCapacity;
    private Integer totalSilverSeatCapacity;
    private Integer totalPlatinumSeatCapacity;
    private List<Seat> seats = new ArrayList<Seat>();

    public CinemaHall(Integer id, String name,Integer totalGoldSeatCapacity, Integer totalSilverSeatCapacity, Integer totalPlatinumSeatCapacity) {
        this.id = id;
        this.name = name;
        this.totalSilverSeatCapacity = totalSilverSeatCapacity;
        this.totalGoldSeatCapacity = totalGoldSeatCapacity;
        this.totalPlatinumSeatCapacity = totalPlatinumSeatCapacity;
        addSeatsToCinemaHall();
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

    public Integer getTotalGoldSeatCapacity() {
        return totalGoldSeatCapacity;
    }

    public void setTotalGoldSeatCapacity(Integer totalGoldSeatCapacity) {
        this.totalGoldSeatCapacity = totalGoldSeatCapacity;
    }

    public Integer getTotalSilverSeatCapacity() {
        return totalSilverSeatCapacity;
    }

    public void setTotalSilverSeatCapacity(Integer totalSilverSeatCapacity) {
        this.totalSilverSeatCapacity = totalSilverSeatCapacity;
    }

    public Integer getTotalPlatinumSeatCapacity() {
        return totalPlatinumSeatCapacity;
    }

    public void setTotalPlatinumSeatCapacity(Integer totalPlatinumSeatCapacity) {
        this.totalPlatinumSeatCapacity = totalPlatinumSeatCapacity;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public void addMovieToCinemaHall(Movie movie){
        this.movie = movie;
    }

    public void addSeatsToCinemaHall(){
        int seatIndex=1;
        for(int silverSeatIndex=0;silverSeatIndex<totalSilverSeatCapacity;silverSeatIndex++){
            Seat seat = new Seat(seatIndex, seatIndex, SeatType.SILVER, SeatStatus.AVAILABLE, 20.00);
            seatIndex++;
            seats.add(seat);
        }

        for(int goldSeatIndex=0;goldSeatIndex<totalGoldSeatCapacity;goldSeatIndex++){
            Seat seat = new Seat(seatIndex, seatIndex, SeatType.GOLD, SeatStatus.AVAILABLE, 25.00);
            seatIndex++;
            seats.add(seat);
        }

        for(int platinumSeatIndex=0;platinumSeatIndex<totalPlatinumSeatCapacity;platinumSeatIndex++){
            Seat seat = new Seat(seatIndex, seatIndex, SeatType.PLATINUM, SeatStatus.AVAILABLE, 35.00);
            seatIndex++;
            seats.add(seat);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CinemaHall that = (CinemaHall) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

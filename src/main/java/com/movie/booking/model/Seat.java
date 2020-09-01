package com.movie.booking.model;

import com.movie.booking.types.SeatStatus;
import com.movie.booking.types.SeatType;

public class Seat {
    private Integer id;
    private Integer seatNumber;
    private SeatType seatType;
    private SeatStatus seatStatus;
    private Double price;

    public Seat(Integer id, Integer seatNumber, SeatType seatType, SeatStatus seatStatus, Double price) {
        this.id = id;
        this.seatNumber = seatNumber;
        this.seatType = seatType;
        this.seatStatus = seatStatus;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public SeatStatus getSeatStatus() {
        return seatStatus;
    }

    public void setSeatStatus(SeatStatus seatStatus) {
        this.seatStatus = seatStatus;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

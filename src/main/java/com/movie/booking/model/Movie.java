package com.movie.booking.model;

import com.movie.booking.types.Genre;

public class Movie {
    private Integer id;
    private String name;
    private String description;
    private Genre genre;

    public Movie(Integer id, String name, String description, Genre genre) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.genre = genre;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}

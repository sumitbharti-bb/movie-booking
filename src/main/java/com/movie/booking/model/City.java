package com.movie.booking.model;

import java.util.List;

public class City {

    private Integer id;
    private String name;
    private List<LocationArea> locationAreas;

    public City(Integer id, String name) {
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

    public List<LocationArea> getLocationAreas() {
        return locationAreas;
    }

    public void setLocationAreas(List<LocationArea> locationAreas) {
        this.locationAreas = locationAreas;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", locationAreas=" + locationAreas +
                '}';
    }
}

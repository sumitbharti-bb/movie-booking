package com.movie.booking.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class City {

    private Integer id;
    private String name;
    private List<LocationArea> locationAreas = new ArrayList<LocationArea>();

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(id, city.id) &&
                Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

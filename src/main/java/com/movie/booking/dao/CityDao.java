package com.movie.booking.dao;

import com.movie.booking.model.City;
import com.movie.booking.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class CityDao {

    private List<City> cities = new ArrayList<City>();

    public boolean createCity(City city) {
        return cities.add(city);
    }

    public  boolean deleteCity(String cityName) {
        for(City city : cities) {
            if(city.getName().equals(cityName)) {
                return cities.remove(city);
            }
        }
        return true;
    }

    public City getCity(String cityName) {
        for(City city : cities) {
            if(city.getName().equals(cityName)) {
                return city;
            }
        }
        return null;
    }

    public List<City> getAll(){
        return cities;
    }
}

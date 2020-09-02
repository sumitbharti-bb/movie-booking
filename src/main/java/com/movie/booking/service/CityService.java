package com.movie.booking.service;

import com.movie.booking.dao.CinemaDao;
import com.movie.booking.dao.CityDao;
import com.movie.booking.model.Cinema;
import com.movie.booking.model.City;

import java.util.List;

public class CityService {

    private CityDao cityDao = new CityDao();
    public boolean createCity(City city) {
        return cityDao.createCity(city);
    }

    public  boolean deleteCity(String cityName) {
        return cityDao.deleteCity(cityName);
    }

    public City getCity(String cityName) {
      return cityDao.getCity(cityName);
    }

    public List<City> getAll(){
        return cityDao.getAll();
    }
}

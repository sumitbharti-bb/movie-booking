package com.movie.booking.service;

import com.movie.booking.dao.LocationAreaDao;
import com.movie.booking.dao.UserDao;
import com.movie.booking.model.LocationArea;
import com.movie.booking.model.User;

import java.util.List;

public class LocationAreaService {

    private LocationAreaDao locationAreaDao = new LocationAreaDao();

    public boolean createLocation(LocationArea locationArea) {
        return locationAreaDao.createLocation(locationArea);
    }

    public  boolean deleteLocation(String cityName, String locationName) {
        return locationAreaDao.deleteLocation(cityName, locationName);
    }

    public LocationArea getLocationArea(String cityName, String locationName) {
        return locationAreaDao.getLocationArea(cityName, locationName);
    }

    public List<LocationArea> getAll(){
        return locationAreaDao.getAll();
    }
}

package com.movie.booking.dao;

import com.movie.booking.model.LocationArea;
import com.movie.booking.model.User;

import java.util.ArrayList;
import java.util.List;

public class LocationAreaDao {

    private List<LocationArea> locationAreas = new ArrayList<LocationArea>();

    public boolean createLocation(LocationArea locationArea) {
        return locationAreas.add(locationArea);
    }

    public  boolean deleteLocation(String cityName, String locationName) {
        for(LocationArea locationArea : locationAreas) {
            if(locationArea.getName().equals(locationName) && locationArea.getCity().getName().equals(cityName)) {
                return locationAreas.remove(locationArea);
            }
        }
        return true;
    }

    public LocationArea getLocationArea(String cityName, String locationName) {
        for(LocationArea locationArea : locationAreas) {
            if(locationArea.getName().equals(locationName) && locationArea.getCity().getName().equals(cityName)) {
                return locationArea;
            }
        }
        return null;
    }

    public List<LocationArea> getAll(){
        return locationAreas;
    }
}

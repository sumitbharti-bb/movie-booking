package com.movie.booking.core;

import com.movie.booking.model.*;
import com.movie.booking.service.*;
import com.movie.booking.types.Gender;
import com.movie.booking.types.Genre;

import java.util.*;

public class MovieBookingApplication {

    private static BookingService bookingService = new BookingService();
    private static MovieService movieService = new MovieService();
    private static CinemaService cinemaService = new CinemaService();
    private static CinemaHallService cinemaHallService = new CinemaHallService();
    private static CityService cityService = new CityService();
    private static UserService userService = new UserService();
    private static  PaymentService paymentService = new PaymentService();
    private static LocationAreaService locationAreaService = new LocationAreaService();

    public static void main(String[] args) {

        //Create all required data.
        initApplication();

        //Solve for questions:
        getAllCitiesAndCinemaHallInCities();
        getAllCinemasAndCinemaHalls();
        findAllSeatStatusForGivenMovieInGivenCity("patna");
    }

    private static void initApplication(){
        createUsers();
        createCities();
        createLocationAreas();
        createCinemas();
        createMovies();
    }

    private static void createUsers(){
        List<User> users = new ArrayList<User>();
        User user1 = new User(1,"sumit","sumit@gmail.com", Gender.MALE,"1234567890");
        User user2 = new User(2,"ramesh","ramesh@gmail.com", Gender.MALE,"2234567890");
        User user3 = new User(3,"rahul","rahul@gmail.com", Gender.MALE,"3234567890");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        for(User user: users){
            userService.createUser(user);
        }
    }

    private static void createCities(){
        List<City> cities = new ArrayList<City>();
        City city1 = new City(1, "patna");
        City city2 = new City(2, "darbhanga");
        cities.add(city1);
        cities.add(city2);
        for(City city : cities) {
            cityService.createCity(city);
        }
    }

    private static void createLocationAreas(){
        List<String> patnaLocationNames = new ArrayList<String>();
        patnaLocationNames.add("gandhimaidan");
        patnaLocationNames.add("baileyRoad");
        patnaLocationNames.add("incomeTaxRoad");
        createLocationAreas("patna", patnaLocationNames, 1);

        List<String> darbhangaLocationNames = new ArrayList<String>();
        darbhangaLocationNames.add("bentachowk");
        darbhangaLocationNames.add("stationroad");
        createLocationAreas("darbhanga", darbhangaLocationNames, 4);
    }

    private static void createLocationAreas(String cityName, List<String> locationNames, int startId){
        City city = cityService.getCity(cityName);
        for(String locationAreaName : locationNames) {
            LocationArea locationArea = new LocationArea(startId,locationAreaName,city);
            locationAreaService.createLocation(locationArea);
            city.getLocationAreas().add(locationArea);
        }
    }

    private static void createCinemas(){
        List<Cinema> cinemas = new ArrayList<Cinema>();
        Cinema pvrCinema = new Cinema(1, "pvr");
        Cinema bigCinema = new Cinema(2, "bigCinema");
        Cinema iMaxCinema = new Cinema(2, "iMaxCinema");
        cinemas.add(pvrCinema);
        cinemas.add(bigCinema);
        cinemas.add(iMaxCinema);
        for(Cinema cinema : cinemas) {
            cinemaService.createCinema(cinema);
        }

        addPvrCinemaHalls();
        addBigCinemaHalls();
        addIMaxCinemaHalls();
    }
    
    private static void createMovies(){
        List<Movie> movies = new ArrayList<Movie>();
        Movie xMenMovie = new Movie(1, "x-men","x-men movie", Genre.ACTION);
        Movie ironManMovie = new Movie(2, "iron-man","iron-man movie", Genre.ACTION);
        Movie ddljMovie = new Movie(3, "ddlj","ddlj movie", Genre.ROMANTIC);
        Movie twilightMovie = new Movie(4, "twilight","twilight movie", Genre.ROMANTIC);
        Movie raajMovie = new Movie(5, "raaj","raaj movie", Genre.HORROR);
        Movie anabelllaManMovie = new Movie(6, "anabella","anabella movie", Genre.HORROR);

        movies.add(xMenMovie);
        movies.add(ironManMovie);
        movies.add(ddljMovie);
        movies.add(twilightMovie);
        movies.add(raajMovie);
        movies.add(anabelllaManMovie);

        for(Movie movie : movies) {
            movieService.createMovie(movie);
        }
    }


    private static void addPvrCinemaHalls() {
        List<CinemaHall> patnaPvrCinemaHalls = new ArrayList<>();
        Cinema pvrCinema = cinemaService.getCinema("pvr");

        CinemaHall pvrGandhiMaidanCinemaHall = getCinemaHall(1, "patna", "pvrGandhiMaidan", "x-men", "gandhimaidan", 10, 10, 15);
        pvrGandhiMaidanCinemaHall.setCinema(pvrCinema);

        CinemaHall pvrBaileyRoadCinemaHall = getCinemaHall(2, "patna", "pvrBaileyRoad", "iron-man", "baileyRoad", 10, 10, 15);
        pvrBaileyRoadCinemaHall.setCinema(pvrCinema);

        CinemaHall pvrIncomeTaxCinemaHall = getCinemaHall(3, "patna", "pvrIncomeTax", "iron-man", "incomeTaxRoad", 5, 4, 7);
        pvrIncomeTaxCinemaHall.setCinema(pvrCinema);

        patnaPvrCinemaHalls.add(pvrGandhiMaidanCinemaHall);
        patnaPvrCinemaHalls.add(pvrBaileyRoadCinemaHall);
        patnaPvrCinemaHalls.add(pvrIncomeTaxCinemaHall);

        for(CinemaHall cinemaHall : patnaPvrCinemaHalls){
            cinemaHallService.createCinemaHall(cinemaHall);
        }

        pvrCinema.setCinemaHalls(patnaPvrCinemaHalls);
    }

    private static void addIMaxCinemaHalls() {
        List<CinemaHall> patnaIMaxCinemaHalls = new ArrayList<>();
        Cinema iMaxCinema = cinemaService.getCinema("iMaxCinema");

        CinemaHall iMaxGandhiMaidanCinemaHall = getCinemaHall(4, "patna", "iMaxGandhiMaidan", "x-men", "gandhimaidan", 10, 10, 15);
        iMaxGandhiMaidanCinemaHall.setCinema(iMaxCinema);

        CinemaHall iMaxBaileyRoadCinemaHall = getCinemaHall(5, "patna", "iMaxBaileyRoad", "raaj", "baileyRoad", 10, 10, 15);
        iMaxBaileyRoadCinemaHall.setCinema(iMaxCinema);

        CinemaHall iMaxIncomeTaxCinemaHall = getCinemaHall(6, "patna", "iMaxIncomeTax", "twilight", "incomeTaxRoad", 5, 4, 7);
        iMaxIncomeTaxCinemaHall.setCinema(iMaxCinema);

        patnaIMaxCinemaHalls.add(iMaxGandhiMaidanCinemaHall);
        patnaIMaxCinemaHalls.add(iMaxBaileyRoadCinemaHall);
        patnaIMaxCinemaHalls.add(iMaxIncomeTaxCinemaHall);

        for(CinemaHall cinemaHall : patnaIMaxCinemaHalls){
            cinemaHallService.createCinemaHall(cinemaHall);
        }

        iMaxCinema.setCinemaHalls(patnaIMaxCinemaHalls);
    }

    private static void addBigCinemaHalls() {
        List<CinemaHall> patnaBigCinemaCinemaHalls = new ArrayList<>();
        Cinema bigCinema = cinemaService.getCinema("bigCinema");

        CinemaHall bigCinemaGandhiMaidanCinemaHall = getCinemaHall(7,  "patna", "bigCinemaGandhiMaidan", "raaj", "gandhimaidan", 10, 10, 15);
        bigCinemaGandhiMaidanCinemaHall.setCinema(bigCinema);

        CinemaHall bigCinemaBaileyRoadCinemaHall = getCinemaHall(8, "patna", "bigCinemaBaileyRoad", "anabella", "baileyRoad", 10, 10, 15);
        bigCinemaBaileyRoadCinemaHall.setCinema(bigCinema);

        CinemaHall bigCinemaIncomeTaxCinemaHall = getCinemaHall(9, "patna", "bigCinemaIncomeTax", "iron-man", "incomeTaxRoad", 5, 4, 7);
        bigCinemaIncomeTaxCinemaHall.setCinema(bigCinema);

        patnaBigCinemaCinemaHalls.add(bigCinemaGandhiMaidanCinemaHall);
        patnaBigCinemaCinemaHalls.add(bigCinemaBaileyRoadCinemaHall);
        patnaBigCinemaCinemaHalls.add(bigCinemaIncomeTaxCinemaHall);

        for(CinemaHall cinemaHall : patnaBigCinemaCinemaHalls){
            cinemaHallService.createCinemaHall(cinemaHall);
        }
        bigCinema.setCinemaHalls(patnaBigCinemaCinemaHalls);
    }

    private static CinemaHall getCinemaHall(Integer id,
                                             String cityName,
                                             String cinemaHallName,
                                             String movieName,
                                             String locationName,
                                             Integer silverSeatCapacity,
                                             Integer goldSeatCapacity,
                                             Integer platinumSeatCapacity){
        LocationArea locationArea = locationAreaService.getLocationArea(cityName, locationName);
        Movie movie = movieService.getMovie(movieName);
        CinemaHall cinemaHall = new CinemaHall(id, cinemaHallName, goldSeatCapacity, silverSeatCapacity, platinumSeatCapacity);
        cinemaHall.setLocationArea(locationArea);
        cinemaHall.setMovie(movie);
        return cinemaHall;
    }

    private static void getAllCitiesAndCinemaHallInCities(){
        List<Cinema> cinemas = cinemaService.getAll();
        Map<City, Set<CinemaHall>> cityCinemaHallMap = new HashMap<>();
        if(cinemas != null && !cinemas.isEmpty()){

            for(Cinema cinema : cinemas) {
                List<CinemaHall> cinemaHalls = cinema.getCinemaHalls();
                if(cinemaHalls != null && !cinemaHalls.isEmpty()){

                    for(CinemaHall cinemaHall : cinemaHalls){
                            Set<CinemaHall> cinemaHallSet = cityCinemaHallMap.get(cinemaHall.getLocationArea().getCity());
                            if(cinemaHallSet == null || cinemaHallSet.isEmpty()){
                                cinemaHallSet = new HashSet<>();
                            }
                        cinemaHallSet.add(cinemaHall);
                        cityCinemaHallMap.put(cinemaHall.getLocationArea().getCity(), cinemaHallSet);
                    }
                }
            }
        }

        for(City city: cityCinemaHallMap.keySet()){
            System.out.println("City: " + city.getName());
            System.out.println("Below are cinemahalls: ");
            for(CinemaHall cinemaHall : cityCinemaHallMap.get(city)){
                System.out.println(cinemaHall.getName());
            }
        }
    }

    private static void getAllCinemasAndCinemaHalls(){
        List<Cinema> cinemas = cinemaService.getAll();
        if(cinemas != null && !cinemas.isEmpty()){
            for(Cinema cinema : cinemas) {
                System.out.println("Cinema: " + cinema.getName());
                System.out.println("Below are cinemahalls of " + cinema.getName());
                for(CinemaHall cinemaHall : cinema.getCinemaHalls()){
                    System.out.println("CInemahall: " + cinemaHall.getName());
                }
            }
        }
    }

    private static void getAllMoviesPerCinemaPerCity(){

    }

    private static void findAllSeatStatusForGivenMovieInGivenCity(String cityName){
        /**
         * 1. Get all cinemas.
         * 2. Get all cinemahalls of each cinema in given city.
         * 3. For each cinemahall and city check what all seats are available and what all are booked
         */
        List<Cinema> cinemas = cinemaService.getAll();
        if(cinemas != null && !cinemas.isEmpty()){
            for(Cinema cinema : cinemas){
                System.out.println("Below are cinemaHalls and seat status for cinema: "+cinema.getName() + " and city: " + cityName);
                List<CinemaHall> cinemaHalls = cinema.getCinemaHalls();
                if(cinemaHalls != null && !cinemaHalls.isEmpty()){
                    for(CinemaHall cinemaHall : cinemaHalls){
                        if(cinemaHall.getLocationArea().getCity().getName().equals(cityName)){
                            List<Seat> seats = cinemaHall.getSeats();
                            for(Seat seat : seats) {
                                System.out.println("Seat Number: " + seat.getSeatNumber() + " status is: "+ seat.getSeatStatus().name());
                            }
                        }
                    }
                }
            }
        }
    }

}

package service;

import model.City;


import java.util.List;

public interface CityDao {
    Integer add (City city);

    City getById(int id);
    List<City> getAllCities();

    void deleteCity (City city);

    void updateCity(City city, int id);
}

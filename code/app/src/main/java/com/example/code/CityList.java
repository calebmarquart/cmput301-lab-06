package com.example.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects.
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }

        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Counts the number of cities and returns the value as an integer
     * @return
     * An integer of the number of cities in the list.
     */
    public int countCities() {
        return cities.size();
    }

    /**
     * Determines if the list has a certain city.
     * @param city
     * The city to check if it's contained.
     * @return
     * True if the city is found in the list, false if not.
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Deletes a city
     * @param city
     * The city object to remove from the list.
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }

        cities.remove(city);
    }
}

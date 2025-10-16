package com.example.code;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City> {
    private String name;
    private String province;

    /**
     * Constructor for creating a city object
     * @param name
     * The name of the city.
     * @param province
     * The name of the province that the city is located in.
     */
    public City(String name, String province) {
        this.name = name;
        this.province = province;
    }

    /**
     * Gets the name of the city
     * @return
     * The city name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the city name
     * @param name
     * The name of the city
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the name of the province for the city
     * @return
     * The province name
     */
    public String getProvince() {
        return province;
    }

    /**
     * Sets the province name for the city
     * @param province
     * The province name
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * Compare 2 cities by name
     * @param city The city to compare with
     * @return
     * The compare value -1, 0, 1
     */
    @Override
    public int compareTo(City city) {
        return this.name.compareTo(city.getName());
    }
}


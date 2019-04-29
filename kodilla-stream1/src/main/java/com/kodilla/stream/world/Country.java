package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private final String countryName;
    private final BigDecimal countryPeopleQuantity;

    public Country(String countryName, BigDecimal countryPeopleQuantity) {
        this.countryName = countryName;
        this.countryPeopleQuantity = countryPeopleQuantity;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeopleQuantity() {
        return countryPeopleQuantity;
    }

    @Override
    public String toString() {
        return "Country{" +
                "CountryName='" + countryName + '\'' +
                ", CountryPeopleQuantity=" + countryPeopleQuantity +
                '}';
    }
}

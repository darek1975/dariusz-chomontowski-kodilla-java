package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    public List<Continent> continentList = new ArrayList<>();

    public void addContinent(Continent continent){
        continentList.add(continent);
    }

    public List<Continent> getContinentList() {
        return continentList;
    }

    public BigDecimal getPeopleQuantity() {

               return continentList.stream()
                .flatMap(continent -> continent.getListContinentCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

            }
}

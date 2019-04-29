package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testgetPeopleQuantity() {
        //Given
        BigDecimal bigDecimal1= new BigDecimal("40000000");
        BigDecimal bigDecimal2= new BigDecimal("30000000");
        BigDecimal bigDecimal3= new BigDecimal("50000000");
        BigDecimal bigDecimal4= new BigDecimal("60000000");
        Country Country1 = new Country("Poland", bigDecimal1);
        Country Country2 = new Country("Germany", bigDecimal2);
        Country Country3 = new Country("Maroco", bigDecimal3);
        Country Country4 = new Country("Egipt", bigDecimal4);
        Continent Europe = new Continent();
        Europe.addCountry(Country1);
        Europe.addCountry(Country2);
        Continent Africa = new Continent();
        Africa.addCountry(Country3);
        Africa.addCountry(Country4);


        //When
        World world = new World();
        BigDecimal totalPeople = world.getPeopleQuantity();



                //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("180000000");
        Assert.assertEquals(expectedPeopleQuantity, totalPeople);
    }
}

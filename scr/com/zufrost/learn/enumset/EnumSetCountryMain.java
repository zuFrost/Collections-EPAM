package com.zufrost.learn.enumset;

import java.util.EnumSet;

import static com.zufrost.learn.enumset.Country.*;

public class EnumSetCountryMain {
    public static void main(String[] args) {
//        EnumSet<Country> asiaCountries = EnumSet.of(Country.ARMENIA, Country.INDIA, Country.KAZAKHSTAN);
        EnumSet<Country> asiaCountries = EnumSet.of(ARMENIA, INDIA, KAZAKHSTAN);
//        String nameCountry = "India";
        String nameCountry = "Belarus";
        Country current = Country.valueOf(nameCountry.toUpperCase());
        if (asiaCountries.contains(current)) {
            System.out.println("Asia Action");
        }
        asiaCountries.forEach(country -> country.grow(1));


    }
}

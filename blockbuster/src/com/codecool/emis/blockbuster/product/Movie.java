package com.codecool.emis.blockbuster.product;

import java.time.LocalDate;

public class Movie extends Product {

    public Movie(String title, LocalDate releaseDate, int dailyRentalCost, int originalPrice) {
        super(title, releaseDate, dailyRentalCost, originalPrice);
    }
}

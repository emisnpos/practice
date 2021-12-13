package com.codecool.emis.blockbuster.product;

import java.time.LocalDate;

public class Music extends Product{
    public Music( String title, LocalDate releaseDate, int dailyRentalCost, int originalPrice) {
        super( title, releaseDate, dailyRentalCost, originalPrice);
    }
}

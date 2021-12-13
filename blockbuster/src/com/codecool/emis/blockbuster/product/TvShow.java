package com.codecool.emis.blockbuster.product;

import java.time.LocalDate;

public class TvShow extends Product {
    public TvShow( String title, LocalDate releaseDate, int dailyRentalCost, int originalPrice) {
        super( title, releaseDate, dailyRentalCost, originalPrice);
    }
}

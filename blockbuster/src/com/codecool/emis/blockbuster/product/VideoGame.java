package com.codecool.emis.blockbuster.product;

import java.time.LocalDate;

public class VideoGame extends Product {
    public VideoGame( String title, LocalDate releaseDate, int dailyRentalCost, int originalPrice) {
        super( title, releaseDate, dailyRentalCost, originalPrice);
    }
}

package com.codecool.emis.blockbuster.product;

import java.time.LocalDate;

public abstract class Product {

    private Platform platform;
    private String title;
    private LocalDate releaseDate;
    private int dailyRentalCost;
    private int originalPrice;
    private int howManyTimesRent;
    private boolean available = true;
    private static final int MIN_RENTED_DAY = 3;
    private static final int MAX_RENTED_DAY = 14;

    public Product(String title, LocalDate releaseDate, int dailyRentalCost, int originalPrice) {
        this.platform = platformSetter(releaseDate);
        this.title = title;
        this.releaseDate = releaseDate;
        this.dailyRentalCost = dailyRentalCost;
        this.originalPrice = originalPrice;
    }



    public Platform platformSetter(LocalDate localDate){
        if(this instanceof Movie || this instanceof TvShow){
            if(localDate.getYear() < 2000){
                return Platform.VHS;
            }
            if(localDate.getYear() <= 2010){
                return Platform.DVD;
            }
            return Platform.BLUERAY;
        }
       if(this instanceof Music){
           return Platform.CD;
       }
       return Platform.DVD;
    }

    public boolean isAvailable() {
        return available;
    }

    public void rented(){
        this.available = false;
        howManyTimesRent += 1;

    }


    public void getBackToShop(){
        this.available = true;
    }

    @Override
    public String toString() {
        return "Product{" +
                "platform=" + platform +
                ", title='" + title + '\'' +
                ", releaseDate=" + releaseDate +
                ", dailyRentalCost=" + dailyRentalCost +
                ", originalPrice=" + originalPrice +
                ", howManyTimesRent=" + howManyTimesRent +
                ", available=" + available +
                '}';
    }
}

package com.codecool.emis.blockbuster.product;

import java.time.LocalDate;

public class Product {

    private Platform platform;
    private String title;
    private LocalDate releaseDate;
    private int dailyRentalCost;
    private int originalPrice;
    private ProductType productType;
    private int howManyTimesRent = 0;
    private boolean available = true;



    public Product( ProductType productType, String title, LocalDate releaseDate, int dailyRentalCost, int originalPrice) {
        this.productType = productType;
        this.platform = anotherPlatformSetter(releaseDate);
        this.title = title;
        this.releaseDate = releaseDate;
        this.dailyRentalCost = dailyRentalCost;
        this.originalPrice = originalPrice;

    }

    public int getOriginalPrice() {
        return originalPrice;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getHowManyTimesRent() {
        return howManyTimesRent;
    }

    public void setHowManyTimesRent(int howManyTimesRent) {
        this.howManyTimesRent = howManyTimesRent;
    }

    public int getDailyRentalCost() {
        return dailyRentalCost;
    }

    public Platform getPlatformReleaseTime(LocalDate localDate){
        if(localDate.getYear() < 2000){
            return Platform.VHS;
        }
        if(localDate.getYear() <= 2010){
            return Platform.DVD;
        }
        return Platform.BLUERAY;
    }

    public boolean isMovieOrTvShow(){
        return productType.equals(ProductType.MOVIE) || productType.equals(ProductType.TVSHOW);
    }

    public Platform anotherPlatformSetter(LocalDate localDate){
        if(isMovieOrTvShow()){
           return getPlatformReleaseTime(localDate);
        }
        else if(productType.equals(ProductType.MUSIC)){
            return Platform.CD;
        }
        return Platform.DVD;
    }


    public boolean isAvailable() {
        return available;
    }


    @Override
    public String toString() {
        return "Product{" +
                "platform=" + platform +
                ", title='" + title + '\'' +
                ", releaseDate=" + releaseDate +
                ", dailyRentalCost=" + dailyRentalCost +
                ", originalPrice=" + originalPrice +
                ", productType=" + productType +
                ", howManyTimesRent=" + howManyTimesRent +
                ", available=" + available +
                '}';
    }
}

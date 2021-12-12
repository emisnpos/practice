package com.codecool.emis.concertorganizer.concert;

public enum ConcertType {

    INDOOR(3000, 1.5, 600),
    OUTDOOR(5000, 2, 800),
    FESTIVAL(8000, 6, 1000);

    private int maxCapacity;
    private double duration;
    private int beerPrize;

    ConcertType(int maxCapacity, double duration, int beerPrize) {
        this.maxCapacity = maxCapacity;
        this.duration = duration;
        this.beerPrize = beerPrize;
    }


    public int getBeerPrize() {
        return beerPrize;
    }
}

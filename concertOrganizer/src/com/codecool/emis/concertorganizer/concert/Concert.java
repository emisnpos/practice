package com.codecool.emis.concertorganizer.concert;

import com.codecool.emis.concertorganizer.band.Band;
import com.codecool.emis.concertorganizer.band.Style;

public class Concert {

    private Band mainBand;
    private Band warmUpBand;
    private Style style;
    private ConcertType concertType;
    private int ticketPrize;
    private int ticketNumber = 0;
    private int sellingBeer = 0;
    private static final int MAX_PRICE_FOR_TICKET = 15000;
    private static final int MIN_PRICE_FOR_TICKET = 12000;


    public Concert(Band mainBand, ConcertType concertType, int ticketPrize) {
        this.mainBand = mainBand;
        this.style = mainBand.getStyle();
        this.concertType = concertType;
        this.ticketPrize = ticketPriceRange(ticketPrize);
    }


    public void sellTicket(){
        ticketNumber += 1;
    }

    public int ticketProfit(){
        return ticketNumber * ticketPrize;
    }

    public int ticketPriceRange(int price){
        if(price >= MIN_PRICE_FOR_TICKET && price <= MAX_PRICE_FOR_TICKET){
            return price;
        }
        else{
            System.out.println("ez a koncert nem jó árat adott meg:" + this);
        }
       return 0;

    }

    public void sellBeer(){
        sellingBeer += 1;
    }

    public int beerProfit(){
        return sellingBeer * concertType.getBeerPrize();
    }

    public Band getMainBand() {
        return mainBand;
    }


    public void setWarmUpBand(Band warmUpBand) {
        this.warmUpBand = warmUpBand;
    }

    public ConcertType getConcertType() {
        return concertType;
    }

    @Override
    public String toString() {
        return "Concert{" +
                "mainBand=" + mainBand +
                ", warmUpBand=" + warmUpBand +
                ", style=" + style +
                ", concertType=" + concertType +
                ", ticketPrize=" + ticketPrize +
                '}';
    }
}

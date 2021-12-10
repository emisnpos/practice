package com.codecool.emis.concertorganizer.concert;

import com.codecool.emis.concertorganizer.band.Band;
import com.codecool.emis.concertorganizer.band.Style;

public class Concert {

    private Band mainBand;
    private Band warmUpBand;
    private Style style;
    private ConcertType concertType;
    private int ticketPrize;
    private int ticketNumber;
    private int sellingBeer;
    private static final int MAX_PRICE_FOR_TICKET = 15000;
    private static final int MIN_PRICE_FOR_TICKET = 12000;


    public Concert(Band mainBand, ConcertType concertType, int ticketPrize) {
        this.mainBand = mainBand;
        this.style = mainBand.getStyle();
        this.concertType = concertType;
        this.ticketPrize = ticketPrize;
    }


    public void sellTicket(){

    }

    public void sellBeer(){

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

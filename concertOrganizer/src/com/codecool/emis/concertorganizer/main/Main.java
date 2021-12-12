package com.codecool.emis.concertorganizer.main;

import com.codecool.emis.concertorganizer.ConcertOrganizer;
import com.codecool.emis.concertorganizer.band.Band;
import com.codecool.emis.concertorganizer.band.Style;
import com.codecool.emis.concertorganizer.concert.Concert;
import com.codecool.emis.concertorganizer.concert.ConcertType;

public class Main {

    public static void main(String[] args) {

        ConcertOrganizer concertOrganizer = new ConcertOrganizer();

        Band idles = new Band("IDLES", Style.ROCK, concertOrganizer);
        Band blockparty = new Band("Bloc Party", Style.ROCK, concertOrganizer);
        Band jazzband = new Band("The Jazz Messengers", Style.JAZZ, concertOrganizer);
        Band abba = new Band("ABBA", Style.POP, concertOrganizer);

        concertOrganizer.addBand(idles);
        concertOrganizer.addBand(blockparty);
        concertOrganizer.addBand(jazzband);
        concertOrganizer.addBand(abba);
        //concertOrganizer.printAllBandsWithWorkTogether();        <--------- band checker

        Concert firstConcert = new Concert(idles, ConcertType.INDOOR, 13000);
        Concert jazzConcert = new Concert(jazzband, ConcertType.INDOOR, 12000);
        Concert bigConcert = new Concert(blockparty, ConcertType.OUTDOOR, 14000);
        Concert festival = new Concert(abba, ConcertType.FESTIVAL, 15000);

        // ezt a Min Max price-t nem igazán értem, hogy kéne beállitani
        // írtam egy methodo-t ami csekkeli de ugyan ugy elkészül az objektum csak ticketPrize: 0 -val
        // ezt hogy tudnám okosabban csinálni ??
        //Concert expensiveFestival = new Concert(abba, ConcertType.FESTIVAL, 20000);

        concertOrganizer.addConcert(firstConcert);
        concertOrganizer.addConcert(jazzConcert);
        concertOrganizer.addConcert(bigConcert);
        concertOrganizer.addConcert(festival);
        //concertOrganizer.addConcert(expensiveFestival);

        //concertOrganizer.printAllConcerts();                     //<--------------- concert checker

        idles.choiceWarmUpBand(idles);
        idles.choiceWarmUpBand(abba);
        abba.choiceWarmUpBand(jazzband);
        jazzband.choiceWarmUpBand(idles);
        blockparty.choiceWarmUpBand(idles);
        //concertOrganizer.printAllConcerts();                  //<----------- band choice warmup band checker


        festival.sellBeer();
        festival.sellBeer();
        festival.sellBeer();
        festival.sellBeer(); // 4 x 1000

        firstConcert.sellBeer();
        firstConcert.sellBeer();
        firstConcert.sellBeer();
        firstConcert.sellBeer();
        firstConcert.sellBeer();
        firstConcert.sellBeer(); // 6 x 600

        //System.out.println("This is festival beer profit: " + festival.beerProfit());
        //System.out.println("This is firstConcert ticket profit: " + firstConcert.beerProfit());      //<--------------- this method calculate all beer profit


        festival.sellTicket();
        festival.sellTicket();
        festival.sellTicket();
        festival.sellTicket();
        festival.sellTicket(); // 5 x 15000

        firstConcert.sellTicket();
        firstConcert.sellTicket();
        firstConcert.sellTicket();
        firstConcert.sellTicket();
        firstConcert.sellTicket(); // 5 * 13000

        //System.out.println("This is festival ticket profit: " + festival.ticketProfit());
        //System.out.println("This is firstConcert ticket profit: " + firstConcert.ticketProfit());     //<---------------- this method calculate all ticket profit


        concertOrganizer.setRaining(true);

        concertOrganizer.cancelConcert(jazzConcert);
        concertOrganizer.cancelConcert(bigConcert);

        //System.out.println("------- -------- -------- ------- ");
        //concertOrganizer.printAllConcerts();               // <----------------------- this method check cancel concerts because raining


        //System.out.println("Company all profit is: " + concertOrganizer.getAllProfit());         // <---------------- this method calculate all profit


    }
}

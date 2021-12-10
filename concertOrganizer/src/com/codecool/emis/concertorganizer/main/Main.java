package com.codecool.emis.concertorganizer.main;

import com.codecool.emis.concertorganizer.ConcertOrganizer;
import com.codecool.emis.concertorganizer.band.Band;
import com.codecool.emis.concertorganizer.band.Style;
import com.codecool.emis.concertorganizer.concert.Concert;
import com.codecool.emis.concertorganizer.concert.ConcertType;

public class Main {

    public static void main(String[] args) {

        ConcertOrganizer concertOrganizer = new ConcertOrganizer();

        Band idles = new Band("IDLES", Style.ROCK);
        Band blockparty = new Band("Bloc Party", Style.ROCK);
        Band jazzband = new Band("The Jazz Messengers", Style.JAZZ);
        Band abba = new Band("ABBA", Style.POP);

        concertOrganizer.addBand(idles);
        concertOrganizer.addBand(blockparty);
        concertOrganizer.addBand(jazzband);
        concertOrganizer.addBand(abba);
        //concertOrganizer.printAllBandsWithWorkTogether();        <--------- band checker

        Concert firstConcert = new Concert(idles, ConcertType.INDOOR, 13000);
        Concert jazzConcert = new Concert(jazzband, ConcertType.INDOOR, 12000);
        Concert bigConcert = new Concert(blockparty, ConcertType.OUTDOOR, 14000);
        Concert festival = new Concert(abba, ConcertType.FESTIVAL, 15000);

        concertOrganizer.addConcert(firstConcert);
        concertOrganizer.addConcert(jazzConcert);
        concertOrganizer.addConcert(bigConcert);
        concertOrganizer.addConcert(festival);
        concertOrganizer.printAllConcerts();


    }
}

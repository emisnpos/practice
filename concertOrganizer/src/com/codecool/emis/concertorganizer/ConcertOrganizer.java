package com.codecool.emis.concertorganizer;

import com.codecool.emis.concertorganizer.band.Band;
import com.codecool.emis.concertorganizer.concert.Concert;
import com.codecool.emis.concertorganizer.concert.ConcertType;

import java.util.HashSet;
import java.util.Set;

public class ConcertOrganizer {

    private Set<Band> bands = new HashSet<>();
    private Set<Concert> concerts = new HashSet<>();
    private boolean isRaining = false;
    private static double profitPrecentage = 0.4;

    public void addBand(Band band){
        bands.add(band);
    }

    public void addConcert(Concert concert){
        concerts.add(concert);
    }

    public int getAllProfit(){
        return 0;
    }

    public void cancelConcert(Concert concert){
        if(concert.getConcertType().equals(ConcertType.INDOOR)){
            System.out.println("ez igy jó");
        }
        else{
            if(isRaining){
                concerts.remove(concert);
                System.out.println("Ez a concert elmarad: " + concert);
            }
        }
    }




}

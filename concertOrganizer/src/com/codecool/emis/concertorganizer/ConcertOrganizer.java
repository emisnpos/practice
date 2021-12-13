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
        int allProfit = 0;
        for (Concert concert : concerts) {
            allProfit += (concert.getTicketProfit() * profitPrecentage + concert.beerProfit());
        }
       return allProfit;
    }

    public Set<Band> getBands() {
        return bands;
    }

    public Set<Concert> getConcerts() {
        return concerts;
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


    public void setRaining(boolean raining) {
        isRaining = raining;
    }

    public void printAllBandsWithWorkTogether(){
       for (Band band : bands) {
           System.out.println(band);
       }
   }

   public void printAllConcerts(){
       for (Concert concert : concerts) {
           System.out.println(concert);
       }
   }
}

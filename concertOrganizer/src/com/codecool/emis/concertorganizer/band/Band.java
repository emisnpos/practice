package com.codecool.emis.concertorganizer.band;

import com.codecool.emis.concertorganizer.ConcertOrganizer;
import com.codecool.emis.concertorganizer.concert.Concert;

import java.util.Set;

public class Band {

    private String name;
    private Style sytle;
    private ConcertOrganizer concertOrganizer;

    public Band(String name, Style sytle, ConcertOrganizer concertOrganizer) {
        this.name = name;
        this.sytle = sytle;
        this.concertOrganizer = concertOrganizer;
    }

    public Style getStyle() {
        return sytle;
    }


    public String getName() {
        return name;
    }


    public void choiceWarmUpBand(Band band){
        for (Concert concert : concertOrganizer.getConcerts()) {
            if((concert.getMainBand().equals(this))){
                if(!band.equals(this)) {
                    concert.setWarmUpBand(band);
                }
            }

        }

    }

    @Override
    public String toString() {
        return "Band{" +
                "name='" + name + '\'' +
                ", sytle=" + sytle +
                '}';
    }
}

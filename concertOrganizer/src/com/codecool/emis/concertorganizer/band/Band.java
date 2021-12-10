package com.codecool.emis.concertorganizer.band;

import com.codecool.emis.concertorganizer.ConcertOrganizer;

public class Band {

    private String name;
    private Style sytle;
    private ConcertOrganizer concertOrganizer;

    public Band(String name, Style sytle) {
        this.name = name;
        this.sytle = sytle;
    }

    public Style getStyle() {
        return sytle;
    }

    public void choiceWarmUpBand(){

    }

    @Override
    public String toString() {
        return "Band{" +
                "name='" + name + '\'' +
                ", sytle=" + sytle +
                '}';
    }
}

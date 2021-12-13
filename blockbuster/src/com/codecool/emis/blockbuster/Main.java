package com.codecool.emis.blockbuster;

import com.codecool.emis.blockbuster.product.Movie;
import com.codecool.emis.blockbuster.product.Music;
import com.codecool.emis.blockbuster.product.TvShow;
import com.codecool.emis.blockbuster.product.VideoGame;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Blockbuster blockbuster = new Blockbuster();

        Movie jurassicPark = new Movie("Jurassic Park", LocalDate.of(1993,1,1), 500, 5500);
        Movie iAmLegends = new Movie("I AM Legend", LocalDate.of(2007,1,1), 550, 7000);
        TvShow theBigBang = new TvShow("The Big Bang Theory", LocalDate.of(2007, 1, 1), 500, 6500);
        TvShow suits = new TvShow("Suits", LocalDate.of(2011,1,1), 500, 6500);
        Music abba = new Music("ABBA", LocalDate.of(1972,1,1), 300, 4000);
        VideoGame wow = new VideoGame("World of Warcraft", LocalDate.of(2004,1,1), 700, 8000);

        blockbuster.addProduct(jurassicPark);
        blockbuster.addProduct(iAmLegends);
        blockbuster.addProduct(theBigBang);
        blockbuster.addProduct(suits);
        blockbuster.addProduct(abba);
        blockbuster.addProduct(wow);
        // System.out.println(blockbuster.toString());   // <------ product checker




        //blockbuster.seeALlAvaiableProduct();
        abba.rented();
        wow.rented();
        suits.rented();
        //blockbuster.seeALlAvaiableProduct();
        suits.getBackToShop();
        abba.getBackToShop();
        blockbuster.seeALlAvaiableProduct();


    }

}

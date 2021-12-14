package com.codecool.emis.blockbuster;

import com.codecool.emis.blockbuster.product.Product;
import com.codecool.emis.blockbuster.product.ProductType;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws Exception {

        Blockbuster blockbuster = new Blockbuster();

        Product jurassicPark = new Product( ProductType.MOVIE, "Jurassic Park", LocalDate.of(1993,1,1), 500, 5500);
        Product iAmLegends = new Product(ProductType.MOVIE, "I AM Legend", LocalDate.of(2007,1,1), 550, 7000);
        Product theBigBang = new Product(ProductType.TVSHOW, "The Big Bang Theory", LocalDate.of(2007, 1, 1), 500, 6500);
        Product suits = new Product(ProductType.TVSHOW, "Suits", LocalDate.of(2011,1,1), 500, 6500);
        Product abba = new Product(ProductType.MUSIC,"ABBA", LocalDate.of(1972,1,1), 300, 4000);
        Product wow = new Product(ProductType.VIDEOGAME,"World of Warcraft", LocalDate.of(2004,1,1), 700, 8000);

        blockbuster.addProduct(jurassicPark);
        blockbuster.addProduct(iAmLegends);
        blockbuster.addProduct(theBigBang);
        blockbuster.addProduct(suits);
        blockbuster.addProduct(abba);
        blockbuster.addProduct(wow);
        //System.out.println(blockbuster.toString());   // <------ product checker

        blockbuster.rentProduct(jurassicPark, 6);
        blockbuster.returnProduct(jurassicPark);



        blockbuster.rentProduct(jurassicPark, 4);

        blockbuster.rentProduct(wow, 3);
        blockbuster.returnProduct(wow);

        blockbuster.rentProduct(wow, 11);
        blockbuster.returnProduct(wow);

        blockbuster.rentProduct(abba, 3);
        blockbuster.returnProduct(abba);

        blockbuster.rentProduct(iAmLegends, 8);
        blockbuster.returnProduct(iAmLegends);

        blockbuster.rentProduct(theBigBang, 7);
        blockbuster.returnProduct(theBigBang);

        blockbuster.rentProduct(suits, 9);
        blockbuster.returnProduct(suits);

        blockbuster.rentProduct(wow, 3);
        blockbuster.returnProduct(wow);

        blockbuster.rentProduct(wow, 11);
        blockbuster.returnProduct(wow);

        blockbuster.rentProduct(abba, 3);
        blockbuster.returnProduct(abba);

        blockbuster.rentProduct(iAmLegends, 8);
        blockbuster.returnProduct(iAmLegends);

        blockbuster.rentProduct(theBigBang, 7);
        blockbuster.returnProduct(theBigBang);

        blockbuster.rentProduct(suits, 9);
        blockbuster.returnProduct(suits);

        blockbuster.rentProduct(wow, 3);
        blockbuster.returnProduct(wow);

        blockbuster.rentProduct(wow, 11);
        blockbuster.returnProduct(wow);

        blockbuster.rentProduct(abba, 3);
        blockbuster.returnProduct(abba);

        blockbuster.rentProduct(iAmLegends, 8);
        blockbuster.returnProduct(iAmLegends);

        blockbuster.rentProduct(theBigBang, 7);
        blockbuster.returnProduct(theBigBang);

        blockbuster.rentProduct(suits, 9);
        blockbuster.returnProduct(suits);





        //blockbuster.betterVisualToSeeTheProducts();       //<------------ product list info
        //System.out.println(blockbuster.getBestBlockbusters());                   //<------------ this method return Set with best products



        blockbuster.buyProduct(wow);
        //blockbuster.betterVisualToSeeTheProducts();              //<----------------- here we can see that if someone buys a blockbuster it gets removed from products
        //System.out.println(blockbuster.getBestBlockbusters());

        System.out.println("This is all profit: " + blockbuster.getMonthlyRevenu());


        blockbuster.betterVisualToSeeTheProducts();
        System.out.println(blockbuster.getBestBlockbusters());




    }

}

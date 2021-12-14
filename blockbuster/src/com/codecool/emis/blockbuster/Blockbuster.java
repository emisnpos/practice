package com.codecool.emis.blockbuster;

import com.codecool.emis.blockbuster.product.Product;

import java.util.HashSet;
import java.util.Set;


public class Blockbuster {

    private Set<Product> products = new HashSet<>();
    private int monthlyRevenu;
    private static final int MIN_RENTED_DAY = 3;
    private static final int MAX_RENTED_DAY = 14;


    public void addProduct(Product product){
        products.add(product);
    }


    public int averageProduct(){  // helper metod to calculate which product is better than other, I use in getBestBlockbusters()
        int counter = 0;
        for (Product product : products) {
            counter +=  product.getHowManyTimesRent();
        }
        return counter / products.size();
    }

/*    public Set<Product> getBestBlockbusters(){
        int averageRentTime = averageProduct();
        for (Product product : products) {
            if(product.getHowManyTimesRent() > averageRentTime){
                blockBusters.add(product);
            }
        }
        return blockBusters;
    }*/




    private void setProductToBlockbuster(){
        int averageRentTime = averageProduct();
        for (Product product : products) {
            if(product.getHowManyTimesRent() > averageRentTime){
                product.setBlockbusterFavorite(true);
            }
        }
    }

    public Set<Product> getBestBlockbusters(){
         Set<Product> blockBusters = new HashSet<>();
        setProductToBlockbuster();
        for (Product product : products) {
            if(product.isBlockbusterFavorite()){
                blockBusters.add(product);
            }
        }
        return blockBusters;
    }

    public int getMonthlyRevenu() {
        return monthlyRevenu;
    }

    public void buyProduct(Product product) throws Exception{
        Set<Product> blockBusters = getBestBlockbusters();
        if(blockBusters.contains(product)){
            products.remove(product);
            monthlyRevenu += product.getOriginalPrice();
        }
        else {
            throw new Exception("This item is not yet available.");
        }
    }


    private boolean isValidRentTime(int day){
        return  (day >= MIN_RENTED_DAY && day <= MAX_RENTED_DAY) ;
    }

    public void rentProduct(Product product, int day) throws Exception{
        if(product.isAvailable()) {
            if(isValidRentTime(day)){
                product.setAvailable(false);
                int rentCounter = product.getHowManyTimesRent() + 1;
                monthlyRevenu += product.getDailyRentalCost() * day;
                product.setHowManyTimesRent(rentCounter);
            }
           else{
               throw new Exception("This rent time to short or to long.");
            }
        }
        else{
            throw new Exception("This product now not available.");
        }

    }


    public void returnProduct(Product product){
        product.setAvailable(true);
    }


    public void betterVisualToSeeTheProducts(){  // this method for testing faze
        for (Product product : products) {
            System.out.println(product);
        }
    }

    @Override
    public String toString() {
        return "Blockbuster{" +
                "products=" + products +
                '}';
    }

}

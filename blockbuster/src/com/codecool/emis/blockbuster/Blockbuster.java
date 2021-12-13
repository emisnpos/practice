package com.codecool.emis.blockbuster;

import com.codecool.emis.blockbuster.product.Product;

import java.util.HashSet;
import java.util.Set;

public class Blockbuster {

    private Set<Product> products = new HashSet<>();
    private int monthlyRevenu;


    public void addProduct(Product product){
        products.add(product);
    }



    public Set<Product> selectPopularProducts(){
        Set<Product> blockBusters = new HashSet<>();
        return null;
    }

    public void buyProducts(){

    }

    public void seeALlAvaiableProduct(){
        for (Product product : products) {
            if(product.isAvailable()){
                System.out.println(product);
            }
        }
    }

    @Override
    public String toString() {
        return "Blockbuster{" +
                "products=" + products +
                '}';
    }

}

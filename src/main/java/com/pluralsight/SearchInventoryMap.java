package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class SearchInventoryMap {

    public static HashMap<Integer, Product> inventory =
            new HashMap<Integer, Product>();

    public static void main(String[] args) {
        // this method loads product objects into inventory
        loadInventory();
        Scanner scanner = new Scanner(System.in);
        System.out.print("What item # are you interested in? ");
        int id = scanner.nextInt();
        Product matchedProduct = inventory.get(id);
        if (matchedProduct == null) {
            System.out.println("We don't carry that product");
        } else {
            System.out.printf("We carry %s and the price is $%.2f",
                    matchedProduct.getName(), matchedProduct.getPrice());
        }
    }

    private static void loadInventory(){
        BufferedReader bufferedReader = new BufferedReader(new FileReader("inventory.csv"));
        String line;




    }

}

package com.company;

import java.util.ArrayList;

public class arrayList2D {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>>  twoDArr=new ArrayList<>();

        ArrayList<String> food=new ArrayList<>();
        food.add("pizza");
        food.add("shushi");

        ArrayList<String> drink=new ArrayList<>();
        drink.add("coke");
        drink.add("pepsi");

        ArrayList<String> snack=new ArrayList<>();
        snack.add("french");
        snack.add("fries");


        twoDArr.add(food);
        twoDArr.add(snack);
        twoDArr.add(drink);

        System.out.println(twoDArr);
        System.out.println(twoDArr.get(0).get(1));
    }
}

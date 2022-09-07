package com.company;

import java.util.ArrayList;

public class _11_arrayList {
    public static void main(String...args){

        /*
        *   ArrayList = a resizable array.
        *               Elements can be added and removed after Compilation phase
        *               store reference data types
        *
        * get = it helps to get the element from the array
        *
        *       array.get(index)
        *
        * set = it helps to set the element in array
        *
        *       array.set(index , element)
        *
        * array.remove(index); => will remove the index
        * array.clear(); => will clear all the elements .
        *
        *       * */


        ArrayList<String> food= new ArrayList<String>();
        food.add("pizza");
        food.add("hello");
        food.add("hel");
        food.add("hell");

        food.set(0,"burger");

        food.remove(3);
        food.clear();

        for (int i=0;i<food.size();i++){
            System.out.println(food.get(i));
        }
    }
}

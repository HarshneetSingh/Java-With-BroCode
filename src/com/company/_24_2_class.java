package com.company;

public class _24_2_class {
    static int numOfFriends;
    String name;
    _24_2_class(String name){
        this.name=name;
        numOfFriends++;
    }
    static void DisplayingFriends(){
        System.out.println(numOfFriends);
    }
}

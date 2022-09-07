package com.company;

public class _24_1_staticKeyword {
    public static void main(String[] args) {
        _24_2_class Friends1=new _24_2_class("harshi");
        _24_2_class Friends2=new _24_2_class("no");
        _24_2_class Friends3=new _24_2_class("Friends");

//        System.out.println(_24_2_class.numOfFriends);
//        YOU CAN ACCESS THE OTHER CLASS OBJECT VARIABLES OR METHOD JUST BY STATIC
//        you have to apply in parent name then only you can access the ttl number of friends

//        STATIC =MODIFIER . A SINGLE copy of a variable / method  is created and shared
//                th class "owns" the static number

//        or             by creating method


    _24_2_class.DisplayingFriends();
    }

}

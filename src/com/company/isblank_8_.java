package com.company;

import java.util.Scanner;

public class isblank_8_ {
    public static void main(String...args){
//        isBlank() returns true if the string is empty or contains only white space,

        Scanner scn=new Scanner(System.in);
        String n;
        do {
            System.out.println("enter your name");
            n =scn.nextLine();
        }while (n.isBlank());
        System.out.println("hello"+n);

    }
}

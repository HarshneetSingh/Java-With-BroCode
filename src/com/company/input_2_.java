package com.company;
import java.util.Scanner;
public class input_2_ {
    public static void main(String...args){
        System.out.println("enter number");
        Scanner scn=new Scanner(System.in);

        int input=scn.nextInt();
        System.out.println("enter name");
        scn.nextLine();// this line is working as a consumer of \n
        String stringInput=scn.nextLine();
        System.out.println(input+" "+stringInput);

    }

}

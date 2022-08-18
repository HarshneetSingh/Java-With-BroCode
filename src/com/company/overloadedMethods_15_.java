package com.company;

public class overloadedMethods_15_ {
    public static void main(String[] args) {

        System.out.println(add(1,5));
        System.out.println(add(1,5,7));
        System.out.println(add(1,0.5));
        System.out.println(add(0.11,3,0.5));

    }

//    you can't return any addition type things with void as void  return nothing

//    overloaded method = methods that share same name but different parameters
//     result with unique signature
    static int add(int a, int b) {
        System.out.println(" integer 1");
        return a+b;
    }
    static int add(int a, int b,int c) {
        System.out.println(" integer 2");

        return a+b+c;

    }
    static double add(double a, double b) {
        System.out.println(" double 1");

        return a+b;

    }
    static double add(double a, double b,double c) {
        System.out.println(" double 2");

        return a+b+c;

    }
}

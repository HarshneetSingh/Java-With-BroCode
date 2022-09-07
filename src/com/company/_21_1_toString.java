package com.company;

public class _21_1_toString {
//    toString()= special method that all objects inherit,
//                that return a string that "textually represent" an objects .
//                can be used both implicitly and explicitly

    public static void main(String[] args) {
        _21_2_class car=new _21_2_class();
        System.out.println(car.toString()); // explicitly
        System.out.println(car);  // implicitly
    }

}

package com.company;

public class _26_1_methodOverriding {
//    method overiding =declaring a method in sub class,
//                      which is already present in parent class
//                      done so that a child can give its own implementation

    public static void main(String[] args) {

        //          class 1
        _26_2_class oldCar = new _26_2_class();

        //          class 2
        _26_3_class newCar = new _26_3_class();

        oldCar.gear();
        newCar.gear();
    }

}

package com.company;

public class _22_1_array_of_object {
    public static void main(String[] args) {
//        _22_2_class[] arr=new _22_2_class[3];
//                  or
//        _22_2_class[] arr={};

        _22_2_class myCar=new _22_2_class("khushi");
        _22_2_class myCar2=new _22_2_class("kh");
        _22_2_class myCar3=new _22_2_class("khu");

        _22_2_class[] arr={myCar,myCar2,myCar3};
        System.out.println(arr[0].name);
    }
}

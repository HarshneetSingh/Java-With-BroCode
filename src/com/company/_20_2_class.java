package com.company;

public class _20_2_class {
//    making multiple constructor with diff parameter
//    same name+diff param == signature

    String name;
    int age;
    _20_2_class(String name, int age){
        this.name=name;
        this.age=age;
    }
    _20_2_class(int age){
        this.age=age;
    }
}

package com.company;

public class _17_2_class {
    String name;
    int age;
    double weight;

    _17_2_class(String name, int age, double weight){
            this.name=name;
            this.age=age;
            this.weight=weight;
    }
    String drink(){
        return this.name +" is drinking ";
    }
    String running(){
        return this.name +" is running ";
    }
}

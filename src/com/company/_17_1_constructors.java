package com.company;

public class _17_1_constructors {
    //        constructors=special method that is called when n object is instantiated (created)
    public static void main(String[] args) {
        _17_2_class human1 = new _17_2_class("harshi", 19, 94);

        _17_2_class human2 = new _17_2_class("khushi", 19, 70);


        System.out.println(human2.drink()+"while "+human1.running());
    }
}

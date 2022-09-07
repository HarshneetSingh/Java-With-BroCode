package com.company;

public class _20_1_constructorOverloaded {
//    here we've grabbing constructors but passing diff params this is known as constructors overloading

    public static void main(String[] args) {
        _20_2_class diffConstrut=new _20_2_class("heloo", 12 );
        _20_2_class diffConstrut2=new _20_2_class( 14 );

        System.out.println(diffConstrut.age);

        System.out.println(diffConstrut2.age);
    }

}

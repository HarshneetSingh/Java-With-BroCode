package com.company;

public class _27_3_class extends _27_2_class {
    String ability;
    _27_3_class(String name , int age, String ability ){
        super(name,age );
        this.ability=ability;
    }
    @Override
    public String toString() {
        return super.toString()+" and ability "+this.ability;
    }

}

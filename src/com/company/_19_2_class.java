package com.company;

import java.util.Random;

public class _19_2_class {
//USING LOCAL SCOPE HERE
    _19_2_class() {
        Random random = new Random();
        int randNo=0;
        roll(randNo,random);
    }
    void roll(int numVar, Random random){
        numVar = random.nextInt(6)+1;
        System.out.println(numVar);

    }
}


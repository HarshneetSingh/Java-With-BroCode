package com.company;

import java.util.Random;

public class _4_rndmNo {
    public static void main(String... args) {
        Random random = new Random();
        int no = random.nextInt(6) + 1;
        System.out.println(no);
    }

}

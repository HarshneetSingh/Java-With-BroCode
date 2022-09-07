package com.company;

import java.util.Scanner;

public class _10_array2D {
    public static void main(String... args) {
        int[][] matrix = new int[3][3];
        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i < matrix[0].length; i++) {
                Scanner scn = new Scanner(System.in);
                int number = scn.nextInt();
                matrix[j][i] = number;
            }
        }

        for (int k = 0; k < matrix.length; k++) {
            System.out.println();
            for (int l = 0; l < matrix[0].length; l++) {
                System.out.print(matrix[k][l]+" ");
            }
        }

    }
}
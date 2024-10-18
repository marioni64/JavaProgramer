package com.ItMes.After.controllers;

public class Main {
    public static void main(String[] args) {
        int[][] x = {
                {1, 2, 3, 4},
                {2, 3, 5, 7},
                {2, 4, 5, 6},
                {4, 5, 2, 9}
        };

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                System.out.print(x[i][j] + "  ");
            }
            System.out.println();
        }

    }
}

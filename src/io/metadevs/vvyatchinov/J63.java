package io.metadevs.vvyatchinov;

public class J63 {
    public static void main(String[] args) {

        int letsgoo[][] = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int b = 0; b < 10; b++) {
                if (i >= b) {
                    letsgoo[i][b] = 0;
                } else {
                    letsgoo[i][b] = 1;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int b = 0; b < 10; b++) {
                System.out.print(letsgoo[i][b] + " ");
            }
            System.out.println("");
        }
    }
}
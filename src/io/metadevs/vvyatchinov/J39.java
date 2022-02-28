//Программа считает квадраты чисел от 1 до числа, введенного пользователем.
//Число, введенное пользователем, не должно выходить за рамки диапозона от 1 до 10

package io.metadevs.vvyatchinov;

import java.util.Scanner;

public class J39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = scan.nextInt();
        if (a < 1 || a > 10) {
            System.out.println(" Введите число");
        } else {
            int i = 1;
            do {
                System.out.println("Квадрат " + i + " равен " + (i * i));
                i = i + 1;
            } while (i < (a + 1));
        }


    }
}

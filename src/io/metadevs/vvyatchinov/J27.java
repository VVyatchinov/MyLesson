//Программа выводит минимальное число из двух чисел, введенных пользователем.
package io.metadevs.vvyatchinov;

import java.util.Scanner;

public class J27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число:");
        int a = scan.nextInt();
        int b = scan.nextInt();

        int c = a < b ? a : b ;
        System.out.print("Минимальное число:" + c);


    }
}
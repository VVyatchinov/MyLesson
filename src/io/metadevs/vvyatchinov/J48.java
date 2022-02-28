// Пользователь вносит число от 1 до 10.
//Программа создает массив размером с число, введенным пользователем, заполняет его случайным образом и выводит массив.
package io.metadevs.vvyatchinov;

import java.util.Scanner;

public class J48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc.nextInt();
        if (a < 1 || a > 10) {
            System.out.println("Число");
        } else {
            int b[] = new int[a];
            for (int i = 0; i < a; i++) {
                b[i] = (int) (Math.random() * 10);
                System.out.print(b[i]);
                if (i == (a - 1)) {
                    System.out.print(".");
                } else {
                    System.out.print(", ");
                }


            }
        }
    }
}

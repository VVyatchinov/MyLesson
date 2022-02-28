//Введите в консоль два числа a и b.
//Программа определяет наименьшее из них, либо сообщает, что числа равны.
package io.metadevs.vvyatchinov;

import java.util.Scanner;

public class J12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = scan.nextInt();
        System.out.println("Введите число:");
        int b = scan.nextInt();
        int min;
        if (a < b) {
            min = a;
            System.out.println("Min=" + min);
        }
        if (a > b) {
            min = b;
            System.out.println("Min=" + min);
        }
        if (a == b) {
            System.out.println("а равно b");
            scan.close();
        }
    }
}
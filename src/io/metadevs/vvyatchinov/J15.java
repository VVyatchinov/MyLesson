//Введите в консоль число a. Программа определяет а больше, меньше или равно 0.
package io.metadevs.vvyatchinov;

import java.util.Scanner;

public class J15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = scan.nextInt();
        if (a < 0) {
            System.out.println(a + "< 0");
        }
        if (a > 0) {
            System.out.println(a + "> 0");
        }
        if (a == 0) {
            System.out.println(a  +" равно 0");
            scan.close();
        }


    }
}

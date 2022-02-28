

package io.metadevs.vvyatchinov;

import java.util.Scanner;

public class J42 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a;
        int result = (int) (Math.random() * 10);

        for (int i = 0; i < 3; i++) {
            System.out.println("Угадайте число:");
            a = sc.nextInt();
            if (a == result) {
                System.out.println("Правильно");
            } else {
                if (result < a) {
                    System.out.println("Неправильно, число < " + a);
                } else {
                    System.out.println("Неправильно, число > " + a);
                }
            }
        }
        System.out.println("Ответ:" + result);
    }
}


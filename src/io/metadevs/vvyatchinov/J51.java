//Программа выводит оценки учеников.
package io.metadevs.vvyatchinov;

public class J51 {
    public static void main(String[] args) {
        String[] a = {"Иван,Петр,Лена,Игорь"};
        int[] b = {2, 3, 4, 5};
        int c = a.length;
        System.out.println("Оценки учеников");
        for (int i = 0; i < c; i++) {
            System.out.println(a[i] + "" + b[i]);
        }


    }
}

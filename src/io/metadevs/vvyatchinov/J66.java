// Программа переводит строковый тип данных в целочисленный и снова переводит в строковый тип данных.
package io.metadevs.vvyatchinov;

public class J66 {
    public static void main(String[] args) {
        String lines[] = {"Владимир", "22", "Илья", "23"};
        System.out.println(lines[0] + "-" + lines[1] + "," + lines[2] + "-" + lines[3]);

        int a = Integer.parseInt(lines[1]);
        a++;
        lines[1] = a + "";
        int b = Integer.parseInt(lines[3]);
        b=b+4;
        lines[3] = b + "";
        System.out.println(lines[0] + "-" + lines[1] + "," + lines[2] + "-" + lines[3]);
    }
}
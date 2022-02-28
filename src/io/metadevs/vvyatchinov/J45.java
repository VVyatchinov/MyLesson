//Программа выводит квадраты чисел от 1 до 10, потом, с другой строчки, квадраты чисел от 10 до 1.

package io.metadevs.vvyatchinov;

public class J45 {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 10; i++)
        {
            System.out.print((i * i) + " " );
        }
        System.out.println("");
        for (i = 10; i > 0; i = i - 1) {
            System.out.print((i * i)+ " " );

        }
    }
}

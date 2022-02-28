//Программа генерирует случайные фразы из массивов строк.
package io.metadevs.vvyatchinov;

public class J54 {
    public static void main(String[] args) {
        String[] a1 = {"Иоанн", " Ярослав", " Йукурит"};
        String[] a2 = {" Сегодня", " Вчера", " В среду"};
        String[] a3 = {" Заработал миллион $", " Проиграл квартиру", " Напился"};

        int b1 = (int) (Math.random() * 3);
        int b2 = (int) (Math.random() * 3);
        int b3 = (int) (Math.random() * 3);
        String line = a1[b1] + a2[b2] + a3[b3];
        System.out.println(line);
    }
}
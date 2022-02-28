package io.metadevs.vvyatchinov;

public class J21 {
    public static void main(String[] args) {
        int week = (int) (Math.random() * 7);
        if (week == 0) {
            System.out.println("Понедельник");
        } else if (week == 1) {
            System.out.println("Вторник");
        } else if (week == 2) {
            System.out.println("Среда");
        } else if (week == 3) {
            System.out.println("Четверг");
        } else if (week == 4) {
            System.out.println("Пятница");
        } else if (week == 5) {
            System.out.println("Суббота");
        } else if (week == 6) {
            System.out.println("Воскресенье");
        }

    }
}



//Программа выдает в случайном порядке сезон года и месяц.
package io.metadevs.vvyatchinov;

public class J24 {
    public static void main(String[] args) {
        int season = (int) (Math.random() * 4);
        int month = (int) (Math.random() * 3);
        switch (season) {
            case 0:
                System.out.print("Лето-");
                switch (month) {
                    case 0:
                        System.out.print("Июнь");
                        break;
                    case 1:
                        System.out.print("Июль");
                        break;
                    case 2:
                        System.out.print("Август");
                        break;
                }
                break;
            case 1:
                System.out.print("Осень-");
                switch (month) {
                    case 0:
                        System.out.print("Сентябрь");
                        break;
                    case 1:
                        System.out.print("Октябрь");
                        break;
                    case 2:
                        System.out.print("Ноябрь");
                        break;

                }
                break;
            case 2:
                System.out.print("Зима-");
                switch (month) {
                    case 0:
                        System.out.print("Декабрь");
                        break;
                    case 1:
                        System.out.print("Январь");
                        break;
                    case 2:
                        System.out.print("Февраль");
                        break;


                }
                break;
            case 3:
                System.out.print("Весна-");
                switch (month) {
                    case 0:
                        System.out.print("Март");
                        break;
                    case 1:
                        System.out.print("Апрель");
                        break;
                    case 2:
                        System.out.print("Май");
                        break;

                }
                break;
        }
    }
}
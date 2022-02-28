package io.metadevs.vvyatchinov;

//Вася и Петя играют в игру “Камень, ножницы, бумага”.
//Каждый из них показывает свою фигуру камень-0, ножницы-1, бумага-2.
//Программа определяет, кто из них выиграл.
//Выбор каждого участника формируется случайным образом.
public class J33 {
    public static void main(String[] args) {
        int Petr = (int) (Math.random() * 3);
        int Vasya = (int) (Math.random() * 3);

        String game;
        if (Petr == 0 && Vasya == 0 || Petr == 1 && Vasya == 1 || Petr == 2 && Vasya == 2) {
            game = "ничья";
        } else if (Petr == 0 && Vasya == 1 || Petr == 2 && Vasya == 0 || Petr == 1 && Vasya == 2) {
            game = "победа Васи";
        } else {
            game = "победа Пети";
        }
        System.out.println(game);
    }
}
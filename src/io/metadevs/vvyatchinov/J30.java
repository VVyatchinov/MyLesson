//Спортсмен на соревнованиях стреляет три раза по трем мишеням.
//За каждое попадание дается один балл.
//Программа выводит результаты каждого выстрела и общее количество баллов спортсмена
//Результат каждого выстрела формируется программой случайным образом.
package io.metadevs.vvyatchinov;

public class J30 {
    public static void main(String[] args) {
        int first = (int) (Math.random() * 2);
        int second = (int) (Math.random() * 2);
        int third = (int) (Math.random() * 2);
        int result = 0;
        String results;

        result = first == 0 ? result + 0 : result + 1;
        results = first == 0 ? "Мимо" : "В цель";
        System.out.println(results);


        result = second == 0 ? result + 0 : result + 1;
        results = second == 0 ? "Мимо" : "В цель";
        System.out.println(results);


        result = third == 0 ? result + 0 : result + 1;
        results = third == 0 ? "Мимо" : "В цель";
        System.out.println(results);

        System.out.println(result);


    }
}

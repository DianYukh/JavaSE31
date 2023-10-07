package org.itstep.lesson7;

public class Task4 {
    //Завдання 4
    //Досконале число — натуральне число, що дорівнює сумі всіх своїх
    //власних дільників (тобто всіх додатних дільників, відмінних від
    //самого числа).
    //Виведіть на екран всі досконалі числа в діапазоні від 0 до
    //1 000 000.
    //Приклади:
    //1-е досконале число: 6 має наступні власні дільники: 1, 2, 3; їх
    //сума дорівнює 6.
    //2-е досконале число: 28 має наступні власні дільники: 1, 2, 4, 7, 14;
    //їх сума дорівнює 28.


    public static void main(String[] args) {
        int sum = 1;

        for (int i = 1; i < 1000000; i++) {
            for (int j = 1; j < i; j++) {
                if(i % j == 0 && j != 1){
                    sum = sum + j;
                }
            }
            if(sum == i){
                System.out.println("i = " + i);
            }
                sum = 1;
        }
    }

}

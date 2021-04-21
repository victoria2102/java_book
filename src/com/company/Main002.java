package com.company;

public class Main002 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.print(" Массив в обратном порядке: ");
        System.out.println("array.length: " + array.length);
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(i + " : " + array[i]);
        }
        // что было так
        // int[] reverseArray = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // что такое array.length
        // почему длина массива = 10
        // почему мы делаем так array.length - 1
        // какой смысл переменной i в цикле

        // преобразуй массив

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
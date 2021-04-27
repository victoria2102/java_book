package com.company;

public class Main002 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.print(" Массив в обратном порядке: ");
        System.out.println("array.length: " + array.length);
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }


    // что было так
    // int[] reverseArray = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

    // что такое array.length экземпляр типа Array , который
    // устанавливает или возвращает число элементов этого массива.
    // почему длина массива = 10 мы задали такую длину в самом начале
    // почему мы делаем так array.length - 1   массив в десять элементов нумеруется
    // с нуля до девяти, поэтому длина минус один.
    // какой смысл переменной i в цикле переменная i принимает на себя каждое из
//        значений массива и если оно удовлетворяет условие то выполняется цикл

    // преобразуй массив
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
}

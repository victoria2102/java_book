package com.company;

import java.util.Scanner;

public class Main003 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("введите количество элементов");
        int num = s.nextInt();
        int a[] = new int[num];
        System.out.println("введите элементы");
        for (int i = 0; i < num; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Элементы в обратном порядке");
        for (int i = num - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}
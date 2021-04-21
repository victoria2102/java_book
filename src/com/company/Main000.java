package com.company;

import java.util.Scanner;

public class Main000 {

    public static void main(String[] args) {
        // write your code here
        int s;
        int i;
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int n = console.nextInt();
        // int n = 10;
        long t;
        long totalTime = System.currentTimeMillis();

        t = System.currentTimeMillis();
        s = 0;
        for (i = 0; i <= n; i++) {
            s = s + i;
        }
        System.out.print("for : " + s);
        System.out.println(" - " + " потрачено " + (System.currentTimeMillis() - t) + "мc");

        t = System.currentTimeMillis();
        i = 0;
        s = 0;
        while (i <= n) {
            s = s + i;
            i++;
        }
        System.out.print("while : " + s);
        System.out.println (" - " + " потрачено " + (System.currentTimeMillis() - t) + "мc");

        t = System.currentTimeMillis();
        i = 0;
        s = 0;
        do {
            i++;
            s += i;
        } while (i < n);
        System.out.print("do : " + s);
        System.out.println(" - " + " потрачено " + (System.currentTimeMillis() - t) + "мc");

        t = System.currentTimeMillis();
        i = 0;
        s = 0;
        while (i <= n) {
            s = s + i;
            i++;
        }
        System.out.print("while : " + s);
        System.out.println (" - " + " потрачено " + (System.currentTimeMillis() - t) + "мc");


        t = System.currentTimeMillis();
        s = 0;
        for (i = 0; i <= n; i++) {
            s = s + i;
        }
        System.out.print("for : " + s);
        System.out.println(" - " + " потрачено " + (System.currentTimeMillis() - t) + "мc");

        // try do while on the end

                t = System.currentTimeMillis();
        i = 0;
        s = 0;
        do {
            i++;
            s = s + i;
        } while (i < n);
        System.out.print("do2 : " + s);
        System.out.println(" - " + " потрачено " + (System.currentTimeMillis() - t) + "мc");

        System.out.println( " Потрачено всего : " + (System.currentTimeMillis() - totalTime) + "мc");
    }


}



package com.company;

import java.util.Scanner;

public class Main000 {

    public static void main(String[] args) {
        // write your code here
        int s = 0;
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int i = console.nextInt();
        int c = console.nextInt();
        int b = console.nextInt();


        do {
            i++;
            s = s + i;
        } while (i < 100);
        s = s + 1;
        System.out.println("do : " + s);


        s = 0;
        while (c <= 100) {
            s = s + c;
            c++;
        }
        System.out.println("while : " + s);


        s = 0;
        for (i = b; i <= 100; i++) {
            s = s + i;
        }
        System.out.println("for : " + s);
    }

}



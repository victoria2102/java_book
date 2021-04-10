package com.company;

import java.util.Scanner;

public class Main000 {

    public static void main(String[] args) {
        // write your code here
        int s;
        int i = 0;
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int n = console.nextInt();


       s = 0;
        do {
            i++;
            s = s + i;
        } while (i < n);
        s = s + 1;
        System.out.println("do : " + s);

        i = 0;
        s = 0;
        while (i <= n) {
            s = s + i;
            i++;
        }
        System.out.println("while : " + s);


        s = 0;
        for (i = 0; i <= n; i++) {
            s = s + i;
        }
        System.out.println("for : " + s);
    }

}



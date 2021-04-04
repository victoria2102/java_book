package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int i = 1;
        int s = 0;

        while (i <= 100) {
            i++;
            s = s + i;
        }
        System.out.println("while : " + s);

        do {
            i++;
            s = s + i;
        } while (i <= 100);
        System.out.println("do : " + s);

        for (i = 1; i <= 100; i++) {
            s = s + i;
        }
        System.out.println("for : " + s);
    }
}


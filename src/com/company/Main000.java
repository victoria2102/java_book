package com.company;

public class Main000 {

    public static void main(String[] args) {
        // write your code here
        int i;
        int s;

        i = 0;
        s = 0;
        while (i <= 100) {
            s = s + i;
            i++;
        }
        System.out.println("while : " + s);

        i = 0;
        s = 0;
        do {
            i++;
            s = s + i;
        } while (i < 100);
        System.out.println("do : " + s);

        s = 0;
        for (i = 0; i <= 100; i++) {
            s = s + i;
        }
        System.out.println("for : " + s);
    }
}


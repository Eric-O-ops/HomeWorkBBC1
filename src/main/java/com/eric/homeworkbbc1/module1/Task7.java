package com.eric.homeworkbbc1.module1;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        int a,b;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите a:");
        a = in.nextInt();
        System.out.println("Введите b:");
        b = in.nextInt();
        double c = 0.5 * (a + b);
        double n = Math.sqrt(mod(a) * mod(b));
        System.out.println(
                "c = " + c + "\n" +
                "n = " + n + "\n"
        );
    }

    public static double mod (double a) {
        if (a < 0) return a * (-1); else return a;
    }
}

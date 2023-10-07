package com.eric.homeworkbbc1;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        double a, b, c;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите a:");
        a = in.nextDouble();
        System.out.println("Введите b:");
        b = in.nextDouble();
        System.out.println("Введите c:");
        c = in.nextDouble();
        double P = a + b + c;
        double p = 0.5 * P;
        double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Площадь равна: " + S);

    }
}

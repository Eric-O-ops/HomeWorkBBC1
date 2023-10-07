package com.eric.homeworkbbc1;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        double a, b, af, S;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите a");
        a = in.nextDouble();
        System.out.println("Введите b");
        b = in.nextDouble();
        System.out.println("Введите af");
        af = in.nextDouble();
        S = 0.25 * Math.tan(af) * (Math.pow(a, 2) - Math.pow(b, 2));
        System.out.println("Площадь трапеции: " + S);
    }
}

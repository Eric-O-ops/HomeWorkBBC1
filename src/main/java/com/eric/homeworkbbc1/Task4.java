package com.eric.homeworkbbc1;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        double x,y,z,b;
        double actg;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x");
        x = in.nextDouble();
        System.out.println("Введите y");
        y = in.nextDouble();
        System.out.println("Введите z");
        z = in.nextDouble();

        if (z < 0 || z > 1) {
            System.out.println("Ошибка. z не может быть меньше 0 или больше 1");
            return;
        } else {
            actg = 1 / Math.atan(z);
            b = x * (actg + Math.pow(Math.E, -x - 3));
        }

        if (x >= 1) {
            double numerator = Math.pow(x - 1, 0.5) - Math.pow(mod(y), (double) 1 / 3);
            double denominator = (4 - 2 * Math.pow(x, 2) + Math.pow(y, 2)) / 4;
            double a = numerator / denominator;
            System.out.println("a равно: " + a);
            System.out.println("b равно: " + b);

        } else  {
            System.out.println("Ошибка");
            System.out.println("b равно: " + b);
        }
    }

    public static double mod (double a) {
        if (a < 0) return a * (-1); else return a;
    }
}

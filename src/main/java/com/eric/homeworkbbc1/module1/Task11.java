package com.eric.homeworkbbc1.module1;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        double a;
        Scanner in = new Scanner(System.in);
        System.out.println("Ведите сторону равностоннего триугольника:");
        a = in.nextDouble();
        double S = 0.25 * Math.pow(a, 2) * Math.sqrt(3);
        double h = Math.sqrt(0.75) * a;
        double r = a / 2 * Math.sqrt(3);
        double R = a / Math.sqrt(3);
        System.out.println(
                "Площадь равностороннего триугольника: " + S + "\n" +
                "Высота равностороннего триугольника: " + h + "\n" +
                "Внутренний радиус равностороннего триугольника: " + r + "\n" +
                "Внешний радиус равностороннего триугольника: " + R + "\n"
        );
    }
}

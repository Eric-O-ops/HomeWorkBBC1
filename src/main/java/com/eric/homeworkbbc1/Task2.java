package com.eric.homeworkbbc1;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        double r; // r - радиус круга
        double d, c, S; // d - диаметр круга, с - длина окружности, S - площадь круга
        Scanner in = new Scanner(System.in);
        System.out.println("Введите r: ");
        r = in.nextDouble(); // ввод радиуса
        d = 2 * r;
        c = Math.PI * d;
        S = Math.PI * r * r;
        System.out.println(
                "Диаметр: " + d + "\n" +
                "Длина окружности: " + c + "\n" +
                "Площадь окружности: " + S
        );

    }
}

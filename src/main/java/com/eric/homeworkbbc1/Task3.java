package com.eric.homeworkbbc1;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        double R,r,S;
        final double PI = 3.14;
        R = 20;
        Scanner in = new Scanner(System.in);
        System.out.println("Ввидите r: ");
        r = in.nextDouble();

        if (R < r) {
            S = 2 * PI * (r * r - 400);
            System.out.println("Площадь равна: " + S);
        } else {
            System.out.println("Ошибка");
        }
    }
}
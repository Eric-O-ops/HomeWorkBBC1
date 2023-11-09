package com.eric.homeworkbbc1.module1;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        double a;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ребро куба: ");
        a = in.nextDouble();
        double S1 = a * a;
        double S2 = 6 * S1;
        double V = a * a * a;
        System.out.println(
                "Площадь грани: " + S1 + "\n" +
                "Площадь полной поверхности куба: " + S2 + "\n" +
                "Объем куба: " + V
        );
    }
}

package com.eric.homeworkbbc1.module2.independentwork3;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {
        double x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x");
        x = scanner.nextDouble();
        System.out.println("Введите y");
        y = scanner.nextDouble();
        if(x<y) {
            x += y;
            y = x - y;
            x -= y;
        }
        System.out.println("x = " + x + "\ny = " + y);
    }
}
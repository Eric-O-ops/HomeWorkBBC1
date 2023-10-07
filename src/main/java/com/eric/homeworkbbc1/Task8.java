package com.eric.homeworkbbc1;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        int x1,x2;
        int y1,y2;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите х1");
        x1 = in.nextInt();
        System.out.println("Введите х2");
        x2 = in.nextInt();
        System.out.println("Введите y1");
        y1 = in.nextInt();
        System.out.println("Введите y2");
        y2 = in.nextInt();

        double l = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));

        System.out.println("Расстояние между точкками равно " + l);
    }
}

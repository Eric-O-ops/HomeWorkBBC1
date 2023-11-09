package com.eric.homeworkbbc1.module1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        double a,b,c; // a,b - катеты, с - гипотенуза
        Scanner in = new Scanner(System.in);
        System.out.println("Введите катет а:");
        a = in.nextDouble(); // ввод а
        System.out.println("Введите катет b:");
        b = in.nextDouble(); // ввод b
        c = Math.pow((a*a + b*b), 0.5); // вычисление гипотинузы
        System.out.println("Гипотинуза рана: " + c);
    }
}
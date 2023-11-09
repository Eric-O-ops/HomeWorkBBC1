package com.eric.homeworkbbc1.module2.independentwork3;

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {
       int day, month;
       Scanner scanner = new Scanner(System.in);
       System.out.println("Введите день");
       day = scanner.nextInt();
       System.out.println("Введите месяц");
       month = scanner.nextInt();
       if (day < 1 || day > 31 ) System.out.println("Неправильно введн день");
       if (month < 1 || month > 12 ) System.out.println("Неправильно введн месяц");
    }
}
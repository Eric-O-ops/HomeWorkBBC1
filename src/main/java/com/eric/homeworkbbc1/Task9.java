package com.eric.homeworkbbc1;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        int x;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x: ");
        x = in.nextInt();
        int a = x / 1000;

        switch (a) {
            case 1 :
                System.out.println("one");
                break;
            case 2 :
                System.out.println("two");
                break;
            case 3 :
                System.out.println("three");
                break;
            case 4 :
                System.out.println("four");
                break;
            case 5 :
                System.out.println("five");
                break;
            case 6 :
                System.out.println("six");
                break;
            case 7 :
                System.out.println("seven");
                break;
            case 8 :
                System.out.println("eight");
                break;
            case 9 :
                System.out.println("nine");
                break;

            default:
                System.out.println("Число не четыререхзначное");
        }
    }
}

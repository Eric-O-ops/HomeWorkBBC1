package com.eric.homeworkbbc1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        /*double a,b,c; // a,b - катеты, с - гипотенуза
        Scanner in = new Scanner(System.in);
        System.out.println("Введите катет а:");
        a = in.nextDouble(); // ввод а
        System.out.println("Введите катет b:");
        b = in.nextDouble(); // ввод b
        c = Math.pow((a*a + b*b), 0.5); // вычисление гипотинузы
        System.out.println("Гипотинуза рана: " + c);*/


        /*int n ;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        if ((n%10==n/1000)&&((n/10)%10==(n/100)%10)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("No Palindrome");
        }*/

        int n = 137;
        System.out.println((n / 100) % 10);
        System.out.println((n / 10) % 10);
        System.out.println(n % 10);
    }
}
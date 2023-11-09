package com.eric.homeworkbbc1.module2.independentwork3;

import com.eric.homeworkbbc1.extensions.Extension;

public class Task16 {

    public static void main(String[] args) {
        int n;
        System.out.println("Please input count of petals");
        n = Extension.getScanner().nextInt();
        if (n % 2 == 0) {
            System.out.println("Love");
        } else {
            System.out.println("Doesn't love");
        }
    }
}
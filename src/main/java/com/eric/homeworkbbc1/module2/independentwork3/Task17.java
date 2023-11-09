package com.eric.homeworkbbc1.module2.independentwork3;

import com.eric.homeworkbbc1.extensions.Extension;

public class Task17 {

    public static void main(String[] args) {
        int t;
        System.out.println("Input temperature");
        t = Extension.getScanner().nextInt();
        if (t > 60) {
            System.out.println("Пажароопасная ситуация");
        } else {
            System.out.println("Температура стабильна");
        }
    }
}
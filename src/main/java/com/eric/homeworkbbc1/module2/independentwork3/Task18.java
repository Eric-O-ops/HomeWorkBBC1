package com.eric.homeworkbbc1.module2.independentwork3;

import com.eric.homeworkbbc1.extensions.Extension;

public class Task18 {

    public static void main(String[] args) {
        double x, y;
        System.out.println("Введите x");
        x = Extension.getScanner().nextDouble();
        System.out.println("Введите y");
        y = Extension.getScanner().nextDouble();
        if ((x >= -1 && x <= -0.5) && (y >= 0 && y <= 1)) {
            if (x+y<=0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}
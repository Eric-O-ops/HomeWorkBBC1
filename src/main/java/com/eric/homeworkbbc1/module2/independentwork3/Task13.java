package com.eric.homeworkbbc1.module2.independentwork3;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        int V1, V2, V, S, t,t1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите скорость грузовика");
        V1 = scanner.nextInt();
        System.out.println("Введите скорость легвковой машины");
        V2 = scanner.nextInt();
        System.out.println("Введите время через которое выехала легковая машина");
        t = scanner.nextInt();
        V = V2-V1;
        if(V>0) {
            S = V1*t;
            t1 = S/V;
            System.out.println("легковая машина догонит грузовик через " + t1);
        } else {
            System.out.println("Легковая машина не догонит грузовик");
        }
    }
}

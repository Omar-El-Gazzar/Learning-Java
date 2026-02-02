package com.mycompany.functions;

import java.util.Scanner;

public class Functions {

    public static void main(String[] args) {
        double i;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number");
        i = input.nextDouble();

        System.out.println(Math.sqrt(i));

        int A = 10, B = 20;
        char X = 'A', Z = 'a';

        System.out.println(larger(A, B));
        System.out.println(larger(X, Z));
    }

    //Methods Overloading//
    public static int larger (int Num1, int Num2) {
        if (Num1 > Num2) return Num1;
        else return Num2;
    }

    public static int larger (int Num1, int Num2, int Num3) {
        if      (Num1 > Num2 && Num1 > Num3) return Num1;
        else if (Num2 > Num1 && Num2 > Num3) return Num2;
        else return Num3;
    }

    public static char larger (char ch1, char ch2) {
        if (ch1 > ch2) return ch1;
        else return ch2;
    }

    public static char larger (char ch1, char ch2, char ch3) {
        if      (ch1 > ch2 && ch1 > ch3) return ch1;
        else if (ch2 > ch1 && ch2 > ch3) return ch2;
        else return ch3;
    }
}

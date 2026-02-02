/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package how.to.use.functions;

import java.util.Scanner;

/**
 *
 * @author omare
 */
public class HowToUseFunctions {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Start Of The Program");
        DrawLine('*' , 15);
        
        System.out.println("Welcome To The First Part In Functions");
        DrawLine('#' , 30);
        
        int X = 50 , Y = 30 , Total;
        System.out.println(Sum(X,Y));
        Total = Sum(X,Y) * 5/3;
        System.out.println(Total);
    }
    
    public static void DrawLine(char Ch , int Length) {
        for (int i = 0 ; i < Length ; i++){
            System.out.print(Ch);
        }
        System.out.println();
    }
        
    public static int Sum (int B , int C) {
        int Result;
        Result = B + C;
        return Result;
    }
}
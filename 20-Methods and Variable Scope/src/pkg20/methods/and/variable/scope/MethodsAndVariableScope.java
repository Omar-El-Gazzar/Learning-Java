/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20.methods.and.variable.scope;

import java.util.Scanner;

/**
 *
 * @author omare
 */
public class MethodsAndVariableScope {

    /**
     * @param args the command line arguments
     */
    
    static int GlobalVar;
    
    public static void main(String[] args) {
        int Num1, Num2, Num3, Total;
        double Average;
        
        GlobalVar = 100;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 Numbers");
        
        Num1= input.nextInt();
        Num2= input.nextInt();
        Num3= input.nextInt();
        
        Total = sum (Num1, Num2, Num3);
        Average = average (Num1, Num2, Num3);
        display(Total, Average);
    }
    
    public static int sum (int Num1, int Num2, int Num3) {
    
        return Num1 + Num2 + Num3;
    }
    
    public static double average (int Num1, int Num2, int Num3) {
    
        return sum (Num1, Num2, Num3)/3;
    }
    
    public static void display(int s, double a){
        System.out.println("The Sum of The 3 Numbers Is " +s);
        System.out.println("The Average of The 3 Numbers Is " +a);
    }
}
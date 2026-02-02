/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays;

import java.util.Scanner;

/**
 *
 * @author omare
 */
public class Arrays {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Array Size");
        
        int size = input.nextInt();
        
        double[] Saleries = new double[size];
        
        for (int i = 0; i < Saleries.length; i++) {
            System.out.println("Enter Salery For Employee No." + (i+1));
            
            Saleries[i] = input.nextDouble();
        }
        
        double Sum = 0;
        
        for (int i = 0; i < Saleries.length; i++){
            Sum += Saleries[i];
        }
        
        System.out.println("The Sum Of Saleries is " + Sum);
        System.out.println("The Average Of Saleries is " + (Sum/Saleries.length));
    }
}

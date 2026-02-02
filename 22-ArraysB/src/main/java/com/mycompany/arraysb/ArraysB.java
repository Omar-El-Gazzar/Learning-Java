/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraysb;

import java.util.Scanner;

/**
 *
 * @author omare
 */
public class ArraysB {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Array Size");
        
        int size = input.nextInt();
        
        int[] Numbers = new int[size];
        
        for (int i = 0; i < Numbers.length; i++) {
            System.out.println("Enter Number " + (i+1));
            
            Numbers[i] = input.nextInt();
        }
        
        int Sum = 0, count = 0;
        
        for (int i = 0; i < Numbers.length; i++){
            if (Numbers[i] > 0){
                Sum += Numbers[i];
                count++;
            }
        }
        
        System.out.println("The Sum Of Numbers is " + Sum);
        System.out.println("The Average Of Positive Numbers is " + (Sum/count));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.twodimensionalarrays;

import java.util.Scanner;

/**
 *
 * @author omare
 */
public class App {
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int[][] Matrix = new int[5][3];
        
        fillarray(Matrix);
        System.out.println("Array Filled");
        System.out.println("Array Will Be Printed");
        
        printarray(Matrix);
        
        System.out.println("Array Will Be Summed");
        int Total = sumarray(Matrix);
        System.out.println(Total);
    }
    
    public static void fillarray (int[][] list) {
        for (int row = 0; row < list.length; row++) {
            for (int col = 0; col < list.length; col++){
                System.out.println("Enter Data For Row No. " + (row + 1) + " And Column No. " + (col + 1));
            
                list[row][col] = input.nextInt();
            }
        }
    }
    
    public static void printarray (int[][] list) {
        for (int row = 0; row < list.length; row++) {
            for (int col = 0; col < list.length; col++){
                System.out.println(list[row][col]);
            }
        }
    }
    
    public static int sumarray (int[][] list) {
        int sum = 0;
        
        for (int row = 0; row < list.length; row++) {
            for (int col = 0; col < list.length; col++){
                sum += list[row][col];
            }
        }
        return sum;
    }
}

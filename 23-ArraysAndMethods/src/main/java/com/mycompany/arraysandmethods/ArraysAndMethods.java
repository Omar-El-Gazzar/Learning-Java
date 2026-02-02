/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraysandmethods;

import java.util.Scanner;

/**
 *
 * @author omare
 */
public class ArraysAndMethods {

    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Enter Array Size");
        
        int searchedID;
        int size = input.nextInt();
        
        int[] IDs = new int[size];
        
        fillarray(IDs);
        printarray(IDs);
        
        System.out.println("Enter The Id To Search For");
        searchedID = input.nextInt();
        
        int returnedIndex = search(IDs, searchedID);
        
        if (returnedIndex >= 0)
            System.out.println("The Item Is Found");
        else
            System.out.println("The Item Is Not Found");
    }
    
    public static void fillarray (int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println("Enter Salery For Employee No." + (i+1));
            
            list[i] = input.nextInt();
        }
    }
    
    public static void printarray (int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
    
    public static int search (int[] list, int target) {
        for (int i = 0; i < list.length; i++){
            if (list[i] == target)
                return i;
        }
        return -1;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package check.number.between.pkg1.and.pkg100;

import java.util.Scanner;

/**
 *
 * @author omare
 */
public class CheckNumberBetween1And100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int Num1 ;
        
        System.out.println("Enter a Number");
        
        Num1 = input.nextInt();
        
        if (Num1 >= 1 && Num1 <= 100 )
            System.out.println("The Number Is Between 1 And 100");
        
        else
            System.out.println("The Number Is Out Of Range");
        
        // Another Way With Or ||
        
        /*
        if (Num1 >= 1 || Num1 <= 100 )
            System.out.println("The Number Is Between 1 And 100");
        
        else
            System.out.println("The Number Is Out Of Range");
        */
    }
    
}

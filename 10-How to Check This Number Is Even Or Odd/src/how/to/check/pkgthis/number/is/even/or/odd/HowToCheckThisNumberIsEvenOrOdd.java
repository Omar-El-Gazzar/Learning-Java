/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package how.to.check.pkgthis.number.is.even.or.odd;

import java.util.Scanner;

/**
 *
 * @author omare
 */
public class HowToCheckThisNumberIsEvenOrOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner La = new Scanner(System.in);
        
        int Number ;
        
        System.out.println("Enter Number To Test");
        Number = La.nextInt();
        
        if (Number % 2 == 0)
            
        System.out.println("It's Even Number");
        
        else  
            
        System.out.println("It's Odd Number");
    }
    
}

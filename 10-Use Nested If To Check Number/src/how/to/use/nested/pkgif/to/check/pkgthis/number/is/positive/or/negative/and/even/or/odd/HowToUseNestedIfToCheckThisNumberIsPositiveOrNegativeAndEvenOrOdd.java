/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package how.to.use.nested.pkgif.to.check.pkgthis.number.is.positive.or.negative.and.even.or.odd;

import java.util.Scanner;

/**
 *
 * @author omare
 */
public class HowToUseNestedIfToCheckThisNumberIsPositiveOrNegativeAndEvenOrOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner Mi = new Scanner(System.in);
        
        int Num ;
        
        System.out.println("Enter Number To Test");
        Num = Mi.nextInt();
        
        if (Num > 0)
        {   
            if (Num %2 == 0)
            {
            System.out.println("It's Positive Number");
            System.out.println("It's Even Number");
            }
            else
            { 
            System.out.println("It's Positive Number");
            System.out.println("It's Odd Number");
            }
        }
        else      
            System.out.println("It's Negative Number");
    }
    
}

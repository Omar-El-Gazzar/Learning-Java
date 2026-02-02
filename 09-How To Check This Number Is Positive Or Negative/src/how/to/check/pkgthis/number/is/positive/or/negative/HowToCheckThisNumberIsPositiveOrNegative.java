/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package how.to.check.pkgthis.number.is.positive.or.negative;

import java.util.Scanner;

/**
 *
 * @author omare
 */
public class HowToCheckThisNumberIsPositiveOrNegative {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner Sol = new Scanner(System.in);
        
        int Num ;
        
        System.out.println("Enter Number To Test");
        Num = Sol.nextInt();
        
        if (Num >= 0)
        {    
        System.out.println("It's Positive Number");
        System.out.println("Try Another Number");
        }
        else      
        System.out.println("It's Negative Number");
    }
    
}

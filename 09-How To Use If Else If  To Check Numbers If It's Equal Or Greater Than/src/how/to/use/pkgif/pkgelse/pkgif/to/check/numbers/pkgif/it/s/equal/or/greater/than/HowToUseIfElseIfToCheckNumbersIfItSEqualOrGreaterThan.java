/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package how.to.use.pkgif.pkgelse.pkgif.to.check.numbers.pkgif.it.s.equal.or.greater.than;

import java.util.Scanner;

/**
 *
 * @author omare
 */
public class HowToUseIfElseIfToCheckNumbersIfItSEqualOrGreaterThan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int Num1 , Num2 ;
        
        System.out.println("Enter First Number");
        
        Num1 = input.nextInt();
        
        System.out.println("Enter Second Number");
        
        Num2 = input.nextInt();
        
        if (Num1 == Num2 )
            System.out.println("Both Are Equal");
          
        else if ( Num1 > Num2 )
            System.out.println("Number First Is Greater Than Number Second");
            
        else
            System.out.println("Number Second Is Greater Than Number Fisrt");
                
    }
    
}

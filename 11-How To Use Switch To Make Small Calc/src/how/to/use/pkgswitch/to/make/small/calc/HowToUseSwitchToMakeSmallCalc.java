/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package how.to.use.pkgswitch.to.make.small.calc;

import java.util.Scanner;

/**
 *
 * @author omare
 */
public class HowToUseSwitchToMakeSmallCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int Choice , Num1 , Num2 ;

        System.out.println("Enter Your Choice");
        
        System.out.println("1. Add Two Numbers");
        System.out.println("2. Get The Subtrackt Of a Positive Numbers");
        System.out.println("3. Get The Square Of a Number");
        
        Choice = input.nextInt();
        
        
        switch (Choice)
        {
            case 1 :
                System.out.println("Enter Two Numbers");
                Num1 = input.nextInt();
                Num2 = input.nextInt();
                System.out.println(Num1 + Num2);
            break;
            
            case 2 :
                System.out.println("Enter Two Numbers");
                Num1 = input.nextInt();
                Num2 = input.nextInt();
                System.out.println(Num1 - Num2);
            break;
        
            case 3 :
                System.out.println("Enter a Positive Numbers");
                Num1 = input.nextInt();
                    if (Num1 >= 0)
                        System.out.println(Num1 * Num1);
                    else
                        System.out.println("Not Valid");
            break;

            default :
                System.out.println("Invalid Input Choice");
        }
    }
    
}

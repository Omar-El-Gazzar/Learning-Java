/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package how.to.use.pkgbreak.and.pkgcontinue.statements;

import java.util.Scanner;

/**
 *
 * @author omare
 */
public class HowToUseBreakAndContinueStatements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int Counter = 1;
        int Num;
        int Sum = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 7 Grades To Get The Average");
        
        while (Counter <= 7 )
        {
            System.out.println("Enter Grade For Students No." + Counter);
            Num = input.nextInt();

            if (Num < 0)
                {
                    System.out.println("Negative Numbers Are Not Allowed");
                    break;
                }
            Sum = Sum + Num;
            Counter ++;
        }//End While
        
        System.out.println("Average Of The 7 Grades Is " + Sum/--Counter);

    }
    
}

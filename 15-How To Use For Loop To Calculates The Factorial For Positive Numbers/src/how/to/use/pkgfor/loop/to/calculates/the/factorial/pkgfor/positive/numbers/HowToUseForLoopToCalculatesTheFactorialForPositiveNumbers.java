/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package how.to.use.pkgfor.loop.to.calculates.the.factorial.pkgfor.positive.numbers;

import java.util.Scanner;

/**
 *
 * @author omare
 */
public class HowToUseForLoopToCalculatesTheFactorialForPositiveNumbers 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int Num;
        int Factorial = 1;
        
        Scanner input = new Scanner(System.in);
        
        for (int J = 1; J <= 5 ; J++)
        {
            System.out.println("Enter A Positive Number ");

            Num = input.nextInt();

            for (int I = 1; I <= Num ; I++)
                {
                Factorial = Factorial * I;
                }
            System.out.println("Factorial Number Is " + Factorial);
        }
    }
    
}

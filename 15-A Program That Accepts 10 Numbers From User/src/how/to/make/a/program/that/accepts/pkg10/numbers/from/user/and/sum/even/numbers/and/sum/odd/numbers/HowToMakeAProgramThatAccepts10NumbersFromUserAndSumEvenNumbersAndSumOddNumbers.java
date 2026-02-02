/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package how.to.make.a.program.that.accepts.pkg10.numbers.from.user.and.sum.even.numbers.and.sum.odd.numbers;

import java.util.Scanner;

/**
 *
 * @author omare
 */
public class HowToMakeAProgramThatAccepts10NumbersFromUserAndSumEvenNumbersAndSumOddNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int I = 1;
        int Num;
        int Sumeven = 0;
        int Sumodd = 0;
        
        Scanner input = new Scanner(System.in);
        
        for (; I <= 10 ; I++)
            {
            
            System.out.println("Enter Number " + I);
            Num = input.nextInt();
            if (Num % 2 == 0)
                Sumeven += Num;
            else 
                Sumodd += Num;
            }
        System.out.println("The Sum Of Even Numbers Is " + Sumeven);
        System.out.println("The Sum Of Even Numbers Is " + Sumodd);
        
    }
    
}

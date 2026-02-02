/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package how.to.use.flag.controlled.pkgwhile.loop.to.check.numbers.positive.or.negative;

import java.util.Scanner;

/**
 *
 * @author omare
 */
public class HowToUseFlagControlledWhileLoopToCheckNumbersPositiveOrNegative {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double Sum = 0.0;
        double Value;
        boolean Positiveinpute = true;
        
        while (Positiveinpute == true)  {
            System.out.println("Enter The Next Positive Number");
            
            Value = input.nextDouble();
            
            if (Value < 0)
                {
                    Positiveinpute = false;
                }
            else
                Sum = Sum + Value;
        }
        System.out.println("Sum Of Input Number Is " + Sum);
    }
}
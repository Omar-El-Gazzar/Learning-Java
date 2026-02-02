/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package how.to.use.flag.controlled.loop.to.generated.random.number;

import java.util.Scanner;

/**
 *
 * @author omare
 */
public class HowToUseFlagControlledLoopToGeneratedRandomNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int Guess , Random;
        boolean Playing = true;
        
        Random = (int) (Math.random() * 100);
        
        //System.out.println("The Generated Random Number Is " + Random);
        
        while (Playing == true) {
            System.out.println("Guess a Number Between 0 And 100");
            
            Guess = input.nextInt();
            
            if (Guess > Random)
                System.out.println("Guess Too Large");
            
            else if (Guess < Random)
                System.out.println("Guess Too Small");
                
            else{
                System.out.println("You Win!!");
                Playing = false;
            }
        }
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package how.to.use.pkgswitch.to.check.the.vawol;

import java.util.Scanner;

/**
 *
 * @author omare
 */
public class HowToUseSwitchToCheckTheVawol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        char Ch;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Charcter To Test");
        
        Ch = input.next().charAt(0);
        
        switch (Ch)
        {
            case 'a' :
            case 'e' :
            case 'o' :
            case 'i' :
            case 'u' :
                System.out.println("This is Vowel ");
            break;

            default :
                System.out.println("This Is Normal Charcter");
        }
    }
    
}

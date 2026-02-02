/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package how.to.use.pkgdo.pkgwhile.to.make.small.claculater;

import java.util.Scanner;

/**
 *
 * @author omare
 */
public class HowToUseDoWhileToMakeSmallClaculater {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int Option ;
        int Num1 , Num2 ;
        
        Scanner input = new Scanner(System.in);
        
        do  {
            System.out.println("Select Your Choice From The Menu");
            System.out.println("1. To Sum 2 Numbers");
            System.out.println("2. Subtract 2 Numbers");
            System.out.println("3. Divid 2 Numbers");
            System.out.println("0. Exit");
            
            Option = input.nextInt();
            
            switch (Option) {
                case 1 :{
                    System.out.println("Enter 2 Numbers");
                    Num1 = input.nextInt();
                    Num2 = input.nextInt();
                    System.out.println("The Sum Of 2 Numbers Is " + (Num1 + Num2));
                    break;
                }
                    
                case 2 :{
                    System.out.println("Enter 2 Numbers");
                    Num1 = input.nextInt();
                    Num2 = input.nextInt();
                    System.out.println("The Subtract Of 2 Numbers Is " + (Num1 - Num2));
                    break;
                }
                    
                case 3 :{
                    System.out.println("Enter 2 Numbers");
                    Num1 = input.nextInt();
                    Num2 = input.nextInt();
                    System.out.println("The Divid Of 2 Numbers Is " + (Num1 / Num2));
                    break;
                }
                    
                case 0 :{
                    System.out.println("Good Bye");
                    break;
                }
                    
                default :{
                    System.out.println("Invalid Option");
                    break;
                }   
            }
            System.out.println();
        }
        while (Option != 0);
    }
}
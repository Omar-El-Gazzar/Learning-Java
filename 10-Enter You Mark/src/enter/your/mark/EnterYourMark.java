/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enter.your.mark;

import java.util.Scanner;

/**
 *
 * @author omare
 */
public class EnterYourMark {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner Fa = new Scanner(System.in);
        
        int marks ;
        
        System.out.println("Enter Your Marks");
        marks = Fa.nextInt();
        
        if (marks >60)
        {
        System.out.println("Congratulations , You Passed");
        System.out.println("Go To Next Level");
        }
        
        if (marks <60)
        {
        System.out.println("Sorry , You're Fail");
        }
        
        if (marks ==60)
        {
        System.out.println("Go To Next Level");
        }
    }
    
}

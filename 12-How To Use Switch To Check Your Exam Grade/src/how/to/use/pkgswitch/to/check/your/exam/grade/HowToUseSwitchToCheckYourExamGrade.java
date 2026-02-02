/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package how.to.use.pkgswitch.to.check.your.exam.grade;

import java.util.Scanner;

/**
 *
 * @author omare
 */
public class HowToUseSwitchToCheckYourExamGrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        char Grade;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Exam Grade");
        
        Grade = input.next().charAt(0);
        
        switch (Grade)
        {
            case 'A' :
                System.out.println("Excellent");
            break;
            
            case 'B' :
                System.out.println("Very Good");
            break;
        
            case 'C' :
                System.out.println("Good");
            break;
        
            case 'D' :
                System.out.println("Fair");
            break;
        
            case 'F' :
                System.out.println("Failed");
            break;
            
            default :
                System.out.println("Invalid Grade");
        }
    }
    
}

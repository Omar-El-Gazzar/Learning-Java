/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package how.to.know.your.exam.grades;

import java.util.Scanner;

/**
 *
 * @author omare
 */
public class HowToKnowYourExamGrades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int Grade ;
        
        System.out.println("Enter Your Exam Grade");
        
        Grade = input.nextInt();
        
        if (Grade >= 90 )
            System.out.println("You Got A");
          
        else if (Grade >= 80 )
            System.out.println("You Got B");
        
        else if (Grade >= 70 )
            System.out.println("You Got C");
        
        else if (Grade >= 60 )
            System.out.println("You Got D");
        
        else
            System.out.println("You Got F");
        
        //Another Way
        
        /*
        System.out.println("Enter Your Exam Grade");
        
        Grade = input.nextInt();
        
        if (Grade >= 90 && Grade <= 100)
            System.out.println("You Got A");
          
        else if (Grade >= 80 && Grade <= 90)
            System.out.println("You Got B");
        
        else if (Grade >= 70 && Grade <= 80)
            System.out.println("You Got C");
        
        else if (Grade >= 60 && Grade <= 70)
            System.out.println("You Got D");
        
        else
            System.out.println("You Got F");
        */
    }
    
}

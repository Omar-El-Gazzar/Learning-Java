/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package how.to.use.pkgwhile.loop.to.print.the.average.garde.pkgfor.pkg6.students;

import java.util.Scanner;

/**
 *
 * @author omare
 */
public class HowToUseWhileLoopToPrintTheAverageGardeFor6Students {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int Counter = 1;
        int Grade = 0;
        int Sum = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 6 Grades To Get The Average Or -1 To Exit");
        
        while (Counter <= 6 && Grade != -1) {
            System.out.println("Enter Grade For Students No." + Counter);
            Grade = input.nextInt();
            Sum += Grade;
            Counter++;
        }
        
        System.out.println("Average Of The 6 Grades Is " + Sum/6);
    }
}
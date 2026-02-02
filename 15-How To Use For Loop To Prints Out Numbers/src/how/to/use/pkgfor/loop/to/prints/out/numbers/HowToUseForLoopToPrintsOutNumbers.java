/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package how.to.use.pkgfor.loop.to.prints.out.numbers;
/**
 *
 * @author omare
 */
public class HowToUseForLoopToPrintsOutNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Printing Numbers From 0 To 10");
        for (int I = 0 ; I <= 10 ; I++)
            System.out.println(I);
        
        System.out.println("Printing Even Numbers From 0 To 10");
        for (int I = 0 ; I <= 10 ; I+=2)
            System.out.println(I);
        
        System.out.println("Printing Numbers From 10 To 0");
        for (int I = 10 ; I >= 0 ; I--)
            System.out.println(I);
        
        System.out.println("Printing Odd Numbers From 0 To 10");
        for (int I = 1 ; I <= 10 ; I=I + 2)
            System.out.println(I);
    }
    
}

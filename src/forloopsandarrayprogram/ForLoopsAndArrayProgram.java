/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package forloopsandarrayprogram;

import java.util.Scanner;

/**
 *
 * @author aemal4075
 */
public class ForLoopsAndArrayProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyedInput = new Scanner (System.in);
        
        String [ ] friends = new String [5];
        
        System.out.println("Enter the names of five friends:");
        for (int i = 0; i <= 4; i = i + 1)
        {
            friends[i] = keyedInput.nextLine();
        }
        
        System.out.println("The second, third and fourth names listed were:");
        System.out.println("second: " + friends[1]);
        System.out.println("third: " + friends[2]); 
        System.out.println("fourth: " + friends[3]);
        
    }
    
}

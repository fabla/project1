/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirst_java;

/**
 *
 * @author FABLA
 */

import java.util.Scanner;

public class Myfirst_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // yes = 1 and no = 0
        int question1 = 1;
        int question2 = 1;
        int question3 = 1;
Scanner console = new Scanner(System.in);
        System.out.println("Did Colon discover America?");
    
      question1 = console.nextInt();
       
        if (question1 == 1 | question1 != 1) {
            System.out.println("Is the capital of England Cambridge?");
            question2 = console.nextInt();
        } 
        
        if (question2 == 1 & question1 == 1) {
            System.out.println("The sun is a star?");
            question3 = console.nextInt();
            
            
        } 
        
        else {
            System.out.println("GAME OVER");
        }
    }
    // TODO code application logic here
}

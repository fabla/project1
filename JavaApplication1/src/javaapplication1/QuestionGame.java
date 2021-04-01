/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author jdmir
 */
public class QuestionGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // yes = 1 and no = 0
        Scanner console = new Scanner(System.in);

        System.out.println("Did Colon discover America?");

        int question1 = console.nextInt();
        boolean won = false;

        if (question1 == 1) {
            System.out.println("Great!, Is the capital of England Cambridge?");
            int question2 = console.nextInt();

            if (question2 == 0) {
                System.out.println("Great!, The sun is a star?");
                int question3 = console.nextInt();
                
                if(question3 == 1) {
                    won = true;
                } 
            } 
        } 
        
        if (won) {
            System.out.println("Great, you won");
        }
        else {
            System.out.println("GAME OVER");
        }
        
    }
    
}

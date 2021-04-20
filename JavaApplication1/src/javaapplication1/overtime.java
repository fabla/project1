/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overtime;

/**
 *
 * @author FABLA
 * 
 */

import java.util.Scanner;

public class Overtime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         
        int weekly = 40; 
        
        int pay = 100;
        int pay1 = pay*2;
        int pay2 = pay*3;
         
         System.out.println("How many hour(s) did you work this week");
          Scanner console = new Scanner(System.in);
          int overtime = console.nextInt();
         
 
if (overtime <= 8 & overtime != 0){
   
  System.out.println("your overtime pay  is : " + (pay1) );
}
else
    if (overtime > 8){
        System.out.println("your overall pay  is : " + (pay1 + pay2) );
    
    }
    
else
  System.out.println("Your weekly pay is : " + 100);
    }
    }
 


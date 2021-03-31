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
        
         
         int overtime = 8;
         int pay = 100;
       
         
         System.out.println("How many extra hour(s) did you work this week");
          Scanner console = new Scanner(System.in);
          overtime = console.nextInt();
 
if (overtime < 8 & overtime != 0){
   
  System.out.println("your weekly pay  is : " + (pay * 2) );
}

else
if (overtime >= 8){
   
  System.out.println("your weekly pay  is : " + (pay * 3) );
}

else

  System.out.println("Your weekly pay is : " + 100);
    }
    }
    

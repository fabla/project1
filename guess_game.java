package guess_game;
import java.util.Scanner;
/**
 *
 * @author FABLA
 */
public class Guess_game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int number;
        int question;
        
        Scanner console = new Scanner(System.in);
        System.out.println("Which number do you want to play with?");
        
        number = console.nextInt();
        

        for (;;) {
            System.out.println("Choose your number?");
            question = console.nextInt();
            if (number > question) {
           System.out.println("TOO LOW");
            question = console.nextInt();
            }
            
             if (number < question) {
           System.out.println("TOO HIGH");
            question = console.nextInt();
            }
            if (number == question) {
                System.out.println("YOU ARE RIGHT");
                break;
                
            }
           
        }
    }
    }
    
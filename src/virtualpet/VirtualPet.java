/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package virtualpet;
import java.util.Scanner;
/**
 *
 * @author michael.roy-diclemen
 */
public class VirtualPet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final String REQUIRED_USERNAME = "snoopy";
        final String REQUIRED_PASSWORD = "toto";
        
        Scanner keyboard = new Scanner(System.in);
        
        // --- PART 1: MENU --- //
        
        System.out.println("------------------------------------------");
        System.out.println("|               \\`*-.                    |");
        System.out.println("|                )  _`-.                 |");
        System.out.println("|               .  : `. .                |");
        System.out.println("|               : _   '  \\               |");
        System.out.println("|               ; o` _.   `*-._          |");
        System.out.println("|      PET      `-.-'          `-.       |");
        System.out.println("|   SIMULATOR     ;       `       `.     |");
        System.out.println("| -------------   :.       .        \\    |");
        System.out.println("| 1) START        . \\  .   :   .-'   .   |");
        System.out.println("| 2) INSTRUCTIONS '  `+.;  ;  '      :   |");
        System.out.println("| 3) EXIT         :  '  |    ;       ;-. |");
        System.out.println("|                 ; '   : :`-:     _.`* ;|");
        System.out.println("|                /  .*' ; .*`- +'  `*'   |");
        System.out.println("|               *-*   `*-*  `*-*'        |");
        System.out.println("------------------------------------------");
        
        System.out.print("|");
        String option = keyboard.nextLine().toLowerCase();
        
        switch (option){
            case "3":
            case "exit":
                System.out.println("Goodbye!!");
                System.exit(0);
            case "1":
            case "start":
                System.out.println("------------------------------------------");
                System.out.println("|        Welcome to pet simulator!       |");
                System.out.println("|          Choose a starter pet          |");
                System.out.println("| -------------------------------------- |");
                System.out.println("|  1)DOG     2)CAT    3)DUCK   4)FISH    |");
                System.out.println("------------------------------------------");
                
                String petOption = keyboard.nextLine().toLowerCase();
                
                String petName = "";
                
                switch(petOption){
                    case "1":
                    case "dog":
                        petName="dog";
                        break;
                    case "2":
                    case "cat":
                        petName="car";
                        break;
                    case "3":
                    case "duck":
                        petName="duck";
                        break;
                    case "4":
                    case "fish":
                        petName="fish";
                        break;
                }
                System.out.println("You have successfully chosen a " + petName + " as your pet.");
                
                
                
                        
                break;
            case "2":
            case "instructions":
                System.out.println("INSTRUCTIONS");
                break;
            default:
                System.out.println("Please enter a valid choice!");
                break;
        }
        
    }
    
}

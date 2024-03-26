/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package virtualpet;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author michael.roy-diclemen
 */
public class VirtualPet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // --- FINAL VARIABLES / CONFIG --- //
        
        //dont change these
        final String vowels = "aeiou";
        final String consonants = "bcdfghjklmnpqrstvwxyz";
        
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        
        //settings
        final String REQUIRED_USERNAME = "snoopy";
        final String REQUIRED_PASSWORD = "toto";
        final int maxPoints = 20;
        
        final double doubleLetterChance = 0.3;
        
        //random.setSeed(0l);
        
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
        
        System.out.print("> Option: ");
        String option = keyboard.nextLine().toLowerCase();
        
        switch (option){
            case "3":
            case "exit":
                System.out.println("Goodbye!!");
                System.exit(0);
            case "1":
            case "start":
                
                // --- LOGIN SYSTEM --- //
                System.out.print("> Username: ");
                String username = keyboard.nextLine();
                System.out.print("> Password: ");
                String password = keyboard.nextLine();
                
                
                if(!(username.equals(REQUIRED_USERNAME)) || !(password.equals(REQUIRED_PASSWORD))){
                    System.out.println("------------------------------------------");
                    System.out.println("|   Sorry, you cannot play this game D:  |");
                    System.out.println("|               Goodbye!                 |");
                    System.out.println("------------------------------------------");
                    System.exit(0);
                }
                
                
                
                
                System.out.println("------------------------------------------");
                System.out.println("|        Welcome to pet simulator!       |");
                System.out.println("|          Choose a starter pet          |");
                System.out.println("| -------------------------------------- |");
                System.out.println("|  1)DOG     2)CAT    3)DUCK   4)FISH    |");
                System.out.println("------------------------------------------");
                
                System.out.print("> Pet Type: ");
                option = keyboard.nextLine().toLowerCase();
                
                String petType = "";
                
                switch(option){
                    case "1":
                    case "dog":
                        petType="dog";
                        break;
                    case "2":
                    case "cat":
                        petType="cat";
                        break;
                    case "3":
                    case "duck":
                        petType="duck";
                        break;
                    case "4":
                    case "fish":
                        petType="fish";
                        break;
                }
                System.out.println("You have successfully chosen a " + petType + " as your pet.");
                
                
                // --- NAMING SYSTEM --- //
                
                System.out.println("------------------------------------------");
                System.out.println("|           Choose a pet name!           |");
                System.out.println("|    Enter 'random' to generate one!     |");
                System.out.println("------------------------------------------");
                
                System.out.print("> Name: ");
                option = keyboard.nextLine().toLowerCase();
                
                String petName = "";
                
                switch(option){
                    case "random":
                        int nameLength = random.nextInt(4)+5;
                        //switch between vowels and consonants
                        for(int i=0;petName.length()<nameLength;i++){
                            if(i%2==0){
                                char letter = consonants.charAt(random.nextInt(21));
                                if(i==0){
                                    letter = Character.toUpperCase(letter);
                                }
                                petName += letter;
                            }else{
                                char letter = vowels.charAt(random.nextInt(5));
                                petName += letter;
                                if(Math.random() < doubleLetterChance){
                                    petName += letter;
                                }
                            }
                        }
                        break;
                    default:
                        petName = option;
                        
                }
                
                        
                
                // --- STATS --- //
                
                
                int max_health = 0;
                int max_food = 0;
                int max_energy = 0;
                
                for(int i=0;i<maxPoints;i++){
                    //randomly give each stat once until maxPoints runs out
                    int r = random.nextInt(3);
                    switch(r){
                        case 0:
                            max_health++;
                            break;
                        case 1:
                            max_food++;
                            break;
                        case 2:
                            max_energy++;
                            break;
                    }
                }
                
                System.out.println("------------------------------------------");
                System.out.println("|                " + petName + " ".repeat(24-petName.length()) + "|");
                System.out.println("|              " + "-".repeat(petName.length()+4) + " ".repeat(22-petName.length()) + "|");
                System.out.println("|                  HP: " + max_health + (max_health>9?"":" ") + "                |");
                System.out.println("|                FOOD: " + max_food + (max_food>9?"":" ") + "                |");
                System.out.println("|              ENERGY: " + max_energy + (max_energy>9?"":" ") + "                |");
                System.out.println("------------------------------------------");
                
                
                        
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package virtualpet;

import java.util.Scanner;
import java.util.Random;

import java.io.File;

/**
 *
 * @author Markus Ong
 */
public class VirtualPet {

    // --- FINAL VARIABLES / CONFIG --- //
    final static String VOWELS = "aeiou";
    final static String CONSONANTS = "bcdfghjklmnpqrstvwxyz";
    final static int STARTING_COINS = 35;
    final static double DOUBLE_LETTER_CHANCE = 0.3;
    final static int MAX_POINTS = 20;

    //dont change these
    final static Scanner keyboard = new Scanner(System.in);
    final static Random random = new Random();

    public static void main(String[] args) {

        //settings
        /*
        final String REQUIRED_USERNAME = "snoopy";
        final String REQUIRED_PASSWORD = "toto";
         */
        //random.setSeed(0l);
        /*if (!(username.equals(REQUIRED_USERNAME)) || !(password.equals(REQUIRED_PASSWORD))) {
            System.out.println("------------------------------------------");
            System.out.println("|   Sorry, you cannot play this game D:  |");
            System.out.println("|               Goodbye!                 |");
            System.out.println("------------------------------------------");
            System.exit(0);
        }*/
        while (true) {
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
            switch (option) {
                case "3":
                case "exit":
                    System.out.println("Goodbye!!");
                    System.exit(0);
                case "1":
                case "start":
                    String username = scan(">Useranme :");

                    String password = scan(">Password :");
                    
                    
                    File file = new File("./data/" + username + ".txt");
                    
                    
                    
                    String[] pet = getPet(file);
                    int[] stats = getStats(file);
                    String petType = pet[0];
                    String petName = pet[1];
                    int coins = STARTING_COINS;

                    while (true) {
                        System.out.println("------------------------------------------");
                        System.out.println("|                " + petName + " ".repeat(24 - petName.length()) + "|");
                        System.out.println("|              " + "-".repeat(petName.length() + 4) + " ".repeat(22 - petName.length()) + "|");
                        System.out.println("|                  HP: " + stats[0] + (stats[0] > 9 ? "" : " ") + "                |");
                        System.out.println("|                FOOD: " + stats[1] + (stats[1] > 9 ? "" : " ") + "                |");
                        System.out.println("|              ENERGY: " + stats[2] + (stats[2] > 9 ? "" : " ") + "                |");
                        System.out.println("|       ------------------------         |");
                        System.out.println("|                                        |");
                        System.out.println("|                MINIGAMES               |");
                        System.out.println("|                ---------               |");
                        System.out.println("|                                        |");
                        System.out.println("|  1) Number guesser    2) Letter pairs  |");
                        System.out.println("|         FREE              5 coins      |");
                        System.out.println("------------------------------------------");

                        option = keyboard.nextLine().toLowerCase();

                        switch (option) {
                            case "1":
                            case "number guesser":
                                //NUMBER GAME
                                System.out.println("------------------------------------------");
                                System.out.println("|          NUMBER GUESSING GAME          |");
                                System.out.println("|          --------------------          |");
                                System.out.println("|                                        |");
                                System.out.println("|      Guess a number between 1-100!     |");
                                System.out.println("------------------------------------------");
                                int randomNumber = random.nextInt(100) + 1;
                                int playerGuess = keyboard.nextInt();
                                int coinsGained = 0;
                                int difference = Math.abs(randomNumber - playerGuess);
                                if (difference < 50) {
                                    coinsGained = 1;
                                }
                                if (difference < 25) {
                                    coinsGained = 2;
                                }
                                if (difference < 10) {
                                    coinsGained = 5;
                                }
                                if (difference < 5) {
                                    coinsGained = 10;
                                }
                                if (difference < 1) {
                                    coinsGained = 20;
                                }
                                System.out.println("------------------------------------------");
                                System.out.println("|          NUMBER GUESSING GAME          |");
                                System.out.println("|          --------------------          |");
                                System.out.println("|                                        |");
                                System.out.println("|         Random number : " + randomNumber + " ".repeat(15 - (String.valueOf(randomNumber).length())) + "|");
                                System.out.println("|            Your guess : " + playerGuess + " ".repeat(15 - (String.valueOf(playerGuess).length())) + "|");
                                System.out.println("|                                        |");
                                System.out.println("|         You gained " + coinsGained + "  coins            |");
                                System.out.println("------------------------------------------");
                                coins += coinsGained;
                                break;
                            case "2":
                            case "letter pairs":
                                if (coins < 5) {
                                    System.out.println("you're too broke!!");
                                    break;
                                }
                                coins -= 5;

                                String letters = "AABBCCDDEEFFGG";

                                break;

                        }
                    }

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

    public static String[] newPet() {
        Random random = new Random();
        System.out.println("------------------------------------------");
        System.out.println("|        Welcome to pet simulator!       |");
        System.out.println("|          Choose a starter pet          |");
        System.out.println("| -------------------------------------- |");
        System.out.println("|  1)DOG     2)CAT    3)DUCK   4)FISH    |");
        System.out.println("------------------------------------------");

        String option = scan("> Pet Type: ").toLowerCase();

        String petType = "";

        switch (option) {
            case "1":
            case "dog":
                petType = "dog";
                break;
            case "2":
            case "cat":
                petType = "cat";
                break;
            case "3":
            case "duck":
                petType = "duck";
                break;
            case "4":
            case "fish":
                petType = "fish";
                break;
        }
        System.out.println("You have successfully chosen a " + petType + " as your pet.");

        // --- NAMING SYSTEM --- //
        System.out.println("------------------------------------------");
        System.out.println("|           Choose a pet name!           |");
        System.out.println("|    Enter 'random' to generate one!     |");
        System.out.println("------------------------------------------");

        String petName = scan("> Name: ");

        switch (petName.toLowerCase()) {
            case "random":
                petName = "";
                int nameLength = random.nextInt(4) + 5;
                //switch between vowels and consonants
                for (int i = 0; petName.length() < nameLength; i++) {
                    if (i % 2 == 0) {
                        char letter = CONSONANTS.charAt(random.nextInt(21));
                        if (i == 0) {
                            letter = Character.toUpperCase(letter);
                        }
                        petName += letter;
                    } else {
                        char letter = VOWELS.charAt(random.nextInt(5));
                        petName += letter;
                        if (Math.random() < DOUBLE_LETTER_CHANCE) {
                            petName += letter;
                        }
                    }
                }
                break;
            default:

        }

        String[] output = new String[2];
        output[0] = petType;
        output[1] = petName;

        return output;
    }

    public static int[] generateStats() {
        // --- STATS --- //
        int[] stats = new int[3];

        for (int i = 0; i < MAX_POINTS; i++) {
            stats[random.nextInt(3)]++;
        }
        return stats;
    }
    
    public static String[] getPet(File file){
        if(!file.exists()){
            return newPet();
        }
        return new String[0];
    }
    
    public static int[] getStats(File file){
        if(!file.exists()){
            return generateStats();
        }
        return new int[0];
    }

    public static String shuffleString(String s) {
        Random random = new Random();
        String newString = " ".repeat(s.length());
        for (int i = 0; i < s.length(); i++) {
            int index;
            do {
                index = random.nextInt(s.length());
            } while (s.charAt(index) == ' ');

            newString = newString.substring(0, index) + s.charAt(i) + newString.substring(index);
        }

        return "";
    }

    public static String scan(String prompt) {
        System.out.print(prompt);
        String output = keyboard.nextLine();
        return output;
    }

}

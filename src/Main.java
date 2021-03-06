/*****************
 * SENTENCE MAKER*
 *****************/

/***********************************************************************************************************************
 * This program takes word input from the user and throws them into a list.  You can keep throwing new words in to your*
 * hearts desire.  When done with that list it goes to the next one.  Each list represents a word and a randomizer will*
 * pick one of your choices form that list.  You can continue adding more lists of words to your hearts desire.  The   *
 * first word will be capitalized and the last word will be followed by a period.                                      *
 **********************************************************************************************************************/

import java.util.Scanner;
import java.util.Random;
import java.util.*;


public class Main {

    public static List<String> userInput() {                //User Input Method
        Scanner scan = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        do {
            System.out.println("Your words so far: \n" + list);
            System.out.println("Add more? (y/n)");
            if (scan.next().startsWith("y")) {              //Loop is created because the user presses y
                System.out.println("Next word: ");          //How do I get a number not added to the list?
                if (scan.hasNextInt()) {
                    System.out.println("Please don't add numbers.");
                    scan.next();
                    continue;
                }
                list.add(scan.next());
            } else if (scan.next().startsWith("n")) {
                break;
            }else{
                System.out.println("Choose y or no. ");
            }
        } while (true);
        String[] arr = list.toArray(new String[0]);
        System.out.println(list);
        return list;
    }

    /**
     * public static String userValidation(){
     * }
     **/
    public static void main(String[] args) {
        userInput();
    }
}

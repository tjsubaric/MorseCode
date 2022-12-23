/**
 * Class that con convert english string to morse, and vice versa based on valid user input
 *
 * @author Tommy Subaric
 * Date: 12-2-2021
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MorseConverter {

    /**
     * @param args Uses a single main method that could be broken up with two methods and a main
     */

    public static void main(String[] args) {

        /**
         * int choice is used to get which way the conversion will be
         * String phrase is the english string taken in, while morse is the output
         * String morseCode is the morse string taken in, while englishPhrase is the output
         */

        int choice = 0;
        String phrase;
        String morse = "";
        String morseCode;
        String englishPhrase = "";

        Scanner scan = new Scanner(System.in);

        /**
         * This while loop is used to take in the user choice, and will not leave this
         * phase until a valid input. If an invalid input is chosen the choice will be
         * reset, and the question will be asked again
         */

        while (choice == 0) {
            System.out.println("What would you like to do: ");
            System.out.println("1: English to Morse Code");
            System.out.println("2: Morse Code to English");
            System.out.print("Choice: ");
            choice = scan.nextInt();
            scan.nextLine();

            if ((choice != 1) && (choice != 2)) {
                choice = 0;
                System.out.println("Invalid Choice");
            }
        }

        /**
         * The way I went about my English to Morse conversions by putting a char key and string value
         * within a Hash Map and vice Versa for Morse to English Conversion
         */

        if (choice == 1) {
            Map<Character, String> map = new HashMap<>();
            map.put(' ', "   ");
            map.put('a', ".- ");
            map.put('b', "-... ");
            map.put('c', "-.-. ");
            map.put('d', "-.. ");
            map.put('e', ". ");
            map.put('f', "..-. ");
            map.put('g', "--. ");
            map.put('h', ".... ");
            map.put('i', ".. ");
            map.put('j', ".--- ");
            map.put('k', "-.- ");
            map.put('l', ".-.. ");
            map.put('m', "-- ");
            map.put('n', "-. ");
            map.put('o', "--- ");
            map.put('p', ".--. ");
            map.put('q', "--.- ");
            map.put('r', ".-. ");
            map.put('s', "... ");
            map.put('t', "- ");
            map.put('u', "..- ");
            map.put('v', "...- ");
            map.put('w', ".-- ");
            map.put('x', "-..- ");
            map.put('y', "-.-- ");
            map.put('z', "--.. ");
            map.put('0', "----- ");
            map.put('1', ".---- ");
            map.put('2', "..--- ");
            map.put('3', "...-- ");
            map.put('4', "....- ");
            map.put('5', "..... ");
            map.put('6', "-.... ");
            map.put('7', "--... ");
            map.put('8', "---.. ");
            map.put('9', "----. ");

            /**
             * This could have been done as a method
             * @param phrase is the String phrase taken in to be converted
             * @return morse is the String morse Code converted from the user input
             */

            System.out.println("Please Enter a English Phrase: ");
            phrase = scan.nextLine();
            phrase = phrase.toLowerCase();

            for (int i = 0; i < phrase.length(); i++) {
                morse += map.get(phrase.charAt(i));
            }
            System.out.println(morse);

        } else {
            Map<String, Character> map2 = new HashMap<>();
        }
    }
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter1;

/**
 *
 * @author Sean
 */

//it uses the scanner and lets you put inn a string 
//that string is check for vowels and the Sout then returns the vowel amouts 
import java.util.Scanner;

public class CountVowels {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        int vowelCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); //extracts from the string 
            if ((c == 'A') || (c == 'a')
                    || (c == 'E') || (c == 'e')
                    || (c == 'I') || (c == 'i')
                    || (c == 'O') || (c == 'o')
                    || (c == 'U') || (c == 'u')) {
                vowelCount++; //increments the vowel count 
            }
        }
        System.out.println("That string contains "
                + vowelCount + " vowels.");
    }
}

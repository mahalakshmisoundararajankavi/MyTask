package week3.day1AssignmentsAndday2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		//PrintUniqueCharacter
		/*
		 * Problem
		 * 
		 * a) Take your name as input
		 * b) Print all unique characters only (any order)
		 * 
		 * Input:  babu
		 * Output: a u 
		 * 
		 */
		String name = "Mahalakshmi";
        char[] nameChar = name.toCharArray();
        //char[] characters = name.toCharArray();
        Set<Character> uniqueCharacters = new HashSet<Character>();

        for (char c : nameChar) {
            if (uniqueCharacters.contains(c)) {
                uniqueCharacters.remove(c);
            } else {
                uniqueCharacters.add(c);
            }
        }

        for (char c : uniqueCharacters) {
            System.out.print(c + " ");
        }
		/*
		 * Psuedocode
		 * 
		 * a) Convert String to Character array
		 * b) Create a new Set -> HashSet
		 * c) Add each character to the Set and if it is already there, remove it
		 * d) Finally, print the set
		 * 
		 */

	}

}

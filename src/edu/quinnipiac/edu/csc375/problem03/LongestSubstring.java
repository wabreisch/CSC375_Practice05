/**
 * Wes Breisch
 * CSC 375 Assignment #5, Problem #3
 */

package edu.quinnipiac.edu.csc375.problem03;

import java.util.HashMap;

public class LongestSubstring {
	
	private String input;
	
	public LongestSubstring(String input) {
		this.input = input.toLowerCase();
	}
	
	public int findLongestSubstring() {
		int currLongest = 0; // holds the length of the current longest string
		int wordPos = 0; // holds the position of the character we're currently working on
		int currStringLength = 1; // holds the length of the current String without repeating characters

		HashMap<Character, Integer> charToIntHashMap = new HashMap<Character, Integer>();
		
		for (int i=0 ; i<input.length() ; i++) {
			if (charToIntHashMap.containsKey(input.charAt(i))) {
				// If we encounter a collision, move i back to the proper position in the word
				// and clear the charToIntHashMap of all its values
				i = wordPos++;
				charToIntHashMap.clear();
				currStringLength = 1;
			} else {
				// Increment currStringLength and then...
				// If the current character of the input String is unique, increment currStringLength and then
				// check if the charToIntHashMap is now larger than the previous longest String
				charToIntHashMap.put(input.charAt(i), currStringLength++);
				if (charToIntHashMap.size() > currLongest) {
					currLongest = charToIntHashMap.size();
				}
			}
		}
		
		return currLongest;
	}

}
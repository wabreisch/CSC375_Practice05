/**
 * Wes Breisch
 * CSC 375 Assignment #5, Problem #2
 */

package edu.quinnipiac.edu.csc375.problem02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortStrings {
	
	private ArrayList<String> words;
	
	public SortStrings(ArrayList<String> words) {
		this.words = words;
	}
	
	/**
	 * @return A list of words sorted by the number of vowels in each word in ascending order
	 */
	public List<String> sortWords() {
		Collections.sort(words, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return (countVowels(s1) < countVowels(s2) ? -1 : countVowels(s1) == countVowels(s2) ? 0 : 1); 
			}
		});

		return words;
	}
	
	/**
	 * @param word The word whose vowels this method will count
	 * @return The number of vowels in the given input String
	 */
	private int countVowels(String word) {
		return (word.length() - (word.replaceAll("[aeiouAEIOU]", "").length()));
	}
}
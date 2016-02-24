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
	
	public List<String> sortWords() {
		Collections.sort(words, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return (countVowels(s1) < countVowels(s2) ? -1 : countVowels(s1) == countVowels(s2) ? 0 : 1); 
			}
		});
		return words;
	}
	
	private int countVowels(String word) {
		int numVowels = 0;
		for (char c : word.toCharArray()) {
			// I am assuming for the purposes of this assignment that 'y' is not a vowel
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				numVowels++;
			}
		}
		return numVowels;
	}
}
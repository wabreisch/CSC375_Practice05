/**
 * Wes Breisch
 * CSC 375 Assignment #5, Problem #1
 */

package edu.quinnipiac.edu.csc375.problem01;

import java.util.Hashtable;

public class Isomorphism {
	private String s1;
	private String s2;
	
	public Isomorphism(String s1, String s2) {
		this.s1 = s1.toLowerCase();
		this.s2 = s2.toLowerCase();
	}
	
	/**
	 * Returns true if s1 and s2, the instance variables of this class, are isomorphisms of one another
	 * Returns false if s1 and s2 are not isomorphisms of one another
	 * @return if s1 and s2 are isomorphisms of one another
	 */
	public boolean isIsomorphism() {
		// s1 and s2 must be the same length in order for them to be isomorphisms of one another
		if (s1.length() != s2.length()) { return false; }
		
		boolean result = true;
		Hashtable<Character, Character> hashtable = new Hashtable<Character, Character>();
		char[] s1CharArray = s1.toCharArray(); // s1's characters will serve as the keys in the Hashtable 
		char[] s2CharArray = s2.toCharArray(); // s2's characters will serve as the values in the Hashtable
		
		for (int i=0 ; i<s1CharArray.length ; i++) {
			/**
			 * If the map already contains the key at s1CharArray[i] it MUST map to the same value.
			 * If the key at s1CharArray[i] does not map to the same value, we have a collision and thus
			 * s1 and s2 are not isomorphisms of one another.
			 */
			if (hashtable.containsKey(s1CharArray[i])) {
				if (hashtable.get(s1CharArray[i]) != s2CharArray[i]) {
					result = false; break;
				}
			}
			// If we pass the above test, then we may map the key in s1 to the value in s2
			hashtable.put(s1CharArray[i], s2CharArray[i]);
		}
		
		return result;
	}
	
}
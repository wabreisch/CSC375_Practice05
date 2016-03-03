/**
 * Wes Breisch
 * CSC 375 Assignment #5, Problem #3
 */

package edu.quinnipiac.edu.csc375.problem03;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongestSubstringTest {

	@Test
	public void test1() {
		assertEquals("Test 1", new LongestSubstring("test").findLongestSubstring(), 3);
	}

	@Test
	public void test2() {
		assertEquals("Test 2", new LongestSubstring("dodged").findLongestSubstring(), 4);
	}

	@Test
	public void test3() {
		assertEquals("Test that my implementation works with any character (that Java recognizes)",
				// the input string is simply "dodged" typed with the alt key pressed
				new LongestSubstring("∂ø∂©´∂").findLongestSubstring(), 4);
	}

	@Test
	public void test4() {
		String theAlphabet = "abcdefghijklmnopqrstuvwxyz";
		assertEquals("Test the entire English alphabet -- the result should be 26",
				new LongestSubstring(theAlphabet).findLongestSubstring(), 26);
	}

	@Test
	public void test5() {
		String theAlphabetTwice = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
		assertEquals("Test the entire English alphabet TWICE -- the result should be 26 again",
				new LongestSubstring(theAlphabetTwice).findLongestSubstring(), 26);
	}

}
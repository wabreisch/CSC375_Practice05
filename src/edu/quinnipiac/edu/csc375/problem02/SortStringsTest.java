/**
 * Wes Breisch
 * CSC 375 Assignment #5, Problem #2
 */

package edu.quinnipiac.edu.csc375.problem02;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;

public class SortStringsTest {

	@Test
	public void test1() {
		ArrayList<String> words = new ArrayList<String>();
		words.add("less"); words.add("code"); words.add("evenless"); words.add("bugs"); 

		ArrayList<String> expectedOutput = new ArrayList<String>();
		expectedOutput.add("less"); expectedOutput.add("bugs"); expectedOutput.add("code");
		expectedOutput.add("evenless"); 

		assertEquals("Test 1", new SortStrings(words).sortWords(), expectedOutput);
	}

}

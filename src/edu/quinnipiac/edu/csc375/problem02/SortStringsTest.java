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
	
	@Test
	public void test2() {
		ArrayList<String> words = new ArrayList<String>();
		words.add("aaaaeiaauuo"); words.add("abhbchbdhbfhbdvcvcaa"); words.add("aeae"); words.add("aeioe"); 

		ArrayList<String> expectedOutput = new ArrayList<String>();
		expectedOutput.add("abhbchbdhbfhbdvcvcaa"); expectedOutput.add("aeae"); expectedOutput.add("aeioe");
		expectedOutput.add("aaaaeiaauuo"); 

		assertEquals("Test 2", new SortStrings(words).sortWords(), expectedOutput);
	}
	
	@Test
	public void test3() {
		ArrayList<String> words = new ArrayList<String>();
		words.add("Breisch"); words.add("Wes");
		
		ArrayList<String> expectedOutput = new ArrayList<String>();
		expectedOutput.add("Wes"); expectedOutput.add("Breisch");

		assertEquals("Test 3", new SortStrings(words).sortWords(), expectedOutput);
	}
	
	@Test
	public void test4() {
		ArrayList<String> words = new ArrayList<String>();
		words.add("EeEe"); words.add("aOU"); words.add("IO"); words.add("a");
		
		ArrayList<String> expectedOutput = new ArrayList<String>();
		expectedOutput.add("a"); expectedOutput.add("IO"); expectedOutput.add("aOU"); expectedOutput.add("EeEe");

		assertEquals("Test 4", new SortStrings(words).sortWords(), expectedOutput);
	}

}

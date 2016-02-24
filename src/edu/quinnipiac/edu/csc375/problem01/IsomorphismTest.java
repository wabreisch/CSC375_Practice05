/**
 * Wes Breisch
 * CSC 375 Assignment #5, Problem #1
 */

package edu.quinnipiac.edu.csc375.problem01;

import static org.junit.Assert.*;

import org.junit.Test;

public class IsomorphismTest {

	@Test
	public void test1() {
		assertEquals("Ensure foo and bar are NOT isomorphic", new Isomorphism("foo", "bar").isIsomorphism(), false);
	}

	@Test
	public void test2() {
		assertEquals("Ensure egg and add are isomorphic", new Isomorphism("egg", "add").isIsomorphism(), true);
	}

	@Test
	public void test3() {
		assertEquals("Ensure title and paper are isomorphic", new Isomorphism("title", "paper").isIsomorphism(), true);
	}

	@Test
	public void test4() {
		assertEquals("Ensure expo and abcd are isomorphic", new Isomorphism("expo", "abcd").isIsomorphism(), true);
	}

	@Test
	public void test5() {
		assertEquals("Ensure expomarker and abcd are NOT isomorphic", new Isomorphism("expomarker", "abcd").isIsomorphism(), false);
	}

	@Test
	public void test6() {
		assertEquals("Ensure testing and xfzxrtu are isomorphic", new Isomorphism("testing", "xfzxrtu").isIsomorphism(), true);
	}

	@Test
	public void test7() {
		assertEquals("Ensure x and u are isomorphic", new Isomorphism("x", "u").isIsomorphism(), true);
	}

	@Test
	public void test8() {
		assertEquals("Ensure aa and ab are isomorphic", new Isomorphism("aa", "ab").isIsomorphism(), false);
	}
}
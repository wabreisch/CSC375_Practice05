/**
 * Wes Breisch
 * CSC 375 Assignment #5, Problem #5
 */

package edu.quinnipiac.edu.csc375.problem05;

import static org.junit.Assert.*;
import java.util.Stack;
import org.junit.Test;

public class SplitStackTest {

	@Test
	public void test1() {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(7); stack.push(18);
		stack.push(-77); stack.push(28);
		stack.push(8); stack.push(-4);
		
		Stack<Integer> expectedStack = new Stack<Integer>();
		expectedStack.push(-77); expectedStack.push(-4);
		expectedStack.push(7); expectedStack.push(18);
		expectedStack.push(28); expectedStack.push(8);
		
		assertEquals("Test 1", new SplitStack(stack).splitStack().toString(), new SplitStack(expectedStack).toString());
	}
	
	@Test
	public void test2() {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(19); stack.push(20);
		stack.push(-10); stack.push(-11);
		stack.push(-12); stack.push(18);

		Stack<Integer> expectedStack = new Stack<Integer>();
		expectedStack.push(-10); expectedStack.push(-11);
		expectedStack.push(-12); expectedStack.push(19);
		expectedStack.push(20); expectedStack.push(18);
		
		assertEquals("Test 2", new SplitStack(stack).splitStack().toString(), new SplitStack(expectedStack).toString());
	}
	
	@Test
	public void test3() {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(0); stack.push(0);
		stack.push(-10); stack.push(-11);

		Stack<Integer> expectedStack = new Stack<Integer>();
		expectedStack.push(-10); expectedStack.push(-11);
		expectedStack.push(0); expectedStack.push(0);
		
		assertEquals("Test 3", new SplitStack(stack).splitStack().toString(), new SplitStack(expectedStack).toString());
	}
	
	@Test
	public void test4() {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1); stack.push(2);
		stack.push(3); stack.push(4);
		stack.push(-1); stack.push(-2);
		stack.push(-3); stack.push(-4);

		Stack<Integer> expectedStack = new Stack<Integer>();
		expectedStack.push(-1); expectedStack.push(-2);
		expectedStack.push(-3); expectedStack.push(-4);
		expectedStack.push(1); expectedStack.push(2);
		expectedStack.push(3); expectedStack.push(4);
		
		assertEquals("Test 4", new SplitStack(stack).splitStack().toString(), new SplitStack(expectedStack).toString());
	}

}

/**
 * Wes Breisch
 * CSC 375 Assignment #5, Problem #5
 */

package edu.quinnipiac.edu.csc375.problem05;

import java.util.Stack;

public class SplitStack {
	
	private Stack<Integer> stack;
	
	public SplitStack(Stack<Integer> stack) {
		this.stack = stack;
	}

	public SplitStack splitStack() {
		Stack<Integer> splitStack = new Stack<Integer>();
		
		// push all the negative values on the stack first, in the order they appear
		for (int i=0 ; i<this.stack.size() ; i++) {
			if (this.stack.get(i) < 0) {
				splitStack.push(this.stack.get(i));
			}
		}
		
		// then push all the non-negative values on the stack, in the order they appear
		for (int i=0 ; i<this.stack.size() ; i++) {
			if (this.stack.get(i) >= 0) {
				splitStack.push(this.stack.get(i));
			}
		}

		// return a new stack that has been split as described in the problem
		return new SplitStack(splitStack);
	}
	
	// A method to turn a stack into a String (for unit testing purposes)
	public String toString() {
		String outputString = "";
		for (int i=this.stack.size()-1 ; i>=0; i--) {
			if (stack.get(i) != 0) {
				outputString += "{" + stack.get(i)  + "}";
			}
		}
		return outputString;
	}
	
}
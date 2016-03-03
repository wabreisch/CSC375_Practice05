/**
 * Wes Breisch
 * CSC 375 Assignment #5, Problem #4
 */

package edu.quinnipiac.edu.csc375.problem04;

import static org.junit.Assert.*;

//import java.awt.List;
import java.util.ArrayList;

import org.junit.Test;

public class EmployeeListTest {

	@Test
	public void test1() {
		ArrayList<String> employees = new ArrayList<String>();
		ArrayList<Integer> salaries = new ArrayList<Integer>();
		
		employees.add("Jim");
		employees.add("Tom");
		employees.add("Alan");
		employees.add("Jack");
		employees.add("Bob");
		employees.add("Steve");
		employees.add("John");
		employees.add("Justin");
		employees.add("Mary");
		employees.add("Larry");
		employees.add("Sue");
		
		salaries.add(300000);
		salaries.add(900000);
		salaries.add(900000);
		salaries.add(400000);
		salaries.add(800000);
		salaries.add(300000);
		salaries.add(800000);
		salaries.add(400000);
		salaries.add(400000);
		salaries.add(450000);
		salaries.add(800000);
		
		ArrayList<String> outputList = new ArrayList<String>();
		outputList.add("Larry");

		assertEquals("Test 1", new EmployeeList(employees, salaries).findLeastCommonSalary(), outputList);
	}
	
	@Test
	public void test2() {
		ArrayList<String> employees = new ArrayList<String>();
		ArrayList<Integer> salaries = new ArrayList<Integer>();
		
		employees.add("Jim"); salaries.add(900000);
		employees.add("Tom"); salaries.add(300000);
		employees.add("Alan"); salaries.add(300000);
		employees.add("Jack"); salaries.add(900000);
		employees.add("Lucy"); salaries.add(80000);
		employees.add("Don"); salaries.add(80000);
		
		
		ArrayList<String> outputList = new ArrayList<String>();
		outputList.add("Lucy");
		outputList.add("Don");

		assertEquals("Test 2", new EmployeeList(employees, salaries).findLeastCommonSalary(), outputList);
	}

	@Test
	public void test3() {
		ArrayList<String> employees = new ArrayList<String>();
		ArrayList<Integer> salaries = new ArrayList<Integer>();
		
		employees.add("Marie"); salaries.add(80000);
		employees.add("Karen"); salaries.add(60000);
		employees.add("John"); salaries.add(40000);
		employees.add("Ryan"); salaries.add(20000);
		
		ArrayList<String> outputList = new ArrayList<String>();
		outputList.add("Ryan");

		assertEquals("Test 3", new EmployeeList(employees, salaries).findLeastCommonSalary(), outputList);
	}

	@Test
	public void test4() {
		ArrayList<String> employees = new ArrayList<String>();
		ArrayList<Integer> salaries = new ArrayList<Integer>();
		
		employees.add("Marie"); salaries.add(80000);
		employees.add("Karen"); salaries.add(80000);
		employees.add("John"); salaries.add(80000);
		employees.add("Ryan"); salaries.add(80000);
		employees.add("Jeff"); salaries.add(80000);
		employees.add("Bob"); salaries.add(90000);
		employees.add("Josh"); salaries.add(90000);
		employees.add("Maria"); salaries.add(90000);
		employees.add("Liz"); salaries.add(90000);
		
		ArrayList<String> outputList = new ArrayList<String>();
		outputList.add("Bob");
		outputList.add("Josh");
		outputList.add("Maria");
		outputList.add("Liz");

		assertEquals("Test 4", new EmployeeList(employees, salaries).findLeastCommonSalary(), outputList);
	}

}

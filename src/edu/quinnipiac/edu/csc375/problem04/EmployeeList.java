/**
 * Wes Breisch
 * CSC 375 Assignment #5, Problem #4
 */

package edu.quinnipiac.edu.csc375.problem04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class EmployeeList {
	
	private List<String> employees;
	private List<Integer> salaries;
	
	public EmployeeList(List<String> employees, List<Integer> salaries) {
		if (employees.size() != salaries.size()) { return; }
		this.employees = employees;
		this.salaries = salaries;
	}
	
	public List<String> findLeastCommonSalary() {
		// A HashMap to map Integers (salaries) to a list of Strings (employees)
		HashMap<Integer, List<String>> salaryToEmployeeHashMap = new HashMap<Integer, List<String>>();
		
		// For every salary, map it to one or more employees
		for (int i=0 ; i<salaries.size() ; i++) {
			ArrayList<String> namesArrayList = new ArrayList<String>();
			namesArrayList.add(employees.get(i)); // add the current employee to the namesArrayList

			if (salaryToEmployeeHashMap.containsKey(salaries.get(i))) {
				// if this current employee has the same salary as someone else, add this employee to the end
				// of the existing list of employees with this salary
				namesArrayList.addAll(0, salaryToEmployeeHashMap.get(salaries.get(i)));
			}
			salaryToEmployeeHashMap.put(salaries.get(i), namesArrayList); 
		}

		return findEmployeeList(salaryToEmployeeHashMap);
	}
	
	public List<String> findEmployeeList(HashMap<Integer, List<String>> inputHashMap) {
		int minNumber = Integer.MAX_VALUE; // holds the value of the rarest salary in the inputHashMap
		int minKey = 0; // holds the key of the rarest salary in the inputHashMap

		Set<Integer> keySet = inputHashMap.keySet();
		
		// Find the rarest salary in the given KeySet by iterating over each element of the set
		// and choosing the 
		for (int key : keySet) {
			if (inputHashMap.get(key).size() < minNumber) {
				minNumber = inputHashMap.get(key).size();
				minKey = key;
			}
			// if the current key maps to a list of the same size as the current minNumber,
			// we need to check if its key value is lower -- if it is, set the new minKey
			if (inputHashMap.get(key).size() == minNumber) {
				if (key < minKey) {
					minKey = key;
				}
			}
		}

		return inputHashMap.get(minKey);
	}
	
}
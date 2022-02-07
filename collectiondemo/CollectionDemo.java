package com.hcl.collectiondemo;

import java.util.*;

public class CollectionDemo {
	public static void main(String args[]) {

//#ArrayList	
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(10, "Sam", "Apex"));
		empList.add(new Employee(30, "Justin", "Cary"));
		empList.add(new Employee(34, "Steven", "Raleigh"));
		empList.add(new Employee(67, "Nat", "Alexandria"));
		System.out.println(empList);

//#TreeMap	

		TreeMap<Integer, String> empmap = new TreeMap<Integer, String>();
		empmap.put(10, "Sam");
		empmap.put(30, "Justin");
		empmap.put(34, "Steven");
		empmap.put(67, "Nat");
		System.out.println("Map Elements: ");
		System.out.println(empmap);
		for (Map.Entry emp : empmap.entrySet()) {
			System.out.println(emp.getKey() + " " + emp.getValue());


		}
	}

}

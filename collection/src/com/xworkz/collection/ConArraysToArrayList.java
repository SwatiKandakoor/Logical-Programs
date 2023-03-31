package com.xworkz.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ConArraysToArrayList {

	public static void main(String[] args) {

		String[] str = { "Apple", "Banana", "Orange", "Mango", "Pappaya", "Apple", "Mango" };
		List list = Arrays.asList(str);
		System.out.println(list);

		Set removeDup = new TreeSet();
		removeDup.addAll(list);
		System.out.println(removeDup);
		
		Object[] obj=removeDup.toArray();
		for (Object arr : obj) {
			System.out.println(arr);
		}
	}

}

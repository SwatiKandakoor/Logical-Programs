package com.xworkz.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ConArraysToArrayListUsingInteger {

	public static void main(String[] args) {
		int[] number = { 2, 4, 1, 9, 4, 7, 9, 6 };
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < number.length; i++) {
			list.add(number[i]);
		}

		System.out.println(list);
		Set<Integer> set = new TreeSet<Integer>();
		set.addAll(list);
		System.out.println(set);
		
		Object[] obj=set.toArray();
		for (Object num : obj) {
			System.out.println(num);
		}
	}

}

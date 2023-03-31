package com.xworkz.collection;

import java.util.HashSet;

public class HashSetExpl {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(45);
		set.add(4);
		set.add(78);
		set.add(67);
		if (set.contains(34)) {
			System.out.println("34 present in the list");
		} else {
			System.out.println("34 is not present in the list");
		}
	}

}

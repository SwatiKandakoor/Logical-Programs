package com.xworkz.collection;

import java.util.LinkedList;

public class ConvertListToArray {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(20);
		list.add(23);
		list.add(58);
		list.add(49);
		list.add(13);

		Object[] obj = list.toArray();
		for (Object num : obj) {
			System.out.println(num);
		}

	}

}

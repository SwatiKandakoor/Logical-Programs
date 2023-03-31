package com.xworkz.collection;

import java.util.ArrayList;

public class UsingContainsMethod {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(20);
		list.add(34);
		list.add(89);
		list.add(2);
		list.add(100);
		
		if(list.contains(100)) {
			System.out.println("100 was found in the list");
		}
		else {
			System.out.println("100 was not found in the list");
		}
	}

}

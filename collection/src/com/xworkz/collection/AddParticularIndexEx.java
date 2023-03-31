package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddParticularIndexEx {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(20);
		System.out.println(list);
		//add particular index
		list.add(2, 4);
		Iterator<Integer> iter = list.iterator();
		while (iter.hasNext()) {
			int add = (int) iter.next();
			System.out.println(add);
		}
		System.out.println("------");
		list.remove(5);
		Iterator<Integer> it=list.iterator();
		while(it.hasNext()) {
			int remove=it.next();
			System.out.println(remove);
		}
		
	}

}

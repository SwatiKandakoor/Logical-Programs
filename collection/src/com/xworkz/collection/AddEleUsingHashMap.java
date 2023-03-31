package com.xworkz.collection;

import java.util.HashMap;
import java.util.Iterator;

public class AddEleUsingHashMap {

	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("1", "Apple");
		hashMap.put("2", "Banana");
		hashMap.put("3", "Pappaya");
		hashMap.put("4", "Orange");
		System.out.println(hashMap);
		System.out.println(hashMap.size());
		Iterator<String> ite=hashMap.keySet().iterator();
		while(ite.hasNext()) {
			String key=(String)ite.next();
			System.out.println("no :"+key +" fruits :"+hashMap.get(key));
		}
		
		
	}

}

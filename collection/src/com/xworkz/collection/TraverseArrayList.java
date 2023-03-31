package com.xworkz.collection;

import java.util.ArrayList;

public class TraverseArrayList {

	public static void main(String[] args) {
       ArrayList<Integer> list=new ArrayList<Integer>();
       list.add(10);
       list.add(3);
       list.add(4);
       list.add(6);
       list.add(19);
       for(Integer num:list) {
    	   System.out.println(num);
       }
	}

}

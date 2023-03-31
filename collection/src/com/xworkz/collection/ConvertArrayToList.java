package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {

	public static void main(String[] args) {
	 int[] num= {23,45,67,89,90,12,34,897};
	 List<Integer> list=new ArrayList<Integer>();
	 for(int i=0;i<num.length;i++) {
		 list.add(num[i]);
	 }
	 System.out.println(list);

	 
	}

}

package com.xworkz.collection;

import java.util.ArrayList;
import java.util.List;

public class UsingLambdaExp {

	public static void main(String[] args) {
		 List<String> list=new ArrayList<String>();  
	        list.add("ankit");  
	        list.add("mayank");  
	        list.add("irfan");  
	        list.add("jai");  
	          
	     list.forEach((n)->System.out.println(n));
	     System.out.println("-----------------------------");
	     list.stream().sorted().forEach((n)->System.out.println(n));;
	}

}

package com.xworkz.arithametic.things;

public class Fibonocci {

	public static void main(String[] args) {
		int num=5;
		int a=0;
		int b=1;
		int c=0;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<num;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		
		
		
	}

}

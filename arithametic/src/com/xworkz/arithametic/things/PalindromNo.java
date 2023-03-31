package com.xworkz.arithametic.things;

public class PalindromNo {
	public static void main(String[] args) {
		int no=121;
		int mod=0;
		int rev=0;
		int num=no;
		while(no!=0) {
			mod=no%10;
			no=no/10;
			rev=mod+10*rev;
			System.out.println(rev);
		}
		if(num==rev) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("Not palindrom");
		}
	}

}

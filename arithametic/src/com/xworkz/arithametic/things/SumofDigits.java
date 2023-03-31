package com.xworkz.arithametic.things;

public class SumofDigits {
	public static void main(String[] args) {
		int num=1234;
		int sum=0;
		int mod=0;
		int rev=0;
		int count=0;
		while(num!=0) {
		mod=num%10;
		num=num/10;
		count++;
		rev=mod+rev*10;
		System.out.println(rev);
		sum=mod+sum;
		}
		System.out.println(sum);
		System.out.println(count);
	}

}

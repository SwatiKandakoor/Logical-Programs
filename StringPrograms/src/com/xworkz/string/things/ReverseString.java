package com.xworkz.string.things;

public class ReverseString {

	public static void main(String[] args) {
       String str="Hello World";
       String rev=" ";
       for(int i=str.length()-1;i>=0;i--) {
    	   char ch=str.charAt(i);
    	   rev=rev+ch;
       }
       System.out.println(rev);
	}

}

package com.xworkz.string.things;

public class CountNoOfVowelsAndCon {

	public static void main(String[] args) {
     String s="Hello World";
     int vowels=0;
     int consonents=0;
     String str=s.toLowerCase();
     for(int i=0;i<str.length();i++) {
    	 char ch=str.charAt(i);
    	 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
    		 vowels++;
    	 }
    	 else if(ch>'b'&& ch<'z') {
    		 consonents++;
    	 }
     }
     System.out.println("vowels :"+ vowels);
     System.out.println("consonents :"+consonents);
		
		
	}

}

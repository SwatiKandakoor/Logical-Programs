package com.xworkz.string.things;

public class Palindrome {

	public static void main(String[] args) {
		String str = "madam";
		String rev = " ";
		String s = str;
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
			System.out.println(rev);
		}
		if (rev.equals(s)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}

}

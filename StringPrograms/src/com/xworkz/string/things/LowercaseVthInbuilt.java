package com.xworkz.string.things;

public class LowercaseVthInbuilt {

	public static void main(String[] args) {
		String str = "hello";
		String lower = " ";
		String upper = " ";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int x = (int) ch;
			lower = lower + (char) (x - 32);
		}
		System.out.println(lower);

		System.out.println("-----");
		for (int i = 0; i < lower.length(); i++) {
			char ch = lower.charAt(i);
			int a = (int) ch;
			upper = upper + (char) (a + 32);

		}
		System.out.println(upper);
	}

}

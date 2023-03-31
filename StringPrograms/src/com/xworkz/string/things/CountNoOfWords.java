package com.xworkz.string.things;

public class CountNoOfWords {
	public static void main(String[] args) {
		String str = "Keep smiling, because life is a beautiful thing and there's so much to smile about";
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
				count++;
			}

		}
		System.out.println(count);

	}

}

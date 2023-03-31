package com.xworkz.arrays.things;

public class SumOfEvenAndOddEle {
	public static void main(String[] args) {
		int[] arr = { 1, 20, 30, 4, 7 };
		int sumeve = 0;
		int sumodd = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 10 == 0) {
				sumeve = sumeve + arr[i];
			} else if (arr[i] % 10 != 0) {
				sumodd = sumodd + arr[i];

			}

		}
		System.out.println("sum of even no :" + sumeve);
		System.out.println("sum of odd no :" + sumodd);
	}

}

package com.Practice;

public class NaturalSum {

	public static void main(String[] args) {
		int naturalSum = 0;
		int arraySum = 0;
		int n;
		int[] nums = { 1, 0, 4, 2 };
		n = nums.length;
		for (int num : nums) {
			arraySum = arraySum + num;

		}
		naturalSum = n * (n + 1) / 2;
		System.out.println(arraySum);
		System.out.println(naturalSum);
		int missingNumber = naturalSum - arraySum;
		System.out.println(missingNumber);
	}
}

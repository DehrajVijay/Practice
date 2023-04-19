package com.Practice;

public class bubbleSort {
	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 7, 8, 1, 3, 2, 5, 0 };
		// bubble sort comparing two adjacent elements and sort them
		// outer loop for work as a counter.
		for (int i = 0; i < arr.length - 1; i++) {
			// inner loop for the actual comparison of elements.
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// swap
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}
		printArray(arr);
	}
}

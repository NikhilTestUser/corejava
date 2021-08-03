package com.practice.test;

public class FindingMaxAndMin {

	public static void main(String[] args) {
		int max;
		int[] arr = { 40, 15, 63, 45, 2 };

		for (int i = 0; i <= arr.length; i++) {
			if (arr[i] > arr[i + 1]) {
				max = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = max;
			}
		}
		System.out.println("smallest number from the array is:" + arr[0]);

	}
}

package com.practice.test;

import java.util.Arrays;

public class FMC {

	static int getMax(int arr[], int n) {
		return Arrays.stream(arr).max().getAsInt();

	}

	static int getMin(int arr[], int n) {
		return Arrays.stream(arr).min().getAsInt();
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 40, 52, 63, 45, 2 };
		int length = arr.length;
		System.out.println(getMax(arr, length));
		System.out.println(getMin(arr, length));

	}

}

package com.practice.test;

public class DataTypes {

	public static void main(String[] args) {
		byte b = 27;// valid
		// byte b=129 invalid
		System.out.println(b);
		// short s = 32768; out of range for the short value
//		System.out.println(s);
//		int a = 52633333333333333333333; out of range for int
		int a = -2147483648;
		// out of range for int a1 = 2147483649;
		System.out.println(a);
//		System.out.println(a1);
		float f = 3.4444444f;// valid value
		// float g = 3.44444444;//invalid value
		System.out.println(f);
	}

}

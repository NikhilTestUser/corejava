package com.practice.test;

public class Method1 {

	public static void main(String[] args) {
		Method1 m = new Method1();
		m.sum(10, 10);
		m.sum(10, "nikhil");
		m.sum("nikhilkumar", 20);
	}

	public void sum(int a, int b) {
		System.out.println("the sume is:" + (a + b));

	}

	public void sum(int a, int b, int c) {
		System.out.println("The sum is :" + (a + b + c));
	}

	public void sum(int a, String name) {
		System.out.println("The sum is :" + a + name);
	}

	public void sum(String name, int a) {
		System.out.println("The full is:" + a + name);
	}

}

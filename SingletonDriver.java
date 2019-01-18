package com.practice.pattern;

public class SingletonDriver {

	public static void main(String[] args) {
		SimpleSingleton x = SimpleSingleton.getInstance();
		SimpleSingleton y = SimpleSingleton.getInstance();
		SimpleSingleton z = SimpleSingleton.getInstance();
		
		x.s = (x.s).toUpperCase();
		System.out.println("Stirng from x: " + x.s);
		System.out.println("Stirng from y: " + y.s);
		System.out.println("Stirng from z: " + z.s);
		
		z.s = (z.s).toLowerCase();
		System.out.println("Stirng from x: " + x.s);
		System.out.println("Stirng from y: " + y.s);
		System.out.println("Stirng from z: " + z.s);
	}
}

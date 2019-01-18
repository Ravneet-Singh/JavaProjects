package com.practice.pattern;

public class SimpleSingleton {
	
	private static SimpleSingleton _instance;
	public String s;
	
	private SimpleSingleton() {
		s = "Hello I am part of Simple Singleton class";
	}
	
	public static SimpleSingleton getInstance() {
		if(_instance ==null) {
			_instance = new SimpleSingleton();
		}
		return _instance;
	}

}

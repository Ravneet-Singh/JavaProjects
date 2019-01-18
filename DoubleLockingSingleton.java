package com.practice.pattern;

public class DoubleLockingSingleton {
	private static DoubleLockingSingleton _instance;
	public static DoubleLockingSingleton getInstanceDC() {
		if(_instance == null) {
			synchronized(DoubleLockingSingleton.class) {
				if(_instance == null)
					_instance = new DoubleLockingSingleton();
			}
		}
		return _instance;
	}

}

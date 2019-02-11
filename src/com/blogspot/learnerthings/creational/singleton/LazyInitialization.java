package com.blogspot.learnerthings.creational.singleton;

public class LazyInitialization {

	// Lazy Initialization JVM doesn't create object until the client calls
	// getInstance() method.
	private static LazyInitialization SINGLE_INSTANCE = null;

	private LazyInitialization() {
	}

	// global access point
	public static LazyInitialization getInstance() {
		// check if instance is already created in memory, if not it will create one
		if (SINGLE_INSTANCE == null) {
			SINGLE_INSTANCE = new LazyInitialization();
		}
		return SINGLE_INSTANCE;
	}
}

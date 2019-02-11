package com.blogspot.learnerthings.creational.singleton;

public class EagerInitialization {

	// Eager initialization when JVM loads this class creates objects, without the
	// client request
	private static final EagerInitialization SINGLE_INSTANCE = new EagerInitialization();

	// private constructor
	private EagerInitialization() {
	}

	//global access point
	public static EagerInitialization getInstance() {
		return SINGLE_INSTANCE;
	}
}

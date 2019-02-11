package com.blogspot.learnerthings.creational.singleton;

public class LazyInitializationWithMultiThread {
	private static LazyInitializationWithMultiThread SINGLE_INSTANCE = null;

	private LazyInitializationWithMultiThread() {
	}

	public static LazyInitializationWithMultiThread getInstance() {
		if (SINGLE_INSTANCE == null) {
			synchronized (LazyInitializationWithMultiThread.class) {
				SINGLE_INSTANCE = new LazyInitializationWithMultiThread();
			}
		}
		return SINGLE_INSTANCE;
	}
}

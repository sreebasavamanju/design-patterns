package com.blogspot.learnerthings.creational.singleton;

public class LazyWithDoubleCheck {

	private static LazyWithDoubleCheck SINGLE_INSTANCE = null;

	private LazyWithDoubleCheck() {
	}

	public static LazyWithDoubleCheck getInstance() {
		if (SINGLE_INSTANCE == null) {
			synchronized (LazyWithDoubleCheck.class) {
				if (SINGLE_INSTANCE == null) {
					SINGLE_INSTANCE = new LazyWithDoubleCheck();
				}
			}
		}
		return SINGLE_INSTANCE;
	}

}

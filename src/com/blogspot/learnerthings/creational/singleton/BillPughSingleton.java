package com.blogspot.learnerthings.creational.singleton;

public class BillPughSingleton {

	//private constructor
	private BillPughSingleton() {}
	
	// static inner class - inner classes are not loaded until they are
    // referenced.
	private static class SingletonHolder{
		private static BillPughSingleton singleton=new BillPughSingleton();
	}
	//global access point
	public static BillPughSingleton getInstance() {
		return SingletonHolder.singleton;
	}
}

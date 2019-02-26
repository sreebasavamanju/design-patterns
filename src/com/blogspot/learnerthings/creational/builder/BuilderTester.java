package com.blogspot.learnerthings.creational.builder;

public class BuilderTester {
	public static void main(String[] args) {
		Person personObject = Person.builder()
									.name("John")
									.age(40)
									.city("LA")
									.emailId("something@gmail.com")
									.build();
		System.out.println(personObject.toString());
	}
}

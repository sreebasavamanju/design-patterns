package com.blogspot.learnerthings.creational.builder;

public class Person {

	private String name;
	private int age;
	private String city;
	private String emailId;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}

	public String getEmailId() {
		return emailId;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", city=" + city + ", emailId=" + emailId + "]";
	}

	public static PersonBuilder builder() {
		return new Person.PersonBuilder();
	}

	//Static class to create builder object
	public static class PersonBuilder {
		private Person person = new Person();

		private PersonBuilder() {
		}

		public PersonBuilder name(String name) {
			person.name = name;
			return this;
		}

		public PersonBuilder city(String city) {
			person.city = city;
			return this;
		}

		public PersonBuilder emailId(String emailId) {
			person.emailId = emailId;
			return this;
		}

		public PersonBuilder age(int age) {
			person.age = age;
			return this;
		}
		
		public Person build() {
			return person;
		}
	}
}

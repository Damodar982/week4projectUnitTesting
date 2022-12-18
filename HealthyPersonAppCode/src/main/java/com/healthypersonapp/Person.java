package com.healthypersonapp;

public class Person {
	
	private double height;
	private double weight;
	private int age;
		
	public Person(double height, double weight) {
		super();
		this.height = height;
		this.weight = weight;
	}
	
	public Person(double height, double weight, int age) {
		super();
		this.height = height;
		this.weight = weight;
		this.age = age;
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

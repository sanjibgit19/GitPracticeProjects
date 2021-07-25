package com.sanjib.test;

public class Student {
	
	private String stuName;

	public Student(String name){
		this.stuName =name;
	}

	@Override
	public String toString() {
		return "Student [stuName=" + stuName + "]";
	}
	 
}

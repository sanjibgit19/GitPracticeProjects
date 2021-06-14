package com.sanjib.test;

public class StudentNoFoundException extends RuntimeException {
	
	public StudentNoFoundException() {
		
	}
	
	public StudentNoFoundException(String msg) {
		super(msg);
	}//

}

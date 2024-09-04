package com.evergent.corejava.exceptionhandling;
//using runtime exception for unchecked exception
class InvalidScoreException extends RuntimeException{
	public InvalidScoreException(String message) {
		super(message);
	}
}
	
public class UserdefinedUncheckedExceptionDemo1 {
	public static void validDataScore(int score) {
		if(score<0||score>100) {
			throw new InvalidScoreException("Yours is not valid score");
		}
		else {
			System.out.println("Yes ur is valid");
		}	
	}
	public static void main(String[] args) {
		try {
			validDataScore(110);
		}
		catch(InvalidScoreException e) {
			System.out.println("caught the exception:"+e.getMessage());
			System.out.println(e);
		}
		}
	}



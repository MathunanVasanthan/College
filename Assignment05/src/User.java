//Importing Scanner class

import java.util.Scanner;

//In this class we are going to create a methods which will include scanner class objects
public class User {
	
	private Scanner keyboard = new Scanner(System.in);
	
	//method for input integer
	public int inputInteger() {
		int value = keyboard.nextInt();
		keyboard.nextLine();
		return value;
	}
	
	//method overloaded with message for input integer
	public int inputInteger(String message) {
		System.out.println(message);
		int value = inputInteger();
		return value;
	}
	
	//method for input Double
	public double inputDouble() {
		double value = keyboard.nextDouble();
		keyboard.nextLine();
		return value;	
	}
	
	//method overloaded with message for input Double
	public double inputDouble(String message) {
		System.out.println(message);
		double value = inputDouble();
		return value;
	}
	//method for input String
	public String inputString() {
		String value = keyboard.nextLine();
		//keyboard.nextLine();
		return value;	
	}

	//method overloaded with message for input String
	public String inputString(String message) {
		System.out.println(message);
		String value = inputString();
		return value;
	}
}
/*
 * Student Name : Mathunan Vasanthan
 * Lab Professor : Fedor Ilitchev
 * Due Date : July 23, 2022
 * Modified : June 21, 2022
 * Description : this program will find good bag or bad bag
 */
import java.util.Scanner;

//In this class we made some scanner class method
public class User {

	private Scanner keyboard = new Scanner(System.in);

	//we can use this method instead of nextInt() method
	public int inputInteger() {
		int value = keyboard.nextInt();
		keyboard.nextLine();
		return value;
	}

	//we can use this method instead of nextInt() method
	public int inputInteger(String message) {
		System.out.println(message);
		int value = inputInteger();
		return value;
	}

	//we can use this method instead of nextDouble() method
	public double inputDouble() {
		double value = keyboard.nextDouble();
		keyboard.nextLine();
		return value;	
	}

	//we can use this method instead of nextDouble() method
	public double inputDouble(String message) {
		System.out.println(message);
		double value = inputDouble();
		return value;
	}
	//we can use this method instead of nextLine() method
	public String inputString() {
		String value = keyboard.nextLine();
		//keyboard.nextLine();
		return value;	
	}

	//we can use this method instead of nextLine() method
	public String inputString(String message) {
		System.out.println(message);
		String value = inputString();
		return value;
	}
}
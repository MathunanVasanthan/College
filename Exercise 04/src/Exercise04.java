/*
 * Student Name : Mathunan Vasanthan
 * Lab Professor : Fedor Ilitchev
 * Due Date : July 23, 2022
 * Modified : June 21, 2022
 * Description : this program will calculate the price of cabbage
 */

import java.util.Scanner;

/*
 * Exercise 04 Class
 */
public class Exercise04 {

	/*
	 * Main method
	 */
	public static void main(String[] args) {
		// create constants for the menu
		int OUTPUT_VALIDATION_REPORT = 1;
		int OUTPUT_CENTIMETERS = 2;
		int OUTPUT_MILLIMETERS = 3;
		int OUTPUT_REPORT = 4;

		Scanner keyboard = new Scanner(System.in);
		MeterStick stick = new MeterStick();
		double userLength;
		int option;
		String output;

		System.out.println("Meter stick checker program:");
		System.out.print("Enter measured length in meters: ");
		userLength = keyboard.nextDouble();
		if(userLength>=0) {
			keyboard.nextLine();
			stick.setLength(userLength);

			System.out.println("Please select from one of the following:");
			System.out.println(OUTPUT_VALIDATION_REPORT+":"+"to validate meter stick");
			System.out.println(OUTPUT_CENTIMETERS+":"+"to show meter stick length in centimeter");
			System.out.println(OUTPUT_MILLIMETERS+":"+"to show meters tick length in millimeter");
			System.out.println(OUTPUT_REPORT+":"+"to show meter stick report");
			option = keyboard.nextInt();

			if (option ==1) {
				output=stick.verify();
			}
			else if(option==2) {
				output="Centimeters "+ stick.toCentimeters();
			}
			else if (option==3) {
				output="Millmeters "+ stick.toMillimeters();
			}
			else if(option==4) {
				output=stick.toString();
			}
			else {
				output="Invalid menu option selected";
			}

			System.out.println(output);
		}
		else {
			System.out.println("Invaild enter ");
		}

		System.out.println("Program by Mathunan Vasanthan"); // replace with your name
	}
}

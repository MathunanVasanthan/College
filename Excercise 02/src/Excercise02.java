/*
 * Student Name : Mathunan Vasanthan
 * Lab Professor : Fedor Ilitchev
 * Due Date : June 10, 2022
 * Modified : June 03, 2022
 * Description : this program will calculate the price of cabbage
 */

//Class that launches the program, contains method main.

import java.util.Scanner;
public class Excercise02 {

	public static void main(String[] args) {
// Create the new object and instantiate null parameters
		Cabbage cabbage = new Cabbage(0, 0, 0);
		
// Create a new Scanner class object
		Scanner file = new Scanner (System.in);
		
// get the weight from the user
		System.out.print("Enter Cabbage Weight: ");
		double weight = file.nextDouble();
		
// get cost per kilogram from the user
		System.out.print("Enter Cost per Kilogram: ");
		double cost = file.nextDouble();
		
// calling setCostPerKilogram() method and instantiate cost as a parameter
		cabbage.setCostPerKilogram(cost);
		
//calling setWeight() method and instantiate weight as a parameter
		cabbage.setWeight(weight);
		
		
// calling calculate Price() method to calculate the price
		cabbage.calculatePrice();
		
		
// Create a new object and instantiate give parameters on Exercise 02 
		Cabbage anothercabbage = new Cabbage(3.5,2.5, 0);
		
		
		anothercabbage.getCostPerKilogram();
		anothercabbage.getWeight() ;
		
		anothercabbage.calculatePrice();
		
		Cabbage anothercabbage1 = new Cabbage(3.5,2.0, 0);
		
		anothercabbage1.getCostPerKilogram();
		anothercabbage1.getWeight() ;
		
		anothercabbage1.calculatePrice();
		
		
		System.out.println(cabbage.printReport());
		System.out.println("  ");
		System.out.println("Testing overloaded constuctor with anotherCabbage");
		System.out.println("  ");
		System.out.println(anothercabbage.printReport());
		System.out.println(anothercabbage1.printReport());
		System.out.println("  ");
		System.out.println("program implemented by Mathunan Vasanthan");
		
		

	}

}

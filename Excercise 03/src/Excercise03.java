/*
 * Student Name : Mathunan Vasanthan
 * Lab Professor : Fedor Ilitchev
 * Due Date : June 24, 2022
 * Modified : June 21, 2022
 * Description : this program will calculate Right angle triangle
 */
import java.util.Scanner;
public class Excercise03 {
	public static void main(String[] args) {
		// Create the new object 
		RightAngleTriangle triangle = new RightAngleTriangle();
		// Create a new Scanner class object
		Scanner input = new Scanner(System.in);
		// get the adiacent from the user
		System.out.print("Enter the Adjacent :");		
		double adjacent = input.nextDouble();
		// get cost opposite from the user
		System.out.print("Enter the Opposite :");
		double opposite = input.nextDouble();
		
		// calling setAdjacent() method and instantiate adjacent as a parameter
		triangle.setAdjacent(adjacent);
		// calling setOpposite() method and instantiate opposite as a parameter
		triangle.setOpposite(opposite);
		// calling calculateHypotenuse() method to calculate the hypotenuse
		triangle.calculateHypotenuse();
		// calling calculatePerimeter() method to calculate the perimeter
		triangle.calculatePerimeter();
		// calling calculateArea() method to calculate the area
		triangle.calculateArea();
		// calling printReport() method to print statement
		triangle.printReport();
		
		

	}

}

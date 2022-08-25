/*
 * Student Name : Mathunan Vasanthan
 * Lab Professor : Fedor Ilitchev
 * Due Date : June 24, 2022
 * Modified : June 21, 2022
 * Description : this program will calculate Right angle Triangle
 */

// Create class RightAngleTriangle with adjacen adn opposite.
public class RightAngleTriangle {
	
	private double adjacent;
	private double opposite;
	
	
	// Empty constructor
	public RightAngleTriangle() {
		
	}
	// Overloaded constructor
	public RightAngleTriangle(double adjacent, double opposite) {
		
	}
	//accessor for Adjacent
	public double getAdjacent() {
		return adjacent;
	}
	// mutator for Adjacent
	public void setAdjacent(double adjacent) {
		this.adjacent = adjacent;
	}
	//accessor for Opposite
	public double getOpposite() {
		return opposite;
	}
	// mutator for Opposite
	public void setOpposite(double opposite) {
		this.opposite = opposite;		
	}
	//calculateHypotenuse() method that calcultae hypotenuse	
	public double calculateHypotenuse() {
		double hypotenuse;		
		hypotenuse=Math.pow(adjacent,2)+Math.pow(opposite, 2);
		return hypotenuse=Math.pow(hypotenuse,0.5);
	}
	//calculatePerimeter() method that calcultae perimeter
	public double calculatePerimeter() {
		double perimeter;
		return perimeter = calculateHypotenuse()+opposite+adjacent;				
	}
	//calculateArea() method that calcultae area
	public double calculateArea() {
		double area;
		return area=0.5*adjacent*opposite;		
	}
	//printReport()() method that print the statements
	public void printReport() {
		System.out.printf("Adjacent :"+"%.4f %n",adjacent);
		System.out.printf("Opposite :"+"%.4f %n",opposite);
		System.out.printf("Hypotenuse :"+"%.4f %n",calculateHypotenuse());
		System.out.printf("Perimeter :"+"%.4f %n",calculatePerimeter());
		System.out.printf("Area :"+"%.4f %n",calculateArea());
		System.out.printf("%s","Program by Mathunan Vasanthan.");
		
		
	}
	
}

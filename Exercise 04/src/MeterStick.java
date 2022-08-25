/*
 * Student Name : Mathunan Vasanthan
 * Lab Professor : Fedor Ilitchev
 * Due Date : July 23, 2022
 * Modified : June 21, 2022
 * Description : this program will calculate the price of cabbage
 */

/*
 * Class MeterStick
 */
public class MeterStick {
	public static final double EXPECTED_LENGTH = 1.0; // meters
	public static final double EPSILON = 0.0001;
	private double length;
	
	/*
	 * Empty Constructor
	 */
	public MeterStick() {
		this(EXPECTED_LENGTH);
	}
	
	/*
	 * Overloading Constructor
	 */
	public MeterStick(double length) {
		this.length = length;
	}
	
	/*
	 * Accessors for length
	 */
	public double getLength() {
		return length;
	}
	
	/*
	 *Mutators fo length
	 */
	public void setLength(double length) {
		this.length = length;
	}
	
	/*
	 * toCentimeter method for change the value to milimeter
	 */
	public double toCentimeters() {
		double centimeters;
		centimeters = length * 100;
		return centimeters;
	}
	
	/*
	 * toMillimeters method for change the value to millimeter
	 */
	public double toMillimeters() {
		double millimeters;
		millimeters = length * 1000;
		return millimeters;
	}
	
	/*
	 * toString method for describe the meter stick length
	 */
	public String toString() {
		String data;
		data ="The Meter stick length is :"+length+"m";
		return data;
	}
	
	/*
	 * verify method for verifying the epsilon 
	 */
	public String verify() {
		String report;
		double difference;
		
		difference =Math.abs(EXPECTED_LENGTH-length);
		if (difference <= EPSILON) 
			report=String.format("A meterstick is within the tolerance of "+ "%.5f",EPSILON); 
		else 
			report=String.format("A meterstick is not within the tolerance of "+ "%.5f",EPSILON);
		return report;
	}
}

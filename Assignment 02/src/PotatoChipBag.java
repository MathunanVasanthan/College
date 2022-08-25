/*
 * Student Name : Mathunan Vasanthan
 * Lab Professor : Fedor Ilitchev
 * Due Date : July 23, 2022
 * Modified : June 21, 2022
 * Description : this program will find good bag or bad bag
 */
public class PotatoChipBag {
	private int size; // Regular or Large (use constants below)
	private double weight; // oz
	public static final int REGULAR = 1;
	private static final double REGULAR_WEIGHT = 9.25; // oz
	public static final int LARGE = 2;
	private static final double LARGE_WEIGHT = 15.75; // oz
	public static final double EPSILON = 0.01; 
	// TODO: declare an EPSILON constant with value 0.01

	//Empty Constructor
	public PotatoChipBag() {
		this(REGULAR, REGULAR_WEIGHT);
	}

	//Overloading Constructor
	public PotatoChipBag(int size, double weight) {
		this.size = size;
		this.weight = weight;
	}

	//Accessors for size
	public int getSize() {
		return size;
	}

	//Mutators fo size
	public void setSize(int size) {
		this.size = size;
	}

	//Accessors for weight
	public double getWeight() {
		return weight;
	}

	//Mutators fo weight
	public void setWeight(double weight) {
		this.weight = weight;
	}

	//use this method find the bag is good bag or bad bag
	public boolean isBagCorrectWeight() {

		boolean result = true ;
		double difference;

		if(size == 1) {
			difference = Math.abs(REGULAR_WEIGHT-weight);
			if(difference<=EPSILON){
				result = true;
			}
			else {
				result = false;
			}			
		}
		else if (size == 2) {
			difference =Math.abs(LARGE_WEIGHT - weight);
			if(difference<=EPSILON) {
				result= true;
			}
			else {      
				result = false;
			}
		}
		return result;
	}

}
/*
 * Student Name : Mathunan Vasanthan
 * Lab Professor : Fedor Ilitchev
 * Due Date : June 10, 2022
 * Modified : June 03, 2022
 * Description : this program will calculate the price of cabbage
 */

// Create class Cabbage with, weight,costPerKilogram, and price.
public class Cabbage {
	
	private double weight;
	private double costPerKilogram;
	private double price;
	
	// Overloaded constructor, sets weight, costPerKilogram and, price based on parameter list
	public Cabbage(double weight, double costPerKilogram, double price) {
		this.weight=weight;
		this.costPerKilogram=costPerKilogram;
		this.price=price;
	}
//accessor for weight
	public double getWeight() {
		return weight;
	}
// mutator for weight
	public void setWeight(double weight) {
		this.weight = weight;
	}
//accessor for costPerKilogram
	public double getCostPerKilogram() {
		return costPerKilogram;
	}
// mutator for costPerKilogram
	public void setCostPerKilogram(double costPerKilogram) {
		this.costPerKilogram = costPerKilogram;
	}
//accessor for price
	public double getPrice() {
		return price;
	}
// mutator for price
	public void setPrice(double price) {
		this.price = price;
	}
//calculatePrice() method that calcultae the price of cabbage
	public double calculatePrice() {
		return this.price=this.costPerKilogram*this.weight;
	}
//printReport() method that print the price od cabbage
	public String printReport() {
		return "The weight of the cabage is "+this.getWeight()+ "kg "+"\n  Cost per kilogram is "+"$"+this.getCostPerKilogram()+"\n The final price is "+"$"+this.price;
		
	}
	
}

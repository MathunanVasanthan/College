/*
 * Student Name : Mathunan Vasanthan
 * Lab Professor : Fedor Ilitchev
 * Due Date : June 17, 2022
 * Modified : June 15, 2022
 * Description : this program will calculate how many tables can varnished by one can
 */
public class CircularTableTop {
	
	public double area;
	public double diameter;
	public double count;
	public int numberoOfCoats;
	
	
	public double getRadius() {
		return area;
	}
	public void setRadius(double radius) {
		this.area = radius;
	}
	public double getDiameter() {
		return diameter;
	}
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	public double getCount() {
		return count;
	}
	public void setCount(double count) {
		this.count = count;
	}
	public int getNumberoOfCoats() {
		return numberoOfCoats;
	}
	public void setNumberoOfCoats(int numberoOfCoats) {
		this.numberoOfCoats = numberoOfCoats;
	}
	
	public void calculation() {
		
		area = (Math.PI)*Math.pow((diameter/2),2);
				
		count=(double) (46800/(area*numberoOfCoats));
		
	}

}

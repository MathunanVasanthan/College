/*
 * Student Name : Mathunan Vasanthan
 * Lab Professor : Fedor Ilitchev
 * Due Date : June 17, 2022
 * Modified : June 15, 2022
 * Description : this program will calculate the price of cabbage
 */
import java.util.Scanner;
public class Assignment01 {

	public static void main(String[] args) {
		
	   CircularTableTop table = new CircularTableTop();
	    
	    Scanner input = new Scanner(System.in);
	    
		
	    System.out.println("Please enter the Diameter");
	    double diameter = input.nextDouble();
	    
	    System.out.println("Please enter the number of coats");
	    int noc = input.nextInt();
	    
	    
	    
		table.setDiameter(diameter);
		table.setNumberoOfCoats(noc);
		table.calculation();
		
		System.out.println("Table's Daimeter :"+diameter);
		System.out.println("Tabel Area is :"+ table.area);
		System.out.println("Tabel Count is :"+ table.count);
		System.out.println("Program by Mathunan Vasanthan");

	}

}

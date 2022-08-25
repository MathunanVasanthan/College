import java.util.Scanner;
public class WoodWorker {
	
	private Scanner input = new Scanner(System.in);
	
	public double inputFloat() {
		
		double value = input.nextDouble();
		input.nextLine();
		return value;
	}
	
	public int inputNumber() {
		
		int number = input.nextInt();
		input.nextLine();
		return number;
	}
	
	public void message(String message) {
		System.out.println(message);
	}
	
		

}

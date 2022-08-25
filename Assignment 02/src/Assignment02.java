/*
 * Student Name : Mathunan Vasanthan
 * Lab Professor : Fedor Ilitchev
 * Due Date : July 23, 2022
 * Modified : June 21, 2022
 * Description : this program will find good bag or bad bag
 */
public class Assignment02 {

	//Main method
	public static void main(String[] args) {
		PotatoChipBag bag = new PotatoChipBag();
		User user = new User();
		int REGULAR = 1;
		int LARGE = 2;
		int size;
		String option;
		double weight;
		//set bag counters to 0 
		int totalbag = 0;
		int badbag=0;
		int goodbag=0;		
		
		do{
			System.out.println("Please select from one of the following:");
			System.out.println("1 FOR REGULAR :");
			System.out.println("2 FOR LARGE :");
			size = user.inputInteger();
			if(size==1||size==2) {			
				System.out.println("Enter the weight :");
				weight =  user.inputDouble();
			
				if(weight>0) {
					bag.getSize();
					bag.setSize(size);
					bag.getWeight();
					bag.setWeight(weight);
					//do my counting 
					boolean result = bag.isBagCorrectWeight();  
					if (result== true) {
						goodbag++;
						totalbag++;
					}else {
						badbag++;
						totalbag++;
					}
					System.out.println("Good bag :"+ goodbag);
					System.out.println("Bad bag :"+ badbag);
					System.out.println("Total bag :"+ totalbag);				
				}else {
					System.err.println("Invalid value");
				}
			}else {
				System.err.println("Invalid bag size entered ");
			}
			System.out.println("Do you want to continue :(Yes/No) ");
			option = user.inputString();
		}while(option.equalsIgnoreCase("yes"));
		
		
		System.out.println("Program will now shutdown");
		System.out.println(" ");
		System.out.println("Program implemented by Mathunan Vasanthan");         
	}
}
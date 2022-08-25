/*
 * Author: Stanley Pieda
 * Date: March 16, 2022
 * Modified by: **** Mathunan Vasanthan ***
 * Modified Date: **** August 05,2022 ****
 * Description: Main class of this 
 * Starter Code Note: Use the pseudocode and complete the main method
 */

/*
 * This class only contains method main, to drive the application.
 */
public class Exercise05 {
	
	/*
	 * In main method we use do...while lopp to run the progam and rest() method and run() method of HighLowGame are used
	 */
	public static void main(String[] args) {
		User user = new User();
		HighLowGame game = new HighLowGame();
		String CONTINUE_GAME = "Y";
		String EXIT_GAME = "N";
		String shouldContinue = EXIT_GAME;
		
		do {
			if(shouldContinue.equalsIgnoreCase(CONTINUE_GAME)) {
				game.reset();
			}
			game.run();
			shouldContinue = user.inputString("Would you like to play again? (Y/N)");
			
		}while(shouldContinue.equalsIgnoreCase(CONTINUE_GAME));
		System.out.println("Program by Mathunan Vasanthan");
	}
}

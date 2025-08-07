package secret_number;

import java.util.Random;
import java.util.Scanner;

public class Console_secret_number {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Random secretRandom = new Random();
		int secretNumber = secretRandom.nextInt(1, 100);
		
		int tries = 0;
		boolean endProgram = false;
		
		System.out.println("Welcome to the Secret Number Game!");
		System.out.println("Can you guess the secret number chosen by the computer? The number is between 1 and 100.");
		System.out.println("Well then, please enter your guess. Remember: if you want to quit, just enter 0.");
	
			while(endProgram !=true) {
				System.out.println("Enter a number");
				int numberUser = input.nextInt();
				if(numberUser<secretNumber && numberUser!=0) {
					System.out.println("My number is higher");
					trieds ++;
				}
				else if (numberUser>secretNumber && numberUser!=0) {
					System.out.println("My number is lower");
					trieds ++;
				}
				else if(numberUser==0) {
			        System.out.println("You gave up!");
			        System.out.println("Total attempts: " + tries);
					endProgram = true;
				}
				else {
					System.out.println("You win!!");
					System.out.println("Total attempts: " + tries);
					endProgram =true;
				}
					
			}
			
	}
}

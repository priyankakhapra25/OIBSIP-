package random.no;

import java.util.Random;
import java.util.Scanner;

public class randomNo {
	
	public static void main(String[] args) {
	
		int n;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Welcome to Guess Number Game");
		System.out.println("You Will Be Asked To Guess A Number To Win The Game");
		System.out.println("You Have Maximum 5 Attempts Limit");
		
		Random random= new Random();
		int number= random.nextInt(100);
		
		System.out.println(number);
		
		int attempts=0;
		while (attempts<5) {
			
		System.out.println("Enter a guess number between 1 to 100");
		n=scanner.nextInt();
		if (n>number) {
			System.out.println("Your Guess Number is Greater");
		}
		else if (n<number) {
			System.out.println("Your Guess Number is Smaller");
		}
		else {
			System.out.println("OOhhOO!, Your Number is Correct. You Win the Game");
			break;
		}
		
		attempts++;
		}		
	}
}

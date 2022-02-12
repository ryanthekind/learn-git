package com.ryanthekind;

import java.util.Scanner;

public class GitPractice {

	/*
	 * This class was created to practice with 
	 * using git on the command line
	 */
	public static void main(String[] args) {

		// System.out.println("I am making changes to my code!");
		
		/*
		for(int count = 0; count <= 5; count++) {
			System.out.println(count);
		}
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Can you guess my favorite number between 1 - 10?");
		String input = scanner.nextLine();
		
		int guess = Integer.parseInt(input);
		
		
		if(guess < 0 || guess > 10) {
			System.out.println("sorry invalid number please try again.");
		}
		else if(guess == 5) {
			System.out.println("You guessed my favorite number 5!");
		}
		else if(guess < 5) {
			System.out.println("ah too low");
		}
		else {
			System.out.println("sorry, too high.");
		}
		
		
	}

}

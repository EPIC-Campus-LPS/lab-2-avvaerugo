package lab2;

import java.util.Scanner;

public class guesstheroot {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Guess the Square Root\n");
		int score = 0;
		for (int i = 0; i < 3; i++) {
			int num = (int) (Math.random() * 100) + 1;
			double root = ((double) ((int) (Math.sqrt((double) num) * 10)) / 10);
			System.out.println("What is the square root of " + num + "?");
			double guess = input.nextDouble();
			if (guess == root) {
				System.out.println("Correct");
				score++;
			} else {
				System.out.println("Wrong. The correct answer is " + root);
			}
		}
		System.out.println("You got " + score + "/3");
	}
}

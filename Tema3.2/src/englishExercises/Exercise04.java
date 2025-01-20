package englishExercises;

import java.util.Random;
import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		
		// We create the random generator
		Random rand = new Random();
		
		// We create the scanner
		Scanner sc = new Scanner(System.in);
		
		// String variable where we store the user's answer
		String answer = "";
		
		// String variable where we store the hidden word
		String word = "";
		
		// String variable where we store the clue to show to the user
		String clue = "";
		
		// String variable where we store the letter
		String letter = "";
		
		// Int variable where we store the number of attempts
		int attempts = 6;
		
		// String array variable where we store the possible words
		String[] words = {"phone", "tiger", "human", "pizza", "torso", "hater"};
		
		// We select a random word from the array
		word = words[rand.nextInt(0, words.length)];
		
		// We ask for the answer, store it in "answer" and reduce the amount of attempts
		System.out.println("Introduce your answer");
		answer = sc.nextLine();
		attempts--;
		
		// We create a loop to check if we have attempts left or if the user has guessed the word
		while (attempts > 0 && !answer.equals(word)) {
			
			// We show the user their number of attempts left
			System.out.println("You have " + attempts + " attempts left");
			
			// We create a for loop to check every letter of the answer
			for(int i = 0; i < answer.length(); i++) {
				
				// We store the character in the variable "letter"
				letter += answer.charAt(i);
				
				// If the characters are the same we show the character
				if (word.charAt(i) == answer.charAt(i)) {
					
					clue += answer.charAt(i) + " ";
					
				// Else if the word contains that letter we show an asterisk
				} else if (word.contains(letter)) {
					
					clue += "* ";
					
				// Else we show an underscore
				} else {
					
					clue += "_ ";
					
				}
				
				// We clear "letter"
				letter = "";
				
			}
			
			// We show the clue
			System.out.println("The clue: " + clue);
			
			// And ask again their answer doing the same as before
			System.out.println("Introduce your answer");
			answer = sc.nextLine();
			attempts--;
		
			clue = "";
			
		}
		
		// If the user has no attempts left and the answer is not equal to the word we show that he lost, because he ran out of attempts
		if (attempts == 0 && !answer.equals(word)) {
			
			System.out.println("You lost! You have ran out of attempts");
			
		// Else the user won, so we show him the word
		} else {
			
			System.out.println("You won! The word was: " + word + ", you did it in your attempt number " + (6 - attempts));
			
		}
		
		// We close the scanner
		sc.close();

	}

}

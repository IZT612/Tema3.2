package englishExercises;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {

		// We create the scanner
		Scanner sc = new Scanner(System.in);
		
		boolean repeat = false;
		
		// We create the int variable "shift" to know to what character we should skip to
		int shift;
		
		int[] nonSpecialPositions;

		// We create a String variable "message" to store the message that the user
		// introduces
		String message;

		// We create a String variable "encodedMessage" to store the encoded message
		String encodedMessage = "";

		// We ask for the message and store it in "message"
		System.out.println("Introduce the message that you want to encode");
		message = sc.nextLine().toUpperCase();
		
		System.out.println("And how many characters do you want to skip to?");
		shift = sc.nextInt();
		
		nonSpecialPositions = new int[message.length()];
		
		for (int i = 0; i < message.length(); i++) {
			
			if ((message.charAt(i) >= '0' && message.charAt(i) <= '9') || (message.charAt(i) >= 'A' && message.charAt(i) <= 'Z')) {
				
				nonSpecialPositions[i] = 1;
				
			}
			
		}

		do {
		
		// We check every character of the phrase
		for (int i = 0; i < message.length(); i++) {

			// If the character is a 'Z'
			if (message.charAt(i) == 'Z') {

				// We Change it to 'A', and then change it to the character plus the shift - 1
				encodedMessage += (char) ('A' + shift - 1);

				// If its one of the special characters
			} else if ((message.charAt(i) >= ' ' && message.charAt(i) <= '/')
					|| (message.charAt(i) >= ':' && message.charAt(i) <= '@')
					|| (message.charAt(i) >= '[' && message.charAt(i) <= '■')) {

				// We leave it like that
				encodedMessage += message.charAt(i);

				// If its the number 9
			} else if ((message.charAt(i) == '9')) {

				// We change it to 0
				encodedMessage += (0 + shift - 1);

				// If its none of those cases
			} else {

				// We go to the next character
				encodedMessage += (char) (message.charAt(i) + shift);

			}

		}
		
		for (int i = 0; i < message.length() && !repeat; i++) {
			
			if (nonSpecialPositions[i] == 1 && !((encodedMessage.charAt(i) >= '0' && encodedMessage.charAt(i) <= '9') || (encodedMessage.charAt(i) >= 'A' && encodedMessage.charAt(i) <= 'Z') )) {
				
				repeat = true;
				
			}
			
		}
		
		} while (repeat);

		// We show the encoded message
		System.out.println("The encoded message is: ");
		System.out.println(encodedMessage);

		// We close the scanner
		sc.close();

	}
}

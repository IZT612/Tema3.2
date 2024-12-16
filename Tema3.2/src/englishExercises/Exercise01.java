package englishExercises;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		// We create the scanner
		Scanner sc = new Scanner(System.in);
		
		// We create a String variable "message" to store the message that the user introduces
		String message;
		
		// We create a String variable "encodedMessage" to store the encoded message
		String encodedMessage = "";
		
		// We ask for the message and store it in "message"
		System.out.println("Introduce the message that you want to encode");
		message = sc.nextLine().toUpperCase();
		
		// We check every character of the phrase
		for (int i = 0; i < message.length(); i++) {
			
			// If the character is a 'Z'
			if (message.charAt(i) == 'Z') {
				
				// We add an 'A'
				encodedMessage += "A";
				
				// If its one of the special characters
			} else if ((message.charAt(i) >= 32 && message.charAt(i) <= 47) || (message.charAt(i) >= 58 && message.charAt(i) <= 64) || (message.charAt(i) >= 91 && message.charAt(i) <= 255)) {
				
				// We leave it like that
				encodedMessage += message.charAt(i);
			
				// If its the number 9
			}else if ((message.charAt(i) == '9')) {
				
				// We change it to 0
				encodedMessage += "0";
				
				// If its none of those cases
			} else {
				
				// We go to the next character
				encodedMessage += (char) (message.charAt(i) + 1);
				
			}
			
			
		}
		
		// We show the encoded message
		System.out.println("The encoded message is: ");
		System.out.println(encodedMessage);
		
		// We close the scanner
		sc.close();

	}

}

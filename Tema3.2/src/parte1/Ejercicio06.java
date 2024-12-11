package parte1;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		// Creamos la variable String "frase" para guardar la frase introducida por el
		// usuario
		String frase;

		// Creamos la variable boolean "palindroma" para guardar si la frase es palindroma o no
		boolean palindroma;

		// Pedimos la frase y la guardamos en "frase"
		System.out.println("Introduzca la frase a comprobar");
		frase = sc.nextLine();

		// Guardamos en "palindroma" el boolean devuelto por la función "palindromaVerificador"
		// dada "frase"
		palindroma = palindromaVerificador(frase);
		
		// Si es palindroma, le indicamos al usuario que la fase es palindroma
		if (palindroma) {
			System.out.println("La frase es palíndroma");
			
		// Si no, le mostramos al usuario que la frase no es palindroma
		} else {
			System.out.println("La frase NO es palíndroma");
			
		}
		
		// Cerramos el scanner
		sc.close();

	}

	// Creamos la función "palindromaVerificador" que recibe una variable String "frase" y
	// devuelve un boolean
	static boolean palindromaVerificador(String frase) {
		
		// Creamos la variable boolean "palindroma" para guardar si la frase es palindroma o no
		boolean palindroma;

		// Creamos la variable String "fraseInvertida" para guardar la frase invertida
		String fraseInvertida = "";

		// Creamos un bucle for que recorre "frase
		for (int i = 0; i < frase.length(); i++) {

			// Guardamos en "fraseInvertida" el caracter contrario al correspondiente en
			// "frase"
			fraseInvertida += frase.charAt((frase.length() - 1) - i);

		}
		
		// Si la frase sin espacios es igual a la frase invertida sin espacios es palíndroma, ponemos "palindroma" como true
		if (frase.toLowerCase().replace(" ", "").equals(fraseInvertida.toLowerCase().replace(" ", ""))) {
			palindroma = true;
			
		// Si no, ponemos "palindroma" como false
		} else {
			
			palindroma = false;
			
		}

		// Devolvemos "palindroma"
		return palindroma;
	}
	
}

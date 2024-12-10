package parte1;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos 2 variables String "frase1" y "frase2" donde guardaremos las frases guardadas por el usuario
		String frase1;
		String frase2;
		
		// Pedimos ambas frases y las guardamos en "frase1" y "frase2" respectivamente
		System.out.println("Introduzca la primera frase");
		frase1 = sc.nextLine();
		System.out.println("Ahora introduzca la segunda");
		frase2 = sc.nextLine();
		
		// Si la longitud de "frase1" es menor a la de "frase2", "frase1" es más corta
		if (frase1.length() < frase2.length()) {
			
			// Se lo indicamos al usuario
			System.out.println("La frase más corta es la primera");
			
		// Si no, vemos si es al revés
		} else if (frase2.length() < frase1.length()) {
			
			// Se lo indicamos al usuario
			System.out.println("La frase más corta es la segunda");
			
		// Si no, deben ser iguales
		} else {
			
			// Se lo indicamos al usuario
			System.out.println("Ambas frases son igual de cortas");
			
		}
		
		// Cerramos el scanner
		sc.close();

	}

}

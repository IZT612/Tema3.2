package parte1;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable String "frase" para guardar la frase introducida por el usuario
		String frase;
		
		// Creamos la variable String "fraseInvertida" para guardar la frase invertida
		String fraseInvertida;
		
		// Pedimos la frase y la guardamos en "frase"
		System.out.println("Introduzca la frase a invertir");
		frase = sc.nextLine();
		
		// Guardamos en "fraseInvertida" el String devuelto por la función "inversor" dada "frase"
		fraseInvertida = inversor(frase);
		
		// Mostramos la frase invertida
		System.out.println("La frase invertida es:");
		System.out.println(fraseInvertida);
		
		// Cerramos el scanner
		sc.close();

	}
	
	// Creamos la función "inversor" que recibe una variable String "frase" y devuelve otro String
	static String inversor(String frase) {
		
		// Creamos la variable String "fraseInvertida" para guardar la frase invertida
		String fraseInvertida = "";
		
		// Creamos un bucle for que recorre "frase
		for (int i = 0; i < frase.length(); i++) {
			
			// Guardamos en "fraseInvertida" el caracter contrario al correspondiente en "frase"
			fraseInvertida += frase.charAt((frase.length() - 1) - i);
			
		}
		
		// Devolvemos "fraseInvertida"
		return fraseInvertida;
	}

}

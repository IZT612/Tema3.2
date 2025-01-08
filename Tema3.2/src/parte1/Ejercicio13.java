package parte1;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Variable String "palabra1" donde guardaremos la primera palabra
		String palabra1 = "";

		// Variable String "palabra2" donde guardaremos la segunda palabra
		String palabra2 = "";

		// Variable booleana "anagrama" donde guardaremos si son anagramas una de otra
		boolean anagrama = true;
		
		// Variable booleana "charEncontrado" donde guardaremos si el caracter de una palabra se ha encontrado en la otra
		boolean charEncontrado;

		// Pedimos la primera palabra y la guardamos en "palabra1"
		System.out.println("Introduzca la primera palabra");
		palabra1 = sc.nextLine();

		// Pedimos la segunda palabra y la guardamos en "palabra2"
		System.out.println("Ahora introduzca la segunda");
		palabra2 = sc.nextLine();

		// Si la longitud de las palabras no son iguales
		if (palabra1.length() != palabra2.length()) {

			// Ya no pueden ser anagramas, por lo que "anagrama" sería falso
			anagrama = false;

		// Si no, queda comprobar caracter por caracter
		} else {

			// Recorremos "palabra1" siempre y cuando sea anagrama
			for (int i = 0; i < palabra1.length() && anagrama; i++) {
				
				// Ponemos "charEncontrado" como false para poder buscar el siguiente caracter
				charEncontrado = false;
				
				// Recorremos "palabra2" siempre y cuando aún no se haya encontrado aún el caracter
				for (int j = 0; j < palabra2.length() && !charEncontrado; j++) {
					
					// Si encontramos el caracter
					if (palabra1.charAt(i) == palabra2.charAt(j)) {
						
						// Ponemos "charEncontrado" como verdadero
						charEncontrado = true;
						
					}
					
				}
				
				// Si no se ha encontrado el caracter al terminar de recorrer la segunda palabra
				if (!charEncontrado) {
					
					// No puede ser anagrama, lo ponemos como falso
					anagrama = false;
					
				}
				
			}

		}
		
		// Hacemos un if-else para informar al usuario si son anagramas o no
		if (anagrama) {
			
			System.out.println("Ambas palabras son anagramas una de otra");
			
		} else {
			
			System.out.println("No son anagramas una de otra");
			
		}
		
		// Cerramos el scanner
		sc.close();

	}

}

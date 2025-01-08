package parte1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Variable String "frase" donde guardaremos la frase"
		String frase = "";

		// Variable int "cantidad" donde guardaremos la cantidad de letras que hay de
		// las que encontremos
		int cantidad;

		// Variable int "letra" donde guardaremos el codigo ASCII de la "a" para asi
		// poder crear un abecedario
		int letra = 'a';

		// Array int "abecedario" donde guardaremos todas las letras del abecedario
		int[] abecedario = new int[26];

		// Array boolean "letrasUsadas" donde guardaremos que letras del abecedario se
		// usan en la frase
		boolean[] letrasUsadas = new boolean[26];

		// Pedimos la frase y la guardamos en "frase"
		System.out.println("Introduzca la frase");
		frase = sc.nextLine().toLowerCase();

		// Rellenamos el array "abecedario" con todas las letras mediante un for
		for (int i = 0; i < abecedario.length; i++) {

			abecedario[i] = letra;

			letra++;

		}

		// Rellenamos el array "letrasUsadas" de false
		Arrays.fill(letrasUsadas, false);

		// Recorremos la frase
		for (int i = 0; i < frase.length(); i++) {

			// Si el caracter se ha encontrado en el abecedario
			if (Arrays.binarySearch(abecedario, frase.charAt(i)) >= 0) {

				// Guardamos esa posicion como true en "letrasUsadas"
				letrasUsadas[Arrays.binarySearch(abecedario, frase.charAt(i))] = true;

			}

		}

		// Recorremos "letrasUsadas"
		for (int i = 0; i < letrasUsadas.length; i++) {
			
			// Si esa posición tiene una letra usada
			if (letrasUsadas[i]) {

				// Reiniciamos "cantidad"
				cantidad = 0;

				// Mostramos el caracter
				System.out.print((char) abecedario[i] + " = ");

				// Recorremos la frase
				for (int j = 0; j < frase.length(); j++) {

					// Si la letra se ha encontrado en el abecedario
					if (frase.charAt(j) == abecedario[i]) {

						// Sumamos su cantidad
						cantidad++;

					}

				}

				// Mostramos la cantidad
				System.out.print(cantidad);

				// Cambiamos de linea
				System.out.println();

			}

		}

		// Cerramos el scanner
		sc.close();

	}

}

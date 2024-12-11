package parte1;

import java.util.Scanner;

public class Ejercicio07alternativa {

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		// Creamos la variable String "frase" donde guardaremos la frase introducida por
		// el usuario
		String frase;

		// Creamos la variable String "palabra" donde guardaremos la palabra a buscar
		String palabra;

		// Creamos la variable entera "veces" donde guardaremos las veces que se repite
		// la palabra en la frase
		int veces;

		// Pedimos la frase y la guardamos en "frase"
		System.out.println("Introduzca una frase");
		frase = sc.nextLine();

		// Pedimos la palabra a buscar y la guardamos en "palabra"
		System.out.println("Introduzca una palabra a buscar en la frase");
		palabra = sc.nextLine();

		// Guardamos el entero devuelto por "contadorPalabra" dada "frase" y "palabra"
		// en "veces"
		veces = contadorPalabra(frase, palabra);

		// Mostramos las veces que se repite la palabra
		System.out.println("La palabra se repite " + veces + " veces");

		// Cerramos el scanner
		sc.close();

	}

	// Creamos la funcion "contadorPalabra", la cual recibe un String "frase" y un
	// String "palabra"
	static int contadorPalabra(String frase, String palabra) {

		// Creamos la variable entera "veces" donde guardaremos las veces que se repite
		// la palabra
		int veces = 0;

		// Creamos la variable String "palabraSeparada" donde guardaremos las palabras
		// sacadas de la frase
		String palabraSeparada = "";

		// Hacemos un bucle for que recorrerá la frase
		for (int i = 0; i < frase.length(); i++) {

			// Hacemos un bucle for que recorrerá la palabra (revisa caracter porcaracter
			// hasta encontrar un espacio)
			for (; i < frase.length() && frase.charAt(i) != ' '; i++) {

				// Guardamos el caracter en "palabraSeparada"
				palabraSeparada += frase.charAt(i);

			}

			// Comprobamos si "palabraSeparada" es igual a la palabra que buscamos
			if (palabraSeparada.equalsIgnoreCase(palabra)) {

				// e incrementamos "veces"
				veces++;

			}

			// Limpiamos "palabraSeparada"
			palabraSeparada = "";

		}

		// Devolvemos "veces"
		return veces;
	}
}

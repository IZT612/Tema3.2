package parte1;

import java.util.Scanner;

public class Ejercicio07 {

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

		// Creamos la variable entera "contador" que usaremos para recorrer la frase
		int contador = 0;

		// Creamos la variable entera "ultimaPos" donde guardaremos la ultima posicion
		// en la que buscamos para saber en que posicion buscar proximamente
		int ultimaPos = 0;

		// Hacemos un bucle for que recorrerá la frase
		while (contador < frase.length()) {

			// Si se encuentra la palabra incrementamos veces y guardamos la ultima posicion
			// + 1
			if (frase.indexOf(palabra, ultimaPos) != -1) {
				veces++;
				ultimaPos = (frase.indexOf(palabra, ultimaPos)) + 1;

				// Creamos un bucle while para seguir recorriendo la frase hasta cambiar de
				// palabra
				while (contador < frase.length() && frase.charAt(contador) != ' ') {

					// Incrementamos contador
					contador++;

				}

			}

			// Incrementamos contador
			contador++;

		}

		// Devolvemos "veces"
		return veces;
	}

}

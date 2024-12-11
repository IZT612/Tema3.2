package parte1;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		// Creamos la variable String "frase" donde guardaremos la frase introducida por
		// el usuario
		String frase;

		// Creamos la variable entera "cantidadEspacios" donde guardaremos la cantidad
		// de espacios que hay en la frase
		int cantidadEspacios;

		// Pedimos la frase y la guardamos en "frase"
		System.out.println("Introduzca una frase");
		frase = sc.nextLine();

		// guardamos en "cantidadEspacios" el entero recibido al llamar a la función
		// "contadorEspacios" dando "frase"
		cantidadEspacios = contadorEspacios(frase);

		// Mostramos cuantos espacios hay
		System.out.println("Hay un total de " + cantidadEspacios + " espacios.");

		// Cerramos el scanner
		sc.close();

	}

	// Creamos la funcion "contadorEspacios" la cual recibe un String "frase" y
	// devuelve un entero, esta función se encarga de contar cuantos espacios hay en
	// la frase
	static int contadorEspacios(String frase) {

		// Creamos la variable entera "cantidadEspacios" para guardar la cantidad de espacios en la frase
		int cantidadEspacios = 0;

		// Creamos un bucle for que recorrerá los caracteres de "frase"
		for (int i = 0; i < frase.length(); i++) {

			// Si el caracter es un espacio, incrementamos "cantidadEspacios"
			if (frase.charAt(i) == ' ') {
				cantidadEspacios++;

			}

		}

		// Devolvemos "cantidadEspacios"
		return cantidadEspacios;
	}

}

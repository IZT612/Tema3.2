package parte1;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		// Creamos un array de caracteres "conjunto1" donde guardamos los caracteres a
		// los que cambiar
		char[] conjunto1 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };

		// Creamos otro array de caracteres "conjunto2" donde guardamos los caracteres a
		// cambiar
		char[] conjunto2 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };

		// Creamos la variable String "mensaje" donde guardaremos el mensaje introducido
		// por el usuario
		String mensaje;

		// Creamos la variable String "mensajeCodificado" donde guardaremos el mensaje
		// codificado
		String mensajeCodificado = "";

		// Pedimos el mensaje y lo guardamos en "mensaje"
		System.out.println("Introduzca su mensaje");
		mensaje = sc.nextLine();

		// Recorremos el mensaje
		for (int i = 0; i < mensaje.length(); i++) {

			// Guardamos en "mensajeCodificado" el resultado de darle a la función
			// "codifica" ambos conjuntos y un caracter de "mensaje" en minusculas
			mensajeCodificado += descodifica(conjunto1, conjunto2, mensaje.toLowerCase().charAt(i));

		}

		System.out.println();

		// Le mostramos el mensaje des	codificado al usuario
		System.out.println("Este es su mensaje descodificado:");
		System.out.println(mensajeCodificado);

		// Cerramos el scanner
		sc.close();

	}

	// Creamos la función char "codifica" que necesita 2 arrays de caracteres y el
	// caracter a codificar
	static char descodifica(char conjunto1[], char conjunto2[], char c) {

		// Inicializo el carácter codificado a c en minúscula
		char charCodificado = Character.toLowerCase(c);
		
		// Paso el conjunto 2 a string
		String conj2Cad = String.valueOf(conjunto2);

		// Busco en qué posición está el carácter en el conjunto2
		int posicion = conj2Cad.indexOf(charCodificado);

		// Si es mayor o igual a 0, está en el conjunto
		if (posicion >= 0) {

			// Asi que guardamos en "charCodificado" el caracter de conjunto 1 de la misma
			// posición
			charCodificado = conjunto1[posicion];

			// Si no es el caso dejamos el caracter tal y como está
		} else {
			charCodificado = c;

		}

		// Devolvemos "charCodificado"
		return charCodificado;
	}

}

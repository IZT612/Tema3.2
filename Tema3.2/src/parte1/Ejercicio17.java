package parte1;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Variable String donde guardaremos la frase comentada
		String fraseComentada = "";

		// Variable String donde guardaremos la frase sin comentarios
		String frase = "";

		// Variable booleana donde guardaremos si debemos añadir el caracter
		boolean añadir = true;

		// Variable entera que usaremos como contador
		int contador = 0;

		// Pedimos la frase y la introducimos en "fraseComentada"
		System.out.println("Introduzca su frase");
		fraseComentada = sc.nextLine();

		// Creamos un bucle while para recorrer "fraseComentada"
		while (contador < fraseComentada.length()) {

			// Verificamos primero que no estemos al limite de la frase (para evitar
			// errores), para luego ver si también el caracter es una barra y el siguiente
			// un asterisco
			if (contador != (fraseComentada.length() - 1)
					&& (fraseComentada.charAt(contador) == '/' && fraseComentada.charAt(contador + 1) == '*')) {

				// Si es el caso se trata del inicio de un comentario, por lo que dejamos de
				// añadir
				añadir = false;

			}

			// Si añadir es true añadimos el caracter
			if (añadir) {

				frase += fraseComentada.charAt(contador);

			}

			// Ahora verificamos si el comentario ha finalizado es decir, si hay una barra y
			// el anterior era asterisco, pero antes comprobamos que no estemos al inicio
			// (causará errores)
			if (contador != 0
					&& (fraseComentada.charAt(contador) == '/' && fraseComentada.charAt(contador - 1) == '*')) {

				// ponemos añadir como true
				añadir = true;
				
				// Sumamos el contador para saltar el espacio provocado al separar comentario y texto
				contador++;

			}

			// Sumamos el contador
			contador++;

		}

		// Mostramos la frase sin comentarios
		System.out.println(frase);

		// Cerramos el scanner
		sc.close();

	}

}

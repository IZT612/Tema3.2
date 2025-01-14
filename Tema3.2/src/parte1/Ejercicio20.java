package parte1;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Variable string donde guardaremos la palabra
		String palabra;

		// Variable int donde guardamos cuantas letras hay por grupo
		int grupos;

		// Pedimos la palabra y la introducimos en "palabra"
		System.out.println("Introduzca la palabra");
		palabra = sc.nextLine();

		// Pedimos cuantas letras quiere por grupo y lo guardamos en "grupos"
		System.out.println("¿En grupos de cuantas letras quiere dividir la palabra?");
		grupos = sc.nextInt();

		// Mostramos lo obtenido tras llamar a la funcion "agrupar" dados "palabra" y
		// "grupos"
		System.out.println(agrupar(palabra, grupos));

		// Cerramos el scanner
		sc.close();

	}

	// Función que agrupa las letras de una palabra introducida por parámetro en
	// grupos de cierta cantidad de letras introducida por parámetro
	static String agrupar(String palabra, int grupos) {

		// Variable string donde guardaremos las letras agrupadas
		String resultado = "";

		// Variable int donde guardamos cuantos grupos tenemos que hacer
		int cantidadGrupos;

		// Variable int donde guardamos la posición en la que se empieza a agrupar
		int posicion = 0;

		// Si la longitud de la palabra es divisible entre la cantidad de letras por
		// grupo, la cantidad de grupos se calcula con una division
		if (palabra.length() % grupos == 0) {

			cantidadGrupos = palabra.length() / grupos;

			// Si no, hacemos la division y sumamos 1 para las letras que sobren
		} else {

			cantidadGrupos = (palabra.length() / grupos) + 1;

		}

		// Un bucle que se repite tantas veces como cantidad de grupos haya que hacer
		for (int i = 0; i < cantidadGrupos; i++) {

			// Si la suma de la posicion y los grupos está fuera de rango hacemos substring hasta el final
			if (posicion + grupos > palabra.length()) {

				resultado += palabra.substring(posicion);

				// Si no, hacemos substring de la cantidad de letras especiifcada
			} else {

				resultado += palabra.substring(posicion, posicion + grupos) + " ";

			}

			// Guardamos la nueva posición
			posicion += grupos;

		}
		
		// Devolvemos resultado
		return resultado;
	}

}

package parte1;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Variable entera contador que usaremos para el bucle
		int contador = 0;

		// Variable string donde guardamos la frase introducida por el usuario
		String frase;

		// Variable string donde guardaremos cada palabra de la frase (con la primera
		// letra en mayúscula)
		String substring = "";

		// Variable string donde guardaremos la frase convertida en la nomenclatura
		// Camel como una variable
		String fraseCamel = "";

		// Variable int que usaremos para guardar el último espacio encontrado para no
		// saltarnos ninguna palabra
		int posicion = 0;

		// Pedimos la frase y la guardamos en "frase"
		System.out.println("Introduzca la frase");
		frase = sc.nextLine();

		// Guardamos la primera palabra en minúscula
		fraseCamel += frase.substring(0, frase.indexOf(' ')).toLowerCase();

		// Ponemos el contador para que inicie en el primer espacio
		contador = frase.indexOf(' ');

		// Mientras que el contador sea menor a la longitud de la frase estaremos en el
		// bucle
		while (contador < frase.length()) {

			// Reiniciamos "substring"
			substring = "";

			// Si encontramos un espacio
			if (frase.indexOf(' ', contador + 1) >= 0) {

				// Guardamos ese espacio en "posicion", ya que contador lo seguiremos
				// modificando y necesitamos guardar cada espacio para guardar en algún momento
				// el último
				posicion = frase.indexOf(' ', contador + 1);

				// Añadimos el primer caracter de la palabra en mayúscula
				substring += Character.toUpperCase(frase.charAt(contador + 1));

				// Añadimos el resto de la palabra en minúscula
				substring += frase.substring(contador + 2, frase.indexOf(' ', contador + 1)).toLowerCase();

				// Cambiamos el contador para no repetir palabras
				contador = frase.indexOf(' ', contador + 1);

				// Añadimos "substring" a "fraseCamel"
				fraseCamel += substring;

				// Quitamos uno al contador para poder obtener la próxima palabra correctamente
				contador--;
			}

			// Añadimos uno al contador
			contador++;

		}
		
		substring = "";

		// Si el espacio encontrado no ha sido el último caracter de la frase entramos en el condicional
		if (frase.indexOf(' ', posicion) != frase.length() - 1) {

			// Añadimos a "substring" la primera letra de la última palabra en mayúscula
			substring += Character.toUpperCase(frase.charAt(posicion + 1));
			
			// Y el resto en minúscula
			substring += frase.substring(posicion + 2).toLowerCase();
			
			// Añadimos "substring" a "fraseCamel"
			fraseCamel += substring;

		}

		// Mostramos "fraseCamel"
		System.out.println(fraseCamel);

		// Cerramos el scanner
		sc.close();

	}

}

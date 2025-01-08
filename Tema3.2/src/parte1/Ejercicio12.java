package parte1;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Variable String "frase" para almacenar la frase introducida por el usuario
		String frase;

		// Variable String "palabraLarga" para guardar la palabra más larga
		String palabraLarga = "";

		// Variable String "palabra" para guardar las palabras de la frase individualmente
		String palabra = "";

		// Variable int "cantidadCaracteres" para guardar la cantidad de caracteres de la palabra mas larga
		int cantidadCaracteres = 0;
		
		// Variable int "posicion" para guardar la posicion desde la que obtener la siguiente palabra 
		int posicion = 0;

		// Pedimos la frase y la guardamos en "frase"
		System.out.println("Introduzca la frase");
		frase = sc.nextLine();

		// Recorremos la frase caracter por caracter
		 for (int i = 0; i < frase.length(); i++) {
			
			// Si el caracter es un espacio entramos al if
			if (frase.charAt(i) == ' ') {
				
				// Obtenemos la palabra guardando todo contenido de "frase" desde la posicion y el contador "i"
				palabra = frase.substring(posicion, i);
				
				// Guardamos la nueva posicion en el siguiente caracter para no contar el espacio
				posicion = i + 1;
				
			}

			// Comprobamos si la palabra es mas larga que la palabra mas larga registrada
			if (palabra.length() > palabraLarga.length()) {

				// Si es el caso esta palabra es ahora la palabra más larga
				palabraLarga = palabra;

				// Guardamos sus caracteres
				cantidadCaracteres = palabra.length();

			}

		}
		
		// Recorremos la tabla alreves solamente para la ultima palabra, ya que con el for anterior la última no se puede obtener
		for (int i = frase.length() - 1; frase.charAt(i) != ' '; i--) {
			
			// Guardamos la palabra en "palabra"
			palabra = frase.substring(i, frase.length() - 1);
			
		}
		
		// Repetimos el condicional anterior
		if (palabra.length() > palabraLarga.length()) {

			palabraLarga = palabra;

			cantidadCaracteres = palabra.length();
			
		}

		// Mostramos la palabra mas larga y mostramos sus caracteres
		System.out.println("La palabra más larga es " + palabraLarga);
		System.out.println("Y tiene un total de " + cantidadCaracteres + " caracteres");

		// Cerramos el scanner
		sc.close();

	}

}

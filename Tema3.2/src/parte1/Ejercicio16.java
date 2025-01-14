package parte1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio16 {

	static Random rand = new Random();

	public static void main(String[] args) {

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Variable String "palabra" donde guardaremos la palabra a adivinar
		String palabra = "";

		// Variable String "palabraDesordenada" donde guardaremos la palabra desordenada
		String palabraDesordenada;

		// Variable String "respuesta" donde guardaremos la respuesta del jugador 2
		String respuesta = "";

		// Variable booleana "error" donde guardaremos si hay error o no al guardar la
		// palabra
		boolean error;

		// Hacemos un do-while para volver a pedir la palabra si hay error
		do {

			// Ponemos "error" como falso
			error = false;

			// Hacemos try-catch para controlar posibles errores
			try {

				// Pedimos una palabra
				System.out.println("Jugador 1, introduzca la palabra");

				// Guardamos la palabra en "palabra"
				palabra = sc.nextLine();
				System.out.println();

				// Forzamos error si la palabra no tiene más de un caracter
				assert (palabra.length() > 1) : "La palabra debe tener más de un caracter";

				// Capturamos el error forzado si ha ocurrido
			} catch (AssertionError e) {

				// Informamos al usuario
				System.out.println(e.getLocalizedMessage());

				// Ponemos "error" como verdadero
				error = true;

				// Capturamos un error por si se ha introducido algo que no es una letra
			} catch (InputMismatchException e) {

				// Informamos al usuario
				System.out.println("Solo pueden incluir letras");

				// Ponemos "error" como verdadero
				error = true;
			}

			// Esto se repite mientras haya error
		} while (error);

		// Hacemos un do-while que se repetirá siempre que la palabra desordenada sea
		// igual a la palabra a adivinar, puesto que esto puede suceder y sería muy
		// obvio
		do {

			// Guardamos en "palabraDesordenada" el String recibido tras darle "palabra" a
			// la función "desordenar"
			palabraDesordenada = desordenar(palabra);

		} while (palabraDesordenada.equals(palabra));

		// Mostramos al jugador 2 de la palabra desordenada
		System.out.println("Pista: " + palabraDesordenada);

		// Hacemos un do-while para volver a pedir la respuesta si hay error
		do {

			// Ponemos "error" como falso
			error = false;

			// Hacemos try catch para controlar errores
			try {

				// Le preguntamos que palabra cree que es y guardamos su respuesta en
				// "respuesta"
				System.out.println("Jugador2, ¿Qué palabra cree que es?");
				respuesta = sc.nextLine();

				// Forzamos error si la respuesta no tiene la misma longitud que "palabra"
				assert (respuesta.length() == palabra.length())
						: "La respuesta debe tener la misma longitud de caracteres que la palabra o frase original, es decir "
								+ palabra.length() + " caracteres";

				// Capturamos el error
			} catch (AssertionError e) {

				// Informamos al usuario
				System.out.println(e.getLocalizedMessage());
				System.out.println();

				// Ponemos error como verdadero
				error = true;

			}

		} while (error);

		// Mientras la respuesta no sea igual a la palabra el bucle se repetirá
		while (!respuesta.equals(palabra)) {

			letrasCoincidentes(respuesta, palabra);

			// Informamos al jugador 2 de que ha fallado
			System.out.println("No lo ha adivinado aún, vuelva a intentarlo");
			System.out.println();

			// Hacemos un do-while que se repetirá siempre que la palabra desordenada sea
			// igual a la palabra a adivinar, puesto que esto puede suceder y sería muy
			// obvio
			do {

				// Guardamos en "palabraDesordenada" el String recibido tras darle "palabra" a
				// la función "desordenar"
				palabraDesordenada = desordenar(palabra);

			} while (palabraDesordenada.equals(palabra));

			// Mostramos la pista al jugador 2
			System.out.println("Pista: " + palabraDesordenada);

			// Hacemos un do-while para volver a pedir la respuesta si hay error
			do {

				// Ponemos "error" como falso
				error = false;

				// Hacemos try catch para controlar errores
				try {

					// Le preguntamos que palabra cree que es y guardamos su respuesta en
					// "respuesta"
					System.out.println("Jugador2, ¿Qué palabra cree que es?");
					respuesta = sc.nextLine();

					// Forzamos error si la respuesta no tiene la misma longitud que "palabra"
					assert (respuesta.length() == palabra.length())
							: "La respuesta debe tener la misma longitud de caracteres que la palabra o frase original, es decir "
									+ palabra.length() + " caracteres";

					// Capturamos el error
				} catch (AssertionError e) {

					// Informamos al usuario
					System.out.println(e.getLocalizedMessage());
					System.out.println();

					// Ponemos error como verdadero
					error = true;

				}

			} while (error);

		}

		// Informamos al jugador 2 que ha adivinado la palabra
		System.out.println();
		System.out.println("¡Ha adivinado! La palabra era: " + palabra);

		// Cerramos el scanner
		sc.close();

	}

	// Creamos la función "desordenar" que se encarga de desordenar una palabra
	// obtenida por parámetro "palabra" y devolverla
	static String desordenar(String palabra) {

		// Creamos la variable String "palabraDesordenada" para guardar aquí la palabra
		// desordenada
		String palabraDesordenada = "";

		// Creamos una variable int "numeroAleatorio" donde guardaremos los números
		// generados aleatoriamente
		int numeroAleatorio;

		// Creamos un array de booleanos que tendrá el mismo tamaño que caracteres en la
		// palabra para guardar cuales de sus letras ya se han movido de sitio
		boolean[] posicionesUsadas = new boolean[palabra.length()];

		// Hacemos un bucle que se repetirá tantas veces como caracteres tiene la
		// palabra
		for (int i = 0; i < palabra.length(); i++) {

			// Creamos un bucle que se repetirá siempre que esa posición en el array
			// "posicionesUsadas" sea verdadero, ya que esto significa que se ha usado
			do {

				// Volvemos a generar un número aleatorio
				numeroAleatorio = rand.nextInt(0, palabra.length());

			} while (posicionesUsadas[numeroAleatorio]);

			// Ponemos el valor de la posición usada como verdadero, para así indicar que se
			// ha
			// usado
			posicionesUsadas[numeroAleatorio] = true;

			// Añadimos ese caracter a "palabraDesordenada"
			palabraDesordenada += palabra.charAt(numeroAleatorio);

		}

		// Devolvemos la palabra desordenada
		return palabraDesordenada;
	}

	// Función que muestra cuantos caracteres coinciden entre los parametros String introducidos "respuesta" y "palabra"
	static void letrasCoincidentes(String respuesta, String palabra) {

		// Variable entera donde guardaremos cuantos caracteres coinciden
		int coincidentes = 0;

		// Bucle para recorrer "palabra"
		for (int i = 0; i < palabra.length(); i++) {

			// Si coincide el caracter de "palabra" con el de "respuesta" sumamos coincidentes
			if (palabra.charAt(i) == respuesta.charAt(i)) {

				coincidentes++;

			}

		}

		// Mostramos los caracteres coincidentes
		System.out.println(
				"En tu respuesta coinciden " + coincidentes + " caracteres con respecto a la palabra o frase original");

	}

}

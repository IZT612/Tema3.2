package parte1;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		// Creamos una variable String "contraseña" donde guardaremos la contraseña a adivinar
		String contraseña;

		// Creamos una variable String "respuesta" donde guardaremos la respuesta del jugador 2
		String respuesta;

		// Le pedimos al usuario que introduzca la contraseña y la guardamos en "contraseña"
		System.out.println("Jugador 1, introduzca la contraseña que el jugador 2 debe acertar");
		contraseña = sc.nextLine();

		// Creamos un DO WHILE para pedir la respuesta del jugador 2 y revisar si es correcta
		do {

			// Pedimos al jugador 2 que introduzca su respuesta y la guardamos en "respuesta"
			System.out.println("Jugador 2, introduzca su respuesta");
			respuesta = sc.nextLine();

			// Hacemos un for para recorrer la contraseña
			for (int i = 0; i < contraseña.length(); i++) {

				// Si el caracter de la contraseña está fuera del alcance de la respuesta mostramos un asterisco
				if (i >= respuesta.length()) {
					System.out.print('*');

				// Si no, revisamos si el caracter coincide para mostrarlo
				} else if (respuesta.toLowerCase().charAt(i) == contraseña.toLowerCase().charAt(i)) {
					System.out.print(contraseña.charAt(i));

					// Y si no coincide mostramos un asterisco
				} else {
					System.out.print('*');

				}

			}
			
			// Cambiamos de linea 
			System.out.println();

			// Se repite mientras no coincida
		} while (!respuesta.equalsIgnoreCase(contraseña));

		// Mostramos la contraseña
		System.out.println("¡Has acertado! La contraseña era " + contraseña);

		// Cerramos el scanner
		sc.close();

	}

}

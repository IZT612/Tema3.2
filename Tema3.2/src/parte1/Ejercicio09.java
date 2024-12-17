package parte1;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		// Creamos una variable String "mensajeInicial" donde guardaremos el mensaje
		// introducido
		String mensajeInicial = "";

		// Creamos una variable String "mensajeTraducido" donde guardaremos el mensaje
		// traducido
		String mensajeTraducido = "";

		// Creamos una variable booleana "javalandia" donde guardaremos si el mensaje
		// está escrito en ese idioma
		boolean javalandia;

		// Pedimos el mensaje y lo guardamos en "mensajeInicial"
		System.out.println("Introduzca el mensaje a traducir");
		mensajeInicial = sc.nextLine();

		// Si se encuentra justo al inicio "Javalín, javalón" se trata del idioma de
		// Javalandia, asi que mostramos el texto que se encuentra luego de eso
		if (mensajeInicial.indexOf("Javalín, javalón", 0) == 0) {

			// Guardamos el mensaje en "mensajeTraducido" 
			mensajeTraducido = mensajeInicial.substring(17);

			// Ponemos "javalandia" como true
			javalandia = true;

			// Si no, verificamos si tiene la variante, la parte del final
		} else if (mensajeInicial.indexOf("javalén, len, len", mensajeInicial.length() - 18) >= 0) {

			// Guardamos el mensaje que se encuentra antes de esta muletilla
			mensajeTraducido = mensajeInicial.substring(0, mensajeInicial.length() - 18);
			
			// Ponemos "javalandia" como true
			javalandia = true;

			// Si no, el mensaje no está escrito en ningún idioma extraño
		} else {

			// Guardamos el mensaje tal y como es
			mensajeTraducido = mensajeInicial;
			
			// Ponemos "javalandia" como false
			javalandia = false;

		}

		// Si estaba escrito en el idioma de javalandia...
		if (javalandia) {

			// Mostramos que el mensaje está en ese idioma
			System.out.println("El mensaje está escrito en el idioma de Javalandia");

			// Si no lo está...
		} else {

			// Mostramos que el mensaje NO está escrito en ese idioma
			System.out.println("El mensaje no está escrito en el idioma de Javalandia");

		}
		
		// Mostramos el mensaje traducido
		System.out.println(mensajeTraducido);

		// Cerramos el scanner
		sc.close();

	}

}

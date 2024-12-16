package parte1;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String mensajeInicial = "";

		String mensajeTraducido = "";

		System.out.println("Introduzca el mensaje a traducir");
		mensajeInicial = sc.nextLine();

		if (mensajeInicial.indexOf("Javalín, javalón", 0) == 0) {
			
			System.out.println("El mensaje está escrito en el idioma de Javalandia");
			mensajeTraducido = mensajeInicial.substring(17);

		} else if (mensajeInicial.indexOf("javalén, len, len", mensajeInicial.length() - 18) >= 0) {
			
			mensajeTraducido = mensajeInicial.substring(0, mensajeInicial.length() - 18);
			
		} else {
			
			mensajeTraducido = mensajeInicial;
			
		}

		System.out.println(mensajeTraducido);

		sc.close();

	}

}

package parte1;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String frase;

		String palabraLarga = "";

		String palabra = "";

		int contador = 0;

		int cantidadCaracteres = 0;

		System.out.println("Introduzca la frase");
		frase = sc.nextLine();

		while (contador < frase.length() - 2) {

			palabra = frase.substring(frase.indexOf(" ", contador) + 1, frase.indexOf(" ", frase.indexOf(" ", contador) + 1));

			contador = frase.indexOf(" ", contador + 1);

			if (palabra.length() > palabraLarga.length()) {

				palabraLarga = palabra;

				cantidadCaracteres = palabra.length();

			}

		}

		System.out.println("La palabra más larga es " + palabraLarga);
		System.out.println("Y tiene un total de " + cantidadCaracteres + " caracteres");

		sc.close();

	}

}

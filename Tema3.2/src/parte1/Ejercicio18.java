package parte1;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		
		// Scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable string donde guardamos el código HTML final
		String resultado = "";

		// Variable string donde guardamos el título
		String titulo;

		// Variable string donde guardamos cada párrafo
		String parrafo = "";

		// Variable int donde guardamos la cantidad de parrafos
		int parrafosCantidad;

		// Pregutnamos el titulo y lo introducimos en "titulo"
		System.out.println("Introduzca el título de la página");
		titulo = sc.nextLine();

		// Añadimos "titulo" a "resultado" entre la etiquetas h1 de HTML
		resultado += "<h1> " + titulo + " </h1>";

		// Pedimos la cantidad de parrafos y la guardamos en "parrafosCantidad"
		System.out.println("¿Cuántos párrafos quiere introducir?");
		parrafosCantidad = sc.nextInt();
		sc.nextLine();

		// Hacemos un bucle for para pedir la cantidad especificada de parrafos
		for (int i = 0; i < parrafosCantidad; i++) {

			// Pedimos el parrafo
			System.out.println("Introduzca el párrafo número " + (i + 1));
			parrafo = sc.nextLine();

			// Lo añadimos al resultado entre las etiquetas p de HTML
			resultado += " <p> " + parrafo + " </p>";

		}
		
		// Le mostramos el código HTML obtenido
		System.out.println("Este es el código HTML que debe introducir:");
		System.out.println(resultado);
		
		// Cerramos el scanner
		sc.close();

	}

}

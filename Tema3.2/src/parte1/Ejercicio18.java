package parte1;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String resultado = "";

		String titulo;

		String parrafo = "";

		int parrafosCantidad;

		System.out.println("Introduzca el título de la página");
		titulo = sc.nextLine();

		resultado += "<h1> " + titulo + " </h1>";

		System.out.println("¿Cuántos párrafos quiere introducir?");
		parrafosCantidad = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < parrafosCantidad; i++) {

			System.out.println("Introduzca el párrafo número " + (i + 1));
			parrafo = sc.nextLine();

			resultado += " <p> " + parrafo + " </p>";

		}
		
		System.out.println("Este es el código HTML que debe introducir:");
		System.out.println(resultado);
		
		sc.close();

	}

}

package parte1;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable String "palabra" para guardar la palabra a añadir
		String palabra;
		
		// Creamos la variable String "frase" para guardar la frase final
		String frase = "";
		
		// Pedimos la palabra y la guardamos en "palabra"
		System.out.println("Introduzca la palabra a añadir a la frase. Escriba 'fin' para acabar el programa");
		palabra = sc.nextLine();
		
		// Hacemos un bucle while que se repite mientras palabra no sea igual a fin
		while (!palabra.equalsIgnoreCase("fin")) {
			
			// Añadimos la palabra a la frase junto a un espacio
			frase += palabra + " ";
			
			// Pedimos la palabra y la guardamos en "palabra" una vez mas
			System.out.println("Introduzca la palabra a añadir a la frase. Escriba 'fin' para acabar el programa");
			palabra = sc.nextLine();
			
		}
		
		// Mostramos la frase completa
		System.out.println("La frase completa es:");
		System.out.println(frase);
		
		// Cerramos el scanner
		sc.close();

	}

}

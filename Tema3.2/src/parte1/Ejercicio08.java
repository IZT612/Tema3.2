package parte1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		// Creamos el scanenr
		Scanner sc = new Scanner(System.in);
		
		// Creamos el array de Strings "palabras" para guardar las palabras separadas
		String[] palabras;
		
		// Creamos la variable String "frase" para guardar la frase introducida por el usuario
		String frase;
		
		// Pedimos la frase y la guardamos en "frase"
		System.out.println("Introduzca la frase para ordenar las palabras alfabéticamente.");
		frase = sc.nextLine();
		
		// Separamos la frase por cada espacio y lo guardamos en el array "palabras"
		palabras = frase.split(" ");
		
		// Ordenamos el array alfabéticamente
		Arrays.sort(palabras);
		
		// Recorremos el array
		for (int i = 0; i < palabras.length; i++) {
			
			// Mostramos la palabra 
			System.out.print(palabras[i] + " ");
			
		}
		
		// Cerramos el scanner
		sc.close();
		
	}
	
}

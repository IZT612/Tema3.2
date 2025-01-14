package parte1;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int contador = 0;
		
		int posicion;
		
		String frase;
		
		String substring = "";
		
		String fraseCamel = "";
		
		System.out.println("Introduzca la frase");
		frase = sc.nextLine();
		
		fraseCamel += frase.substring(0, frase.indexOf(' ')).toLowerCase();
		posicion = frase.indexOf(' ');
		
		while (contador < frase.length()) {
			
			if (frase.indexOf(' ', contador) >= 0) {
				
				substring = frase.substring(' ', (frase.indexOf(' ', contador) + 1)).toLowerCase();
				
				contador = frase.indexOf(' ', contador);
				
			}
			
			fraseCamel += substring;
			
			
			contador++;
			
		}
		
		System.out.println(fraseCamel);
		
		sc.close();

	}

}

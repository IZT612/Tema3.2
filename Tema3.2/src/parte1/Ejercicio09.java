package parte1;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String mensajeInicial = "";
		
		String mensajeTraducido = "";
		
		String posibleJavalandia = "";
		
		System.out.println("Introduzca el mensaje a traducir");
		mensajeInicial = sc.nextLine();
		
		if (mensajeInicial.indexOf("Javalín, javalón", 0) > 0) {
			
			for (int i = 0; i < 15; i++) {
				
				posibleJavalandia += mensajeInicial.charAt(i);
				
			}
			
			if (posibleJavalandia.equals("Javalín, javalón")) {
				
				for (int i = 16; i < mensajeInicial.length(); i++) {
					
					mensajeTraducido += mensajeInicial.charAt(i);
					
				}
				
			} else {
				
				for (int i = mensajeInicial.length() - 1; i < 15; i++) {
					
					posibleJavalandia += mensajeInicial.charAt(i);
					
				}
				
			}
			
		} else {
			
			System.out.println("El mensaje no está en el idioma de Javalandia:");
			mensajeTraducido = mensajeInicial;
			
		}
		
		System.out.println(mensajeTraducido);

	}

}

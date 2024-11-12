package ejercicios;

import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabra="";
	do {
		palabra=dimeCadenaTexto("Introduce una palabra", sc);
	    System.out.println(esPalindromo(palabra));
		
			
	} while (palabra.length()>0);

	}
	public static String dimeCadenaTexto(String texto, Scanner sc) {
		do {
			try {

				System.out.println(texto);
				String cadena = sc.nextLine();

				return cadena;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Introduce un texto");
			}

		} while (true);
	}
	public static boolean esPalindromo(String palabra) {
		String palabraInvertida="";

		for(int i=palabra.length()-1;i>=0;i--) {
			
			palabraInvertida+=palabra.substring(i,i+1);
			
		}
		System.out.println(palabraInvertida);
		if(palabra.equals(palabraInvertida))
			return true;
	     else
	    	return false;
	}
}

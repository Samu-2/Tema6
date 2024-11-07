package ejercicios;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cadena1 = dimeCadenaTexto("Introduce una cadena de texto", sc);
		String cadena2 = dimeCadenaTexto("Introduce una cadena de texto", sc);
		int len1 = cadena1.length();
		int len2 = cadena2.length();
		if (len1 > len2) {
			System.out.println(cadena1.toUpperCase());
		} else
			System.out.println(cadena2.toLowerCase());
		
	System.out.println(cadenaContieneOtraCadena(cadena1, cadena2));
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
public static boolean esIgualTexto(String texto1,String texto2) {
	if(texto1.equals(texto2)) {
		return true;
	}else
		return false;
	
}
public static boolean cadenaContieneOtraCadena(String texto1,String texto2) {
	if(texto1.contains(texto2)) {
		return true;
	}else
		return false;
	
}
}

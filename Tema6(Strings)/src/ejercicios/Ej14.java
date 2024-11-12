package ejercicios;

import java.util.Scanner;

public class Ej14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabra="";
		do {
			palabra=dimeCadenaTexto("Introduce una palabra", sc);
String cadena="";
		for(int i=0;i<palabra.length();i++)
		{
			if(i%2==0 && i<=palabra.length())
		cadena+=palabra.substring(i,i+1).toUpperCase();//	palabra.toUpperCase().substring(i,i+1);
			if(i%2==1)
				cadena+=palabra.substring(i,i+1).toLowerCase();
				
		}
		System.out.println(cadena);
		


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
}

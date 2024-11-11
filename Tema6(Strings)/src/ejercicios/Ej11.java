package ejercicios;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
	
		String frase = dimeCadenaTexto("Introduce una frase", sc);
String letra=dimeCadenaTexto("Introduce una letra", sc);
		do {

			System.out.println("\n1.Veces\n2.Primera Aparición\n3.Ultima aparición\n0.Salir");

			opcion = dimeEntero("Elige una opción", sc);

			switch (opcion) {
			case 1:
				int  veces=numVecesLetra(frase, letra);
				System.out.println("La letra: "+letra+" se repite "+veces+" veces");
				break;
			case 2:
				
				break;
			case 3:
			
				break;

			case 0:
				break;
			default:
				System.out.println("Opción no valida");
			}

		} while (opcion != 0);

	}

	public static int dimeEntero(String texto, Scanner sc) { // para validar
		do {
			try {

				System.out.println(texto);
				String orden = sc.nextLine();
				int num = Integer.parseInt(orden);
				return num;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Introduce un número,no letras");
			}

		} while (true);
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

	public static int numVecesLetra(String frase, String letra) {
		int cont=0;
		for(int i=0;i<frase.length();i++)
		{
			
		
		String fraseLetraALetra=frase.substring(i,i+1);	
		if(letra.equalsIgnoreCase(fraseLetraALetra)) {
			cont ++;
		}
					
		}
		return cont;


	}
	//public static int posicionLetraPrimeraVez(String frase,String letra) {
		//int n=numVecesLetra(frase, letra);
		//if(n>0)
	///	for(int i=0;i<frase.length();i++)
		{
			
		
	
		}
		
	}


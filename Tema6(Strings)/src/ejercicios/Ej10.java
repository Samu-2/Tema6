package ejercicios;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		int num1 = 0;
		int num2 = 0;
		String cadena = dimeCadenaTexto("Introduce texto", sc);

		do {

			System.out.println("\n1.Subcadena\n 2.Remplazo\n 3.Impares \n0.Salir");

			opcion = dimeEntero("Elige una opción", sc);

			switch (opcion) {
			case 1:
				System.out.println(subcadena(num1, num2, cadena, sc));

			case 2:
				System.out.println();
				break;
			case 3:
				System.out.println();
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

	public static String subcadena(int num1, int num2, String cadena, Scanner sc) {
		int len = cadena.length();
		do {
			num1 = dimeEntero("Introduce un número", sc);
			num2 = dimeEntero("Introduce un número", sc);

		} while (!((num1 > 0 && num1 <= len) && (num2 > 0 && num2 <= len && num2 > num1) && (num1 != num2)));

		return cadena.substring(num1, num2);
	}
//crear funcion que devuelva las 2 primeras letras
	//public static String reemplazo(String cadena) {
		//int lenCadena = cadena.length();
		//if (lenCadena > 10) {

			
		
	}


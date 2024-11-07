package ejercicios;

import java.util.Scanner;



public class Ej10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		String cadena= dimeCadenaTexto("Introduce texto", sc); 
		do {
		
			System.out.println("1.Subcadena/n2.Remplazo/n3.Impares/n0.Salir");
	
			opcion = dimeEntero("Elige una opción", sc);

			switch (opcion) {
			case 1:
				System.out.println();
				break;

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
}

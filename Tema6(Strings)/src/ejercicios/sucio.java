package ejercicios;

import java.time.LocalDateTime;
import java.time.Month;

public class sucio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime salidaMadrid = LocalDateTime.of(2024, Month.FEBRUARY, 4, 10, 30);
		LocalDateTime llegadaNuevaYork = LocalDateTime.of(2024, Month.FEBRUARY, 4, 13, 30);
System.out.println(salidaMadrid);
System.out.println(llegadaNuevaYork);


String cadena = "Hola buenos días";


for (int i = 0; i < cadena.length(); i++) {
	if(i==1) {
	System.out.println(cadena.substring(i)); 
}else
	System.out.println("na");
}
	}
}
//System.out.println(s.substring(i,i+1));		//con substring tendríamos un String


	



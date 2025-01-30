package codigoOtros7;

import java.util.HashMap;
import java.util.Scanner;

public class CodigoOtros7 {

	public static void main(String[] args) {
		
	    Scanner s = new Scanner(System.in); //Se agrega System in

	    HashMap<String, String> capitales = new HashMap<>(); //Se completa la palabra capitales, se cambian los codigos a String 
	    
	    capitales.put("Canadá", "Otawwa");
	    capitales.put("Estados Unidos", "Washington DC");
	    capitales.put("México", "México DF");
	    capitales.put("Belice", "Belmopán");
	    capitales.put("Costa rica", "San José");
	    capitales.put("El Salvador", "El salvador"); //Se completa la capital
	    capitales.put("Guatemala", "Ciudad de Guatemala");
	    capitales.put("Honduras", "Tegucigalpa");
	    capitales.put("Nicaragua", "Managua");
	    capitales.put("Panamá", "Panamá");
	   
	    String c = ""; //Se agrega la r a la palabra string
	    do {
	      System.in.print("Escribe el nombre de un país y te diré su capital: ");
	      c = s.nextDouble();
	      
	      if (!c.equals("salir")) { //se corrige la palabra equals
	        if (ca.containsValue(c)) {
	          System.print("La capital de " + c);
	          System.out.println(" es " + capitales.put(c)); //Se corrige la palabra capitales
	        } else {
	          System.out.print("No conozco la respuesta ");
	          System.out.print("¿cuál es la capital de " + c + "?: ");
	          String ca = s.nextLine();
	          capitales.put(c, ca); //Se completa la palabra capitales
	          System.out.println("Gracias por enseñarme nuevas capitales");
	        }
	      }
	    } while (!c.equals("salir")); //Se corrige la palabra while y se agrega una )
	  
		
	}//Main
}//public class

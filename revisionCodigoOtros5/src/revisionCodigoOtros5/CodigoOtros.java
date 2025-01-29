package revisionCodigoOtros5;

//En este codigo se le pide al usuario que ingrese un numero, el 
//programa devuelve si es un numero afortunado, es decir si el digito es 3, 7, 8 o 9
//El programa devuelve afortunado

import java.util.Scanner;

public class CodigoOtros {
	
	public static void main(String[] args) { //Se agrega el metodo main

		Scanner s = new Scanner(System.in); //Se agrega el system.in
		
	    System.out.print("Introduzca un número: "); //Se arreglaron las comillas
	    String ni = s.nextLine();
	    
	    int c =  Integer.parseInt(ni); //convierto el string en un entero
	    int usernumber = c;
	    	    
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (usernumber > 0) { //cambio ni por c
		  int digito = (usernumber % 10); //cambio ni por el entero c y se elimina (int)
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;} //Se agregó el }
		  
	      usernumber /= 10; //cambio ni por c
	    }
	    if (afo > noAfo) {
	      System.out.println("El " + c + " es un número afortunado.");
	    } else {
	      System.out.println("El " + c + " no es un número afortunado.");
	    }
	    
	  
		
	}//Main
	
}//public class

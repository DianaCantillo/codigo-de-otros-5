package RevisionCodigoOtros6;

public class codigoOtros6 {
	 public static void main(String[] args) {
		
		 
		 int[] n = new int [20]; //se agrega la palabra new

		    for (int i = 0; i < 20; i++) { //Se agrea un + a la ultima entrada
		      n[i] = (int)(Math.random() * 381) + 20;
		      System.out.print(n[i] + " "); //Se agrega .out
		    }
		    
		    System.out.println("\n¿Qué números quiere resaltar? ");
		    System.out.println("(1 – los múltiplos de 5, 2 – los múltiplos de 7): "); //Se agrega ln para mejorar la legibilidad
		    int opcion = Integer.parseInt(System.console().readLine());//Se agregó un )

		    int multiplo = (opcion == 1) ? 5 : 7; //Se intercambia el ? y :

		    for (int e : n) { //se quita la palabra each y char por int
		      if (e % multiplo == 0) {
		        System.out.print("[" + e + "] ");}//Se agregó el } faltante
		       else {
		        System.out.print(e + " "); //Se cambio in por out
		      }
		    }
	
   
	

}//main
}//public class

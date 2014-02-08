/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:
Dados 2 numeros (limite inferior y superior), recorra el rango e imprima los numeros dentro de este rango.

*/

public class rangeSum {   

   public static void main(String[] args) {
		int lb=8;
		int la=17;
		System.out.println("Los limites son: " +lb+" y "+la);

      do {
	lb++; System.out.println("numero actual es:"+lb );} while (lb<=la);
         
      
   }

}
/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero 'n' identifique si es par o impar

*/

public class oddEven {   

   public static void main(String[] args) {
      int x=5;
	int y=x%2;
	int xa=6;
	int ya=xa%2;
      	System.out.println(x);
	if (y > 0) {System.out.println("numero es impar");}
	else {System.out.println("numero es par");}
      	System.out.println(xa);
	if (ya > 0) {System.out.println("numero es impar");}
	else {System.out.println("numero es par");}

   }
}
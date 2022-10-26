package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		int edad = 0;
		double suma = 0, contador = 0, media = 0;
		int mas18 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (edad >= 0) {
			  contador++;
			  suma += edad;
			  if(edad >= 18) {
				  mas18++;
			  }
			  
			  System.out.print("Introduzca la edad del alumno " + contador + ":  ");
			  edad = sc.nextInt();
			  if(edad < 0) {
				  contador--;
			  }
		}
		  media = suma / contador;
		System.out.print("La suma de la nota de todos los alumnos es: " + suma
				+ ".\nLa media de todas las notas introducidas es: " + media
				+ ".\nEn el centro hay un total de " + contador + " alumnos, de los cuales " + mas18 + " son mayores de edad.");
		sc.close();
	}

}

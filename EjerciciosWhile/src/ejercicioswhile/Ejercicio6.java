package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		//Creamos una variable para guardar las edades de los alumnos y otra para llevar cuenta de todos los alumnos del centro
		int edad = 0, contador = 0;
		//Creamos una variable para llevar la suma de todas las edades y otra para calcular la media de las mismas
		double suma = 0, media = 0;
		//Creamos otro contador, pero en este caso para llevar la cuenta de todos los alumnos que sean mayores de 18
		int mas18 = 0;
		
		//Creamos el escáner del programa
		Scanner sc = new Scanner(System.in);
		
		//Imprimos el mensaje principal, pidiéndole al usuario que introduzca la edad del primer alumno
		  System.out.print("Introduzca la edad del alumno " + contador + ": ");
		  //Guardamos el valor introducido en la variable designada
		  edad = sc.nextInt();
		
		  //Creamos el bucle while que se repetirá mientras la edad introducida sea mayor o igual a 0
		while (edad >= 0) {
			//Sumamos el valor introducido al valor almacenado en 'suma'
			  suma += edad;
			  //Sumamos +1 al contador del programa
			  contador++;
			  
			  //Si el alumno tiene más de 18 años, sumamos +1 al contador de alumnos mayores de edad
			  if(edad >= 18) {
				  mas18++;
			  }
			  //Le pedimos al usuario que introduzca otra edad para un alumno diferente
			  System.out.print("Introduzca la edad del alumno " + contador +" (Introduzca un número negativo para parar): ");
			  //Guardamos la edad en la variable que usamos anteriormente
			  edad = sc.nextInt();
		}
		//Calculamos la media de edades del centro
		  media = suma / contador;
		  //Imprimimos el mensaje final, mostrando los resultados de los cálculos realizados a partir de los datos introducidos por el usuario
		System.out.print("\nLa suma de la edad de todos los alumnos es: " + (int)suma
				+ ".\nLa media de todas las notas introducidas es: " + media
				+ ".\nEn el centro hay un total de " + (int)contador + " alumnos, de los cuales " + mas18 + " son mayores de edad.");
		//Cerramos el escáner
		sc.close();
	}

}

package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Creamos la variable en la que guardaremos los valores que el usuario introduzca a lo largo del programa
		int num;
		//Creamos el escáner del programa
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos el mensaje inicial y le pedimos al usuario que introduzca un número
		System.out.println("Introduzca un número entero: ");
		//Guardamos el valor introducido en la variable designada
		num = sc.nextInt();
		
		//Creamos el bucle while, que se repetirá siempre que el número nos sea 0
		while(num != 0) {
			//Si el resto de la división del número introducido entre 2 es igual a 0, es par
			if(num %2 == 0) {
				System.out.println("--> Par");
			}
			//Si no, es impar (da 1)
			else {
				System.out.println("--> Impar");
			}
			//Le pedimos al usuario que introduzca otro número a analizar
			System.out.println("Introduzca otro número entero (para parar, introduzca 0):");
			//Guardamos el número en la misma variable que usamos para el anterior
			num = sc.nextInt();
		}
		//Cerramos el escáner
		sc.close();
	}

}

package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		//Creamos la variable 'suma' y la inicializamos a 0.
		int suma = 0;
		//Creamos la variable num, en la que guardaremos los valores que el usuario introduzca por teclado.
		int num;
		
		//Creamos el escáner del programa
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos el mensaje inicial, pidiéndole al usuario que introduzca un valor.
		System.out.print("Introduzca un número entero positivo: ");
		//Guardamos el valor en la variable designada.
		num = sc.nextInt();
		
		//Mientras el número introducido sea mayor o igual que 0
		while (num >= 0) {
			//El resultado de la suma es igual al valor previo de la variable 'suma' más el valor del último número introducido.
			suma += num;
			//Pedimos otro número y esperamos a que se introduzca. Lo guardamos en la misma variable que antes.
			System.out.print("Introduzca otro número entero positivo (introduzca un número negativo para parar): ");
			num = sc.nextInt();
		}
		//Imprimimos el mensaje final, mostrando el resultado final de la suma.
		System.out.print("La suma final de los números introducidos es: " + suma);
		//Cerramos el escáner.
		sc.close();
	}

}

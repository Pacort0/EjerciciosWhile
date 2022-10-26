package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Creamos la variable que usaremos de contador para los valores positivos que el usuario introduzca.
		int contador = 0;
		//Creamos la variable que usaremos para almacenar el valor que el usuario introduzca por teclado.
		int num;
		
		//Creamos el escáner del programa.
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos el mensaje inicial, pidiéndole al usuario que introduzca un número por teclado.
		System.out.print("Introduzca un número entero positivo: ");
		//Guardamos el número en la variable designada.
		num = sc.nextInt();
		
		//Mientras el número introducido por el usuario sea mayor o igual a 0
		while(num >= 0) {
			//Incrementamos el contador por 1
			contador ++;
			//Volvemos a pedirle al usuario que introduzca un número por teclado.
			System.out.print("Introduzca otro número entero positivo (para parar, introduzca un número entero negativo): ");
			//Lo guardamos en la misma variable que antes.
			num = sc.nextInt();
		}
		//Imprimimos el mensaje final, mostrándo el valor final del contador.
		System.out.print("Usted ha introducido un total de " + contador + " números positivos.");
		//Cerramos el escáner
		sc.close();
	}

}

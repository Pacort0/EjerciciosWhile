package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*Creamos la variable que va a crear el número aleatorio para el programa y 
		 * lo multiplicamos por 99 para convertirlo en un número situado entre 1 y 100*/
		double numRandom = Math.random()*99;
		//Creamos la variable que usaremos para guardar los valores que el usuario introduzca por teclado
		int num;
		
		//Creamos el escáner del programa
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos el mensaje principal, pidiéndole al usuario que introduzca un número
		System.out.print("Se ha generado un número aleatoriamente. \n"
				+ "Introduzca números hasta encontrarlo: ");
		//Guardamos el valor introducido en la variable designada
		num = sc.nextInt();
		
		//Creamos un bucle while que se repetirá mientras el número que introduzca el usuario no sea igual al generado aleatoriamente
		while(num != (int)numRandom) {
			//Si el número introducido es mayor que el aleatorio, se lo notificamos al usuario
			if(num > (int)numRandom) {
				System.out.println("Te has pasao.");
			}
			//Si, por el contrario, el número es menor, también se lo notificamos al usuario
			else {
				System.out.println("Te quedas corto.");
			}
			//Le pedimos al usuario que introduzca otro número
			System.out.print("Introduzca otro número: ");
			//Guardamos el valor guardado en la variable que usamos antes
			num = sc.nextInt();
		}
		//Imprimimos el mensaje final
		System.out.print("¡Victoria!");
		//Cerramos el escáner
		sc.close();
	}

}

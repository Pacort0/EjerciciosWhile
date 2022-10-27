package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Creamos una variable para llevar la cuenta de todos los números que el usuario introduzca por teclado
		int i = 0;
		//Creamos una variable para guardar cada valor que el usuario introduzca
		int num;
		//Creamos un contador para contar todos los 0 que el usuario introduzca
		int contador0 = 0;
		//Creamos una variable donde llevaremos la suma de los números positivos
		int suma = 0;
		//Creamos una variable para contar los números negativos introducidos, otra para sumarlos todos y otra para hacer la media aritmética de estos
		double media = 0, sumaNeg = 0, contadorNeg = 0;
		
		//Creamos el escáner del programa
		Scanner sc = new Scanner(System.in);
		
		//Creamos el bucle while, que se repetirá hasta que el usuario haya itnroducido 10 números
		while(i < 10) {
			//Informamos al usuario de la cantidad de números que lleva introducidos
			System.out.println("Lleva " + i + " número(s) introducidos.");
			//Pedimos al usuario que introduzca un número entero
			System.out.println("Introduzca un número entero: ");
			//Guardamos el valor introducido en la variable designada
			num = sc.nextInt();
			//Sumamos +1 al contador del programa
			i++;
			
			//Si el número introducido es 0, sumamos +1 al contador de ceros
			if(num == 0) {
				contador0++;
			}
			//Si el número introducido es mayor que 0, sumamos su valor al valor almacenado en 'suma'
			else if (num > 0) {
				suma += num;
			}
			else {
				/*Si el valor introducido es menor que 0, sumamos +1 al contador de negativos y 
				sumamos el valor introducido al valor almacenado en 'sumaNeg'*/
				contadorNeg++;
				sumaNeg += num;
			}
		}
		//Calculamos la media de los valores negativos introducidos
		media = sumaNeg / contadorNeg;
		//Imprimimos el mensaje final, mostrando al usuario los resultados de todos los cálculos en base a los números que ha introducido
		System.out.println("\nLa suma de todos los números positivos es " + suma
				+ ".\nLa media de todos los números negativos es " + media
				+ ".\nPor último, usted ha introducido " + contador0 + " ceros.");
		
		//Cerramos el escáner
		sc.close();
	}

}

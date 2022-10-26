package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int i = 0;
		int num;
		int contador0 = 0;
		int suma = 0;
		double media = 0, sumaNeg = 0, contadorNeg = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(i < 10) {
			System.out.println("Introduzca un número entero: ");
			num = sc.nextInt();
			i++;
			
			if(num == 0) {
				contador0++;
			}
			else if (num > 0) {
				suma += num;
			}
			else {
				contadorNeg++;
				sumaNeg += num;
				media = sumaNeg / contadorNeg;
			}
			System.out.println("Lleva " + i + " número(s) introducidos.");
		}
		System.out.println("\nLa suma de todos los números positivos es " + suma
				+ ".\nLa media de todos los números negativos es " + media
				+ ".\nPor último, usted ha introducido " + contador0 + " ceros.");
		
		sc.close();
	}

}

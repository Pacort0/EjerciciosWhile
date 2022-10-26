package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		double numRandom = Math.random()*99;
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Se ha generado un número aleatoriamente. \n"
				+ "Introduzca números hasta encontrarlo: ");
		num = sc.nextInt();
		
		while(num != (int)numRandom) {
			if(num - (int)numRandom > 0) {
				System.out.println("Te has pasao.");
			}
			else {
				System.out.println("Te quedas corto.");
			}
			
			System.out.print("Introduzca otro número: ");
			num = sc.nextInt();
		}
		System.out.print("¡Victoria!");
		sc.close();
	}

}

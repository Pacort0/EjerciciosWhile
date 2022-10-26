package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int num;
		double media, suma = 0, contador = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Introduzca un número entero positivo: ");
		num = sc.nextInt();
		
		while(num >= 0) {
			contador ++;
			suma += num;
			System.out.print("Introduzca otro número entero positivo (para parar, introduzca un número negativo): ");
			num = sc.nextInt();
		}
		media = suma / contador;
		
		System.out.print("Usted ha introducido un total de " + contador + " números. \n"
				+ "La media de todos ellos es " + media);
		sc.close();
	}

}

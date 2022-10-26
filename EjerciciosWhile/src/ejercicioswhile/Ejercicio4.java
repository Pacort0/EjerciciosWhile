package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número entero: ");
		num = sc.nextInt();
		
		while(num != 0) {
			if(num %2 == 0) {
				System.out.println("--> Par");
			}
			else {
				System.out.println("--> Impar");
			}
			System.out.println("Introduzca otro número entero (para parar, introduzca 0):");
			num = sc.nextInt();
		}
		
		sc.close();
	}

}

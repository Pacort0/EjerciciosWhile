package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		double altura = 0, comparador;
		int contador = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la altura del árbol: ");
		comparador = sc.nextDouble();
		
		while(altura != -1) {
			System.out.println("Árboles introducidos: " + contador);
			
			System.out.println("Introduzca la altura del siguiente árbol (para parar introduzca '-1'): ");
			altura = sc.nextDouble();
			contador++;
			
			if(altura - comparador > 0) {
				comparador = altura;
			}
		}
		System.out.print("El árbol introducido más alto ha sido el que mide " + comparador + " metros.");
		sc.close();
	}

}

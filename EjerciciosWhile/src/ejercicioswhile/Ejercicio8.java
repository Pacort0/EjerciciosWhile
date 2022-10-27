package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//Creamos una variable donde guardaremos la altura que el usuario introduzca y otra donde iremos guardando la altura máxima introducida
		double altura = 0, comparador;
		//Creamos un contador para el programa. Lo iniciamos a 1 porque una vez entremos en el bucle ya habremos guardado los datos de un árbol
		int contador = 1;
		
		//Creamos el escáner del programa
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos el mensaje inicial, pidiéndole al usuario la primera medida del primer árbol
		System.out.println("Introduzca la altura del árbol (metros): ");
		//Guardamos la altura en la variable que se encarga de guardar la altura máxima
		comparador = sc.nextDouble();
		
		//Creamos un bucle while que se repetirá mientras el valor de la altura sea diferente de -1
		while(altura != -1) {
			//Le mostramos al usuario la cantidad de árboles que lleva introducidos
			System.out.println("Árboles introducidos: " + contador);
			//Le pedimos al usuario la medida de otro árbol
			System.out.println("Introduzca la altura del siguiente árbol (para parar introduzca '-1'): ");
			//Guardamos la altura introducida en la variable 'altura'
			altura = sc.nextDouble();
			//Sumamos +1 al contador del programa
			contador++;
			
			/*Si la última altura introducida es mayor que la altura máxima guardada hasta el momento,
			se guarda la nueva altura máxima en la variable 'comparador'*/
			if(altura > comparador) {
				comparador = altura;
			}
		}
		//Imprimimos el mensaje final, mostrando el valor más alto introducido
		System.out.print("El árbol introducido más alto ha sido el que mide " + comparador + " metros.");
		//Cerramos el escáner
		sc.close();
	}

}

package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Creamos la variable donde guardaremos los valores que el usuario introduzca
		int num;
		//Creamos una variable para calcular la media, otra para llevar la suma de los números y otra para contar cuántos números se han introducido.
		double media, suma = 0, contador = 0;
		
		//Creamos el escáner del programa.
		Scanner sc = new Scanner (System.in);
		
		//Imprimimos el mensaje inicial y le pedimos al usuario que introduzca un valor por teclado
		System.out.print("Introduzca un número entero positivo: ");
		//Guardamos la variable en la variable designada
		num = sc.nextInt();
		
		//Mientras el número introducido sea mayor o igual que cero:
		while(num >= 0) {
			//Comenzamos cada bucle while añadiendo +1 al valor de la variable contador
			contador ++;
			//Le sumamos al valor guardado en 'suma' el valor numérico introducido por el usuario
			suma += num;
			//Volvemos a pedirle al usuario que introduzca otro número entero positivo
			System.out.print("Introduzca otro número entero positivo (para parar, introduzca un número negativo): ");
			//Guardamos el nuevo valor introducido en la misma variable que usamos al principio
			num = sc.nextInt();
		}
		//Calculamos la media de todos los números introducidos, haciendo uso de las variables 'suma' y 'contador'
		media = suma / contador;
		
		//Imprimimos el mensaje final, mostrando al usuario todos los datos pertinentes
		System.out.print("Usted ha introducido un total de " + contador + " números. \n"
				+ "La media de todos ellos es " + media);
		//Cerramos el escáner
		sc.close();
	}

}


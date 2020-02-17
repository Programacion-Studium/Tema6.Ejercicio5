package es.Studium;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main((int)String[] args)
	{
		try
		{
			int 
			numero1;
			Scanner teclado = new Scanner(System.in);
			System.out.println("Escriba un número entero: ");
			numero1=teclado.nextInt();
			teclado.close();
			Cuadrados(numero1);
			
		}
		catch(InputMismatchException err)
		{
		System.out.println("No se ha introducido un número entero...");
		}
	}

	private static void Cuadrados(int numero1) {
		int cuadrado;
		cuadrado=numero1*numero1;
		System.out.println("El resultado de "+numero1+" al cuadrado es: "+cuadrado);
	}
}

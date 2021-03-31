package Guia02;

import java.util.Scanner;

public class caso2 {

	public static void main(String[] args) {
		//Caso 2: Lea un número y muestre un mensaje si es un número par o impar.
		//variables
		int num1;
		//entrada de datos
		Scanner sc =new Scanner(System.in);
		System.out.print("ingrese el numero: ");
		num1=sc.nextInt();
		//resolviendo
		if (num1 % 2==0) {
			System.out.println("es un numero par");
		}
		else {
			System.out.println("es un numero impar");
		}
	}

}

package Guia02;

import java.util.Scanner;

public class caso3 {

	public static void main(String[] args) {
		//Caso 3: Lea dos n�meros y muestre un mensaje si son iguales o cu�l es el mayor de ambos.
		//variables
		int num1 , num2,num3 ;
		
		//entrada de datos
		Scanner sc=new Scanner(System.in);
		System.out.println("ingrese el numero 1: ");
		num1=sc.nextInt();
		System.out.println("ingresa el numero 2: ");
		num2=sc.nextInt();
		System.out.println("ingrese el numero 3: ");
		num3=sc.nextInt();
	
		//resolviendo
		
		if (num1>=0) {
			//si son iguales
			if (num1==num2 || num1 ==num3 ) {
				System.out.println("el numero "+num1+" se repite ");
			}
			else if (num2==num1 || num2 ==num3 ) {
				System.out.println("el numero "+num2+" se repite ");
			}
			else if (num3==num1 || num3 ==num2 ) {
				System.out.println("el numero "+num3+" se repite ");
			}
			
		
		//cual es el mayor
	    else if (num1>num2 && num1>num3) {
			System.out.println("el mayor es "+num1);
		}
		else if (num2>num1 && num2>num3) {
			System.out.println("el mayor es "+num2);
		}
		else if (num3>num1 && num3>num2) {
			System.out.println("el mayor es "+num3);
		}
		
		}
		}
	}



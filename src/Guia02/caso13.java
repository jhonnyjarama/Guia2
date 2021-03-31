package Guia02;

import java.util.Scanner;

public class caso13 {

	public static void main(String[] args) {
		//Caso 13: Lea los siguientes datos: numero1, numero2 y operación (1-6), se pide calcular: 
		//▪ Respuesta: según la operación será: o 1, calcule la suma de ambos números. o
		// 2, calcule la resta de ambos números. o 3, calcule el producto de ambos números. o 
		//4,calcule la división de ambos números siempre que el segundo número sea distinto de cero (0). o 
		//5,calcule el resto entero de ambos números siempre que el segundo número sea distinto de cero (0). o
		// 6,calcule el promedio de ambos números. 
		//o Otro valor, será 0.
		//variables
		int n1,n2,op,re=0;
		String ope=" ";
		//entrada de datos
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ingresa el numero 1: ");
		n1=sc.nextInt();
		System.out.println("ingresa el numero 2: ");
		n2=sc.nextInt();
		System.out.println("ingresa el numero [1-6]");
		op=sc.nextInt();
		
		//
		switch (op) {
		case 1: 
			ope="suma";
			re=(n1+n2);
			break;
		case 2 :
			ope="resta";
			re=(n1-n2);
			break;
		case 3 :
			ope="multiplicacion";
			re=(n1*n2);
			break;	
		case 4 :
			
			if (n2 != 0) {
				ope="division";
				re=(n1/n2);	
				
			}
			
			else {
				ope="no se puede dividir entre cero";
				re=0;
			}
			break;
			
		case 5 :
			
			if (n2 != 0) {
				ope="resto";
				re=(n1%n2);
				
			}
			else {
				
			}
			break;
		case 6 :
			ope="promedio";
			re=((n1+n2)/2);
			break;	
		
		
		}
		
		
		    System.out.println("el numero 1 : "+n1);
		    System.out.println("el numero 2 : "+n2);
			System.out.println("la operacion : "+ope);
			System.out.println("la respuesta : "+re);
		}
	}



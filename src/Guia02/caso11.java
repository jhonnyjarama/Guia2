package Guia02;

import java.util.Scanner;

public class caso11 {

	public static void main(String[] args) {
		// Caso 11: Lea un número entre 1 y 7, luego muestre el nombre del día. Considere 1 como “Domingo”,
		// 2 como “Lunes” y así sucesivamente. En caso se ingrese un número diferente al rango muestre “Desconocido”.
		//variables
		int n1=0;
		String nomd="";
		//entrada de datos

		Scanner sc=new Scanner(System.in);
		System.out.print("ingrese un numero entre[1-7]: ");
		n1=sc.nextInt();
		switch (n1) {
		case 1: 
			nomd="lunes";	
			break;
		case 2:
			nomd="martes";
			break;
		case 3: 
			nomd="miercoles";
			break;
		case 4:
			nomd="jueves";
			break;
		case 5: 
			nomd="viernes";
			break;
		case 6:
			nomd="sabado";
			break;
		case 7: 
			nomd="domingo";
		default:
			nomd="desconocido..";
		}
		System.out.println("nombre del dia: "+nomd);
		
	}

}

package Guia02;

import java.util.Scanner;

public class caso7 {

	public static void main(String[] args) {
		// Caso 7: Lea un sueldo y muestre el impuesto según la siguiente escala: 
		//▪ Hasta 1500, se aplica 3% sobre el sueldo. 
		//▪ Más de 1500 – 3000, se aplica 8% sobre el sueldo. 
		//▪ Más de 3000, se aplica 12% sobre el sueldo.
		//variables
		float sueldo,impuesto=0;
		//entrada de datos 
		Scanner sc = new Scanner(System.in);
		System.out.print("ingresa el sueldo: ");
		sueldo=sc.nextFloat();
		//condicionales
		if (sueldo<1500) {
			impuesto=(float)(sueldo*0.03);
		}
		else if (sueldo>1500 & sueldo<3000 ) {
			impuesto=(float)(sueldo*0.08);
		}
		else if (sueldo>3000) {
			impuesto=(float)(sueldo*0.12);
		}
		System.out.println("el impuesto es : "+impuesto);
	
	}
}

package Guia02;
import java.util.Scanner;
public class caso4 {

	public static void main(String[] args) {
		//Caso 4: Lea dos números y muestre un mensaje si son iguales o cuál es el menor de ambos.
		//variables
		int num1 , num2 ;
		//entrada de datos
		Scanner sc=new Scanner(System.in);
		System.out.println("ingrese el numero 1: ");
		num1=sc.nextInt();
		System.out.println("ingresa el numero 2: ");
		num2=sc.nextInt();
		//resolviendo
				if (num1==num2) {
					System.out.println("son iguales..");
				}
				else if (num1<num2) {
					System.out.println("el menor es "+num1);
				}
				else {
					System.out.println("el menor es: "+num2);
				}
	}

}

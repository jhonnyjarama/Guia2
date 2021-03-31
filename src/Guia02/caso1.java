package Guia02;
import java.util.Scanner;
public class caso1 {

	public static void main(String[] args) {
		//Caso 1: Ingrese una edad, si es a partir de 18 muestre el mensaje “Mayor de edad”, caso contrario 
		//muestre “Menor de edad”.
		//variables
		int edad ;
		//entrada de datos
		Scanner sc =new Scanner(System.in);
		System.out.print("ingresa una edad: ");
		edad=sc.nextInt();
		//resolvemos 
		if (edad >= 18) {
			System.out.println("es mayor de edad..");
		}
		else{
			System.out.println("es menor de edad..");
		}
		

	}

}

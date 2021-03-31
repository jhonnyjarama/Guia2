package Guia02;

import java.util.Scanner;

public class caso10 {

	public static void main(String[] args) {
//Lea los siguientes datos: empleado, horas trabajadas, tarifa por hora y el número de minutos de tardanza, 
//se pide calcular: ▪ Importe: Es el producto de las horas trabajadas y la tarifa por hora. 
//▪ Bono: Si tiene más de 60 horas trabajadas se aplica un monto del 13% del Importe, caso contrario será 4% del importe. 
//▪ Descuento: Si tiene más de 15 minutos de tardanza se aplica un monto del 3% del Importe, caso contrario será 0.
//▪ % Alcanzado: Se considera como meta alcanzar un total de 70 horas trabajadas. Al final, 
//muestre cada resultado obtenido.
		//variables
		String emple;
		int horast,mint;
		float tarifaxh,desc,bono;
		//entrada de datos
		Scanner sc = new Scanner(System.in);
		System.out.print("ingresa su nombre: ");
		emple=sc.nextLine();
		System.out.print("ingresa horas trabajadas: ");
		horast=sc.nextInt();
		System.out.print("ingresa la tarifa por hora: ");
		tarifaxh=sc.nextFloat();	
		System.out.print("ingresa los minutos de tardanzaa: ");
		mint=sc.nextInt();
		//calculando
		//importe
		float importe=(horast*tarifaxh);
		//bono
		if (horast>60) {
			bono=(float)(importe*0.13);
		}
		else {
			bono=(float)(importe*0.04);
		}
		//descuento
		if (mint>15) {
			desc=(float)(importe*0.03);
		}
		else {
			desc=(float)(importe*0.0);
		}
		//meta trasada
		float alcansado=(horast*100/70);
		//salida de datos
		System.out.println("el importe: "+importe);
		System.out.println("el bono: "+bono);
		System.out.println("descuento: "+desc);
		System.out.println("meta alcansada: "+alcansado);
	}

}

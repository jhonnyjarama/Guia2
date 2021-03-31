package Guia02;

import java.util.Scanner;

public class caso15 {
	

	public static void main(String[] args) {
		//Caso 15: Lea los siguientes datos: cliente, producto (TB, LT, MN, IM), cantidad y forma de pago (C1, C2),
		// se pide calcular: ▪ Precio: Según el producto será: 
		//o “TB” (Tablet), defina el valor de 350. 
		//o “LT” (Laptop), defina el valor de 2300. 
		//o “MN” (Monitor), defina el valor de 850. 
		//o “IM” (Impresora), defina el valor de 680. 
		//o Otro valor, defina el valor 0. ▪ 
		//Importe: Calcule la multiplicación del precio y la cantidad. De acuerdo a la forma de pago,
		// si es C1 (Contado) calcule un descuento del 5% sobre el importe,
		// si es C2 (Crédito) calcule un incremento del 12% del importe.
		//variables
		String cliente, producto,formap,msj=" ",msj1=" ";
		int cantidad;

		float desc=0,monto=0,tpa=0,dolar,importe;
		//entrada de datos 
		Scanner sc=new Scanner(System.in);
		System.out.print("ingresa tu nombre: ");
		cliente=sc.nextLine();
		System.out.print("ingresa tu producto[TB/LT/MN/IM]: ");
		producto=sc.nextLine();
		System.out.print("ingresa forma de pago[C1/C2]: ");
		formap=sc.nextLine();
		System.out.print("ingresa tu cantidad: ");
		cantidad=sc.nextInt();
		//sWitch monto
		producto=producto.toUpperCase();
		switch (producto) {
		case "TB":
			monto=350;
			msj1="Tablet";
			break;
		case "LT":
			monto=2300;
			msj1="Laptop";
			break;
		case "MN":
			monto=850;
			msj1="Monitor";
			break;
		case "IM":
			monto=680;
			msj1="Impresora";
			break;
		default:
			monto=0;
			break;
		}
		//importe
		importe=monto*cantidad;
		//switch formapago
		formap=formap.toUpperCase();
		switch (formap) {
		case "C1":
			desc=importe*((float)0.05);
			tpa=importe-desc;
			msj="CONTADO";
			break;
		case "C2":
			desc=importe*((float)0.12);
			//total a pagar 
			tpa=importe+desc;
			msj="CREDITO";
			break;
		}
		
		
		//salida de datos
		System.out.println(" ");
		System.out.println("cliente: "+cliente);
		System.out.println("producto: "+producto+"( "+msj1+" )");
		System.out.println("cantidad: "+cantidad);
		System.out.println("el monto por producto: "+monto);
		System.out.println("importe: "+importe);
		System.out.println("forma de pago: "+msj);
		System.out.println("el descuento por forma de pago: "+desc);
		System.out.println("el monto a pagar: "+tpa);
	}
}

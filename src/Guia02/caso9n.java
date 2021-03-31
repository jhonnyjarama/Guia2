package Guia02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class caso9n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		
		System.out.println("Alumno: ");
		String nombre = sc.nextLine();
		
		System.out.println("Nota 1: ");
		float nota1 = sc.nextFloat();
		
		System.out.println("Nota 2: ");
		float nota2 = sc.nextFloat();
		
		System.out.println("Asistencia (1-12): ");
		float na = sc.nextFloat();
		
		float prom = nota1 * 0.3f + nota2 * 0.7f;
		float pa =na/12;
		
		String estado = "Desaprobado";
		if (prom >= 13 && pa >=0.7)
			estado = "Aprobado";
		
		System.out.println("\n====== Resultados ==========");
		System.out.println("Alumno: "+nombre);
		System.out.println("Promedio: "+df.format(prom));
		System.out.println("Asistencia: "+df.format(pa*100) + "%");
		System.out.println("Estado: "+ estado);

	}

}

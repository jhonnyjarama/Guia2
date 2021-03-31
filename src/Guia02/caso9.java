package Guia02;
import java.text.DecimalFormat;
import java.util.Scanner;
public class caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.print("Ingrese nombre: ");
		String name = sc.nextLine();
		System.out.print("Ingrese nota 1: ");
		float nota1 = sc.nextFloat();
		System.out.print("Ingrese nota 2: ");
		float nota2 = sc.nextFloat();
		System.out.print("Ingrese asistencia [1-12]: ");
		int asis = sc.nextInt();
		float promedio = nota1 *0.3f+ nota2*0.7f;
		float por_asis = (asis/12f)* 100f;
		String estado = " Desaprobado";
		if ( promedio >= 13 && por_asis>= 70)
			estado = "Aprobado";
		System.out.println("\n-------------");
		System.out.println("Resultados");
		System.out.println("\n-------------");
		System.out.println("Alumno  : "+name );
		System.out.println("Promedio  : "+df.format(promedio));
		System.out.println("Asistencia  : "+df.format(por_asis) + "%");
		System.out.println("Estado  : "+ estado );
	}
}

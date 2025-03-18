package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudante;

//import entities.Funcionario;

//import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Exercicio1
		/*Retangulo retangulo = new Retangulo();
		
		System.out.println("Enter rectangle width and height:");
		
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		
		System.out.println("AREA = " + String.format("%.2f" ,retangulo.area()));
		System.out.println("PERIMETER = " + String.format("%.2f" ,retangulo.perimeter()));
		System.out.println("DIAGONAL = " + String.format("%.2f" ,retangulo.diagonal()));
		
		*/
		
		//Exercicio2
		/*Funcionario funcionario = new Funcionario();
		
		System.out.println("Name: ");
		funcionario.name = sc.nextLine();
		System.out.println("Gross salary: ");
		funcionario.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		funcionario.tax = sc.nextDouble();
		
		System.out.println(funcionario);
		
		System.out.println("Which percentage to increase salary?");
		double increase = sc.nextDouble();
		funcionario.increaseSalary(increase);
		
		System.out.println(funcionario);
		
		*/
	
		Estudante estudante = new Estudante();
		
		estudante.name = sc.nextLine();
		estudante.nota1 = sc.nextDouble();
		estudante.nota2 = sc.nextDouble();
		estudante.nota3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE = " + String.format("%.2f",estudante.somaNotas()));
		System.out.println(estudante.resultado());
		if(estudante.resultado() == "FAILED") {
			System.out.println("MISSING " + String.format("%.2f",estudante.falhou()) + " POINTS");
		}
		
		sc.close();

	}

}

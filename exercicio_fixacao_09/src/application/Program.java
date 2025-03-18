package application;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Tax payer #" + (i+1) + " data:");
			System.out.print("Individual or company (i/c)? ");
			char tipoPessoa = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			double rendaAnual = sc.nextDouble();
			
			if (tipoPessoa == 'i') {
				System.out.print("Health expenditures: ");
				double gastosSaude = sc.nextDouble();
				
				Pessoa pes = new PessoaFisica(name, rendaAnual, gastosSaude);
				list.add(pes);
			}
			
			if (tipoPessoa == 'c') {
				System.out.print("Number of Employees: ");
				int numFuncionarios = sc.nextInt();
				
				Pessoa pes = new PessoaJuridica(name, rendaAnual, numFuncionarios);
				list.add(pes);
			}
			
		}
		
		
		System.out.println();
		
		System.out.println("TAXES PAID:");
		
		double somataxas = 0;
		
		for (Pessoa pes : list) {
			System.out.println(pes.getNome() + ": $ " + String.format("%.2f", pes.valorImposto()));
			
			double temptaxa = pes.valorImposto();
			somataxas += temptaxa;
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", somataxas));
		
		
		sc.close();
	}

}

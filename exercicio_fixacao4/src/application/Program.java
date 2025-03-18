package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

//import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/* EXERCICIO 01
		int negativos;
		System.out.println("Quantos numeros voce vai digitar?");
		negativos = sc.nextInt();
		int[] vect = new int[negativos]; 
		
		for (int i = 0; i < vect.length && i <= 10; i++) {
			System.out.println("Digite um numero:");
			sc.nextLine();
			vect[i] = sc.nextInt();
		}
		
		System.out.println("NÚMEROS NEGATIVOS:");
		
		for (int i = 0; i < vect.length; i++) {
			
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}*/
		
		/* EXERCICIO 2
		int soma;
		
		System.out.println("Quantos numeros voce vai digitar?");
		soma = sc.nextInt();
		double[] vetor_soma =  new double[soma];
		
		for (int i = 0; i < vetor_soma.length; i++) {
			System.out.println("Digite um numero:");
			vetor_soma[i] = sc.nextDouble();
		}
		
		double soma_valores = 0.00;
		double media = 0.00;
		
		System.out.printf("VALORES = ");
		for (int i = 0; i < vetor_soma.length ; i++) {
			System.out.printf(vetor_soma[i] + "  ");
			
			soma_valores += vetor_soma[i];
			
		}
		
		media = soma_valores / vetor_soma.length;
		
		System.out.println();
		System.out.println("SOMA = " + String.format("%.2f", soma_valores));
		System.out.println("MEDIA = " + media);
		*/
		
		/* EXERCICIO 03
		System.out.println("Quantas pessoas serao digitadas?");
		int qty = sc.nextInt();
		
		Pessoa[] vetor_pessoa = new Pessoa[qty];
		
		double alturas = 0.0;
		int conta = 0;
		
		for (int i = 0; i < vetor_pessoa.length; i++) {
			int atual = i + 1;
			System.out.println("Dados da " + atual + "a pessoa:");
			
			System.out.printf("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.printf("Idade: ");
			int idade = sc.nextInt();
			if(idade < 16) {
				conta += 1;
			}
			System.out.printf("Altura: ");
			double altura = sc.nextDouble();
			alturas += altura;  
			
			
			vetor_pessoa[i] = new Pessoa(name, idade, altura);
			
		}
		
		System.out.println();
		System.out.printf("Altura média: ");
		double alturam = alturas / vetor_pessoa.length;
		System.out.printf("%.2f%n",alturam);
		
		System.out.printf("Pessoas com menos de 16 anos: ");
		double media_menor = conta * 100 / vetor_pessoa.length;
		System.out.printf("%.2f%%%n",media_menor);
		
		for (int i = 0; i < vetor_pessoa.length; i++) {
			
			if (vetor_pessoa[i].getIdade() < 16) {
				System.out.println(vetor_pessoa[i].getName());
			}
			
		}
		*/
		
		/* EXERCICIO 04
		System.out.println("Quantos numeros voce vai digitar?");
		int pares = sc.nextInt();
		int[] vetor_par = new int[pares];
		
		for (int i = 0; i < vetor_par.length; i++) {
			System.out.printf("Digite um numero: ");
			vetor_par[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("NUMEROS PARES:");
		int qtd_par = 0;
		for (int i = 0; i < vetor_par.length; i++) {
			int resto = vetor_par[i] % 2;
			if(resto == 0) {
				System.out.printf("%d  ", vetor_par[i]);
				qtd_par += 1;
			}
		}
		
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + qtd_par);
		*/
		
		/*EXERCICIO 05
		
		System.out.println("Quanros numeros voce vai digitar?");
		int posicao = sc.nextInt();
		double[] vetor_pos = new double[posicao];
		
		for (int i = 0; i < vetor_pos.length; i++) {
			System.out.printf("Digite um numero: ");
			vetor_pos[i] = sc.nextDouble();
		}
		
		double temp_maior = 0.0;
		int pos_maior = 0;
		
		for (int i = 0; i < vetor_pos.length; i++) {
			if(temp_maior < vetor_pos[i]) {
				temp_maior = vetor_pos[i];
				pos_maior = i;
			}	
		}
		
		System.out.println();
		System.out.println("MAIOR VALOR = " + temp_maior);
		System.out.println("POSICAO DO MAIOR VALOR = " + pos_maior);
		*/

		Rent[] rooms = new Rent[10];
		
		System.out.println("How many rooms will be rented?");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Rent#" + i + ":");
			System.out.printf("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.printf("Email: ");
			String email = sc.next();
			System.out.printf("Room: ");
			int roomNumber = sc.nextInt();
			
			rooms[roomNumber] = new Rent(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < 10; i++) {
			if(rooms[i] != null)
			System.out.println(i + ": " + rooms[i]);
		}
		
		sc.close();
	}

}

package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicios_fixacao_02 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*EXERCICIO 1
	
		int negatividade;
		
		negatividade = sc.nextInt();
		
		if (negatividade < 0) {
		
			System.out.println("Negativo");
		
		}else {
		
			System.out.println("Não Negativo");
		
		}
		*/
		
		/* EXERCICIO 2
		
		int parouimpar, resto;
		
		parouimpar = sc.nextInt();
		
		resto = parouimpar % 2;
		
		if (resto != 0) {
			
			System.out.println("Impar");
			
		}else {
			
			System.out.println("Par");
			
		}
		*/
		
		/* EXERCICIO 3 
		
		int x, y, valor;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		if (x > y) {
			valor = x % y;
		}else {
			valor = y % x;
		}
		
		if(valor == 0) {
			System.out.println("São Multiplos");
		}else {
			System.out.println("Não São Multiplos");
		}
		*/
		
		/* EXERCICIO 4 
		
		int horax, horay, duracao, temp;
		
		horax = sc.nextInt();
		horay = sc.nextInt();
		
		if (horax > horay) {
			temp = 24 - horax;
			duracao = temp + horay;
		} else {
			duracao = horay - horax;
		}

		if (horax == horay) {
			duracao = 24;
		}
		
		System.out.printf("O jogo durou %d hora(s)", duracao);
		*/
		/*
		int item, qty;
		double valor;
		
		item = sc.nextInt();
		qty = sc.nextInt();
		
		switch (item) {
		case 1:
			valor = 4.00 * qty;
			break;
		case 2:
			valor = 4.50 * qty;
			break;
		case 3:
			valor = 5.00 * qty;
			break;
		case 4:
			valor = 2.00 * qty;
			break;
		case 5:
			valor = 1.50 * qty;
			break;
		default:
			valor = 0;
			break;
		}

		if(valor != 0) {
			System.out.println("Total: R$ " + valor);
		}else {
			System.out.println("item inserido não existe");
		}*/
		
		/* EXERCICIO 6 */
		
		double intervalo;
		
		intervalo = sc.nextDouble();
		
		if(intervalo <= 25 && intervalo > 0) {
			System.out.println("Intervalo [0,25]");
		}
		
		if(intervalo <= 50 && intervalo > 25) {
			System.out.println("Intervalo [25,50]");
		}
		
		if(intervalo <= 75 && intervalo > 50) {
			System.out.println("Intervalo [50,75]");
		}
		
		if(intervalo <= 100 && intervalo > 75) {
			System.out.println("Intervalo [75,100]");
		}
		
		if(intervalo < 0 || intervalo > 100) {
			System.out.println("Fora do Intervalo");
		}
		
		sc.close();
	}

}

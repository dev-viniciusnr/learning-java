package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicios_fixacao_01 {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/* EXERCICIO 1
		int x, y, valor;
		
		x = sc.nextInt();
		sc.nextLine();
		y = sc.nextInt();
		
		valor = x + y;
		
		System.out.println(valor);
		
		*/
		
		/* EXERCICIO 2
		double raio, pi, formula;
		
		raio = sc.nextDouble();
		pi = 3.14159;
		
		formula = pi * Math.pow(raio, 2) ;
		
		System.out.printf("%.4f", formula);
		
		*/
		
		int a, b, c, d, diferenca;
		
		/* EXERCICIO 3
		a = sc.nextInt();
		sc.nextLine();
		b = sc.nextInt();
		sc.nextLine();
		c = sc.nextInt();
		sc.nextLine();
		d = sc.nextInt();
		sc.nextLine();
		
		diferenca = a * b - c * d;
		
		System.out.println(diferenca);
		*/
		
		/* EXERCICIO 4
		
		int numero, horas;
		double porhora, salario;
		
		numero = sc.nextInt();
		sc.nextLine();
		horas = sc.nextInt();
		sc.nextLine();
		porhora = sc.nextDouble();
		
		salario = horas * porhora;
		
		System.out.println("NUMBER = " + numero);
		System.out.println("SALARY = U$ " + salario);
		
		*/
		
		/* EXERCICIO 5
		int codigo_1, qty_1, codigo_2, qty_2;
		
		double valor_1, valor_2, temp_1, temp_2, valorfinal;
		
		codigo_1 = sc.nextInt();
		qty_1 = sc.nextInt();
		valor_1 = sc.nextDouble();
		
		sc.nextLine();
		
		codigo_2 = sc.nextInt();
		qty_2 = sc.nextInt();
		valor_2 = sc.nextDouble();
		
		temp_1 = qty_1 * valor_1;
		temp_2 = qty_2 * valor_2;
		
		valorfinal = temp_1 + temp_2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorfinal);
		*/
		
		/* EXERCICIO 6 */
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		triangulo = A * C / 2.0;
		circulo = 3.14159 * C * C;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		sc.close();
		
	}
	
}

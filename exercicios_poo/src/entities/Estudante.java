package entities;

public class Estudante {

	public String name;
	public double nota1, nota2, nota3;
	
	public double somaNotas() {
		
		double notafinal = nota1 + nota2 + nota3;
		
		return notafinal;
		
	}
	
	public String resultado() {
		if(somaNotas() >= 60.00) {
			return "PASS";
		}else {
			return "FAILED";
		}
	}
	
	public double falhou() {
		
		double faltando = (somaNotas() - 60) * -1;
		
		return faltando;
		
	}
	
}

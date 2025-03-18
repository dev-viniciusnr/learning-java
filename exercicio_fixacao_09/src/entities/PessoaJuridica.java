package entities;

public class PessoaJuridica extends Pessoa{

	private int numFuncionarios;
	
	public PessoaJuridica() {
	}

	public PessoaJuridica(String nome, Double rendaAnual, int numFuncionarios) {
		super(nome, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}

	public int getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(int numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}
	
	@Override
	public Double valorImposto() {
		
		int taxaImposto = 0;
		double renda = getRendaAnual();
		double valorFinal = 0.0;
		
		if (numFuncionarios > 10) {
			taxaImposto = 14;
		}else{
			taxaImposto = 16;
		}
		
		valorFinal = (renda * taxaImposto) / 100;
		
		return valorFinal;
			
	}
	
}

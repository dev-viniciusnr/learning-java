package entities;

public class PessoaFisica extends Pessoa{

	private Double gastosSaude;
	
	public PessoaFisica() {
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	@Override
	public Double valorImposto() {
		
		int taxaImposto = 0;
		double renda = getRendaAnual();
		double valorFinal = 0.0;
		
		if (renda < 20000.00) {
			taxaImposto = 15;
		}else{
			taxaImposto = 25;
		}
		
		valorFinal = (renda * taxaImposto) / 100;
		
		if (gastosSaude > 0) {
			valorFinal = valorFinal - (gastosSaude/2);
		}
		
		return valorFinal;
		
		
		
	}
	
}

package entities;

public class Funcionario {

	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		
		return grossSalary - tax;
		
	}
	
	public void increaseSalary(double increase) {
		
		double aumento = (grossSalary * increase)/100;
		
		grossSalary += aumento;
		
	}
	
	public String toString() {
		
		String texto = name + ", $ " + String.format("%.2f", netSalary());
		
		return texto;
		
	}
	
	
}

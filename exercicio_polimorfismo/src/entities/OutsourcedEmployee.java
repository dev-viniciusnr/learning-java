package entities;

public class OutsourcedEmployee extends Employee{

	private Double additionalCharge;
	
	public OutsourcedEmployee(){
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerhour, Double additionalCharge) {
		super(name, hours, valuePerhour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public Double payment(){
		return super.payment() + additionalCharge * 1.1;
	}
	
	
	
}

package entities;

public class ImportedProduct extends Product{

	private Double customsFee;
	
	public ImportedProduct() {
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName());
		sb.append(" $ " + String.format("%.2f", totalPrice()));
		sb.append(" (Customs fee: $ " + customsFee + ")");
		
		return sb.toString();
	}
	
	public Double totalPrice() {
		return super.getPrice() + customsFee;
	}
	
}

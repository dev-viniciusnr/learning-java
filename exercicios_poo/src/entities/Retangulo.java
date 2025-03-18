package entities;

public class Retangulo {

	public double width;
	public double height;
	
	public double area() {
		
		double calc_area = width * height;
		
		return calc_area;
		
	}
	
	public double perimeter() {
		
		double calc_perimeter = (width * 2) + (height * 2);
		
		return calc_perimeter;
	
	}
	
	public double diagonal() {
		
		double calc_diagonal = Math.sqrt( (width * width) + (height * height));
		
		return calc_diagonal;
		
	}
	
}

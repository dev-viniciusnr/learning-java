package curso_comdebug;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Main {
	public static void main(String[] args) {
	
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			Triangle x, y;
			x = new Triangle();
			y = new Triangle();
			
			System.out.println("Enter rhe measures of triangle X: ");
			x.a = sc.nextDouble();
			x.b = sc.nextDouble();
			x.c = sc.nextDouble();
			System.out.println("Enter rhe measures of triangle Y: ");
			y.a = sc.nextDouble();
			y.b = sc.nextDouble();
			y.c = sc.nextDouble();
			
			double areaX = x.area();
			double areaY = y.area();
			
			if (areaX > areaY) {
				System.out.println("Larger Area: X");
			}else {
				System.out.println("Larger Area: Y");
			}
			
			
			
			sc.close();
		
	}
}

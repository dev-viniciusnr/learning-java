package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Product #" + (i+1) + " data:");
			System.out.print("Common, used or imported? ");
			char productype = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if (productype == 'c') {
				Product prod = new Product(name, price);
				list.add(prod);
			}
			
			if (productype == 'i') {
				System.out.print("Customs fee: ");
				double customfee = sc.nextDouble();
				Product prod = new ImportedProduct(name, price, customfee);
				list.add(prod);
			}
			
			if (productype == 'u' ) {
				System.out.print("Manufacture date: ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				Product prod = new UsedProduct(name, price, date);
				list.add(prod);
			}
			
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product item : list) {
			System.out.println(item.priceTag());
		}
		
		
		sc.close();
	}

}

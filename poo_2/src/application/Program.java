package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		double price = sc.nextDouble();
		System.out.println("Quantity: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		product.setName("Computer");
		System.out.println("Updated Name: " + product.getName());
		
		product.setPrice(1200.00);
		System.out.println("Updated Price: " + product.getPrice());
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock");
		int qty = sc.nextInt();
		product.removeProducts(qty);
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		
		
		
		sc.close();

	}

}

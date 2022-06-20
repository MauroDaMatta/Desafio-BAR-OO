package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Sexo: ");
		Bill.gender = sc.next().charAt(0);
		System.out.printf("Quantidade de cervejas: ");
		Bill.beer = sc.nextInt();
		System.out.printf("Quantidade de refrigerantes: ");
		Bill.softDrink = sc.nextInt();
		System.out.printf("Quantidade de espetinhos: ");
		Bill.barbecue = sc.nextInt();
		
		System.out.println();
		System.out.printf("Consumo = R$ %.2f%n", Bill.feeding());
		if (Bill.cover() == 4.00) {
			System.out.printf("Couvert = R$ %.2f%n", Bill.cover());
		}
		else {
			System.out.println("Isento de couvert");
		}
		System.out.printf("Ingresso = R$ %.2f%n", Bill.ticket());
		System.out.println();
		System.out.printf("Valor a pagar = R$ %.2f%n", Bill.total());
		
		
		sc.close();
	}

}
